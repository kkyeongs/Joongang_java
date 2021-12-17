package chat;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class GUIChatClient extends JFrame implements ActionListener,Runnable{
	JPanel cardPane, connectPane, chatPane;
	JLabel  msg;
	JButton btn_connect, btn_send, btn_exit;
	JTextField txt_server_ip, txt_name, txt_input;
	JTextArea txt_list;
	CardLayout card;
	
	// 1. 접속 정보 설정
	String ip_txt;	// ip주소를 저장할 변수
	Socket sock;	// 서버와 바인딩
	final int PORT=7500;
	PrintWriter pw=null;
	BufferedReader br=null;
	// 1. end------
	// 3. 송신스트림 생성, 닉네임전송 및 데이터전송
	OutputStream os=null;
	
	public GUIChatClient()
	{
		super("Chatting Client(ver"
				+ " 1.0)");
		
		ConnectPane();
		ChatPane();
		
		//card-----------------------------
		cardPane = new JPanel();
		card = new CardLayout();
		cardPane.setLayout(card);
		cardPane.add(connectPane,"접속창");
		cardPane.add(chatPane,"채팅창");
		card.show(cardPane, "접속창");
		//----------------------------------
		add(cardPane);
		setSize(400,300);
		setVisible(true);
		super.setDefaultCloseOperation(EXIT_ON_CLOSE);
		//이벤트처리-----------------------
		// 이벤트 리스너 : 이벤트가 동작하는 것을 감지하는 메서드
		// 이벤트 리스너가 이벤트를 감지할 경우 지정한 메서드로 이동 --> 여기서는 액션퍼폼드
		btn_connect.addActionListener(this);
		btn_exit.addActionListener(this);
		btn_send.addActionListener(this);	// 전송버튼 이벤트 처리
		txt_input.addActionListener(this);	// 입력창 엔터 이벤트 처리
		//----------------------------------
	}
	public void ConnectPane()
	{
		connectPane = new JPanel();
		JPanel pn=new JPanel();
		JPanel pn1 = new JPanel();
		JPanel pn2 = new JPanel();
		
		msg = new JLabel("IP와 대화명을 입력하시오");
		msg.setFont(new Font("굴림체", Font.BOLD, 15));
		msg.setForeground(Color.magenta);
		
		JLabel lb1 = new JLabel("서버 I P : ");
		txt_server_ip = new JTextField("localhost", 15);
		pn1.add(lb1);    pn1.add(txt_server_ip);
		
		JLabel lb2 = new JLabel("대 화 명 : ");
		txt_name = new JTextField("캔디",15);		
		pn2.add(lb2);    pn2.add(txt_name);
		
		pn.add(pn1);     pn.add(pn2);    pn.add(msg);
		
		btn_connect = new JButton("Connection");
		
		connectPane.setBorder(BorderFactory.createTitledBorder("다중채팅화면"));
		connectPane.setLayout(new BorderLayout());
		connectPane.add(pn,"Center");
		connectPane.add(btn_connect,"South");
	}
	public void ChatPane()
	{
		chatPane = new JPanel();
		JPanel  pn = new JPanel();
		txt_list = new JTextArea();
		txt_input = new JTextField("",20);
		btn_send = new JButton("전송");
		btn_exit = new JButton("종료");

		pn.setBorder(BorderFactory.createTitledBorder("☆대화하기☆"));
		chatPane.setBorder(BorderFactory.createTitledBorder("♣채팅내용♣"));
		pn.add(txt_input);   pn.add(btn_send);  pn.add(btn_exit);
		
		chatPane.setLayout(new BorderLayout());
		chatPane.add(txt_list, "Center");
		chatPane.add(pn, "South");
	}

	public void actionPerformed(ActionEvent e) {
		Object ob = e.getSource();
		if(ob == btn_connect)
		{
			card.show(cardPane, "채팅창");
			// 1. --- 서버 접속 및 쓰레드 생성
			ip_txt=txt_server_ip.getText();	// 입력해둔 서버 주소 취득
			Thread th=new Thread(this);
			th.start();
			// 1. --- end
		}
		// 5. txt_input 또는 btn_send를 이용하여 메세지를 서버로 전송
		if(ob==txt_input || ob==btn_send) {	// 엔터 또는 전송버튼 클릭시..
			String text=txt_input.getText(); // 대화 입력창의 메세지를 문자열로 저장
			if(text.trim().equals("")) { // 도배금지
				txt_input.setText("");
				return;
			}
			pw.println(text); // 서버로 데이터 보내기
			pw.flush();
			txt_input.setText("");	// 입력창의 내용을 지움(초기화)
			txt_input.requestFocus(); // 커서를 txt_input의 위치로 이동
		}
		
		
		if(ob ==btn_exit)
			System.exit(0);
	}
	
	@Override
	public void run() {
		try {
			sock=new Socket(ip_txt, PORT);
			
			// 3. 닉네임 전송하기 -----
			String nickname=txt_name.getText();
			os=sock.getOutputStream();
			pw=new PrintWriter(new OutputStreamWriter(os));
			pw.println(nickname); // 주의) 반드시 println사용
			pw.flush();
			// 3. end -----
			// 5. 서버에서 보내준 접속 사용자 닉네임을 화면에 출력(수신)-----
			InputStream is=sock.getInputStream();
			br=new BufferedReader(new InputStreamReader(is));
			
			String str;
			while(true) {
				try {
					str=br.readLine();
					txt_list.append(str+"\n");
				} catch (Exception e) {txt_list.append("서버가 종료됨"); return;} 
			}
			// 5. end -----
		} catch (UnknownHostException e) {e.printStackTrace();} 
		catch (IOException e) {e.printStackTrace();}
		
		
	}
	
	public static void main(String[] args) {
		new GUIChatClient();
	}
	
	
	
	
	
}








