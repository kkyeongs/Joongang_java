package chat;
import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Vector;

import javax.swing.*;

public class GUIChatServer extends JFrame implements ActionListener{
	TextArea txt_list;
	JButton btn_exit;
	JScrollPane jp;
	
	// 1. 서버소켓 생성-----
	ServerSocket ss=null;
	// 1. -----
	// 4. 벡터 변수 생성-----
	Vector<ChatHandle> inwon=null; // 접속 인원 카운트 하는 변수
	// 4. -----
	
	public GUIChatServer()
	{
		super("Chatting Server");
		
		txt_list = new TextArea();
		btn_exit = new JButton("서버종료");
		jp=new JScrollPane(txt_list, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		
		add(jp , "Center");
		add(btn_exit,"South");
		setSize(250,250);
		setVisible(true);
		//이벤트처리-----------------------
		super.setDefaultCloseOperation(EXIT_ON_CLOSE);
		btn_exit.addActionListener(this);
		//----------------------------------
		// 4. 벡터(인원변수) 초기화-----
		inwon=new Vector<ChatHandle>(); // 주의)반드시 serverStart()보다 먼저 동작
		// 4. end-----
		serverStart();
	}
	
	public void serverStart()
	{	
		// 1. ----- 서버 시작
		final int PORT=7500;
		
		try{
			ss=new ServerSocket(PORT);
			while(true)
			{
				Socket sock=ss.accept();
				String str=sock.getInetAddress().getHostAddress();
				txt_list.append(str);
				// 4. 병행처리를 위한 클라이언트 객체 생성(사용자 정의 클래스)
				ChatHandle ch=new ChatHandle(this, sock);
				// 벡터 생성 작업..
				inwon.add(ch);	// 전역변수 inwon 선언하기
				ch.start();
				// 4. end-----
			}
		}catch(IOException e){e.printStackTrace();}
		// 1. ----- 서버 끝
	}
	
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btn_exit)
			System.exit(0);
	}
	
	public void setMsg(String str) {
		txt_list.append(str);
	}
	
	public static void main(String[] args) {
		new GUIChatServer();
	}

}

//4. 사용자 정의 클래스 생성 -- 병행처리용
class ChatHandle extends Thread {
	GUIChatServer server;
	Socket sock;
	BufferedReader br=null;
	PrintWriter pw=null;
	
	public ChatHandle(GUIChatServer sever, Socket sock) {
		this.server=sever;
		this.sock=sock;
		try {
			InputStream is = sock.getInputStream();
			br=new BufferedReader(new InputStreamReader(is));
			OutputStream os= sock.getOutputStream();
			pw=new PrintWriter(new OutputStreamWriter(os));
		} catch (IOException e) {e.printStackTrace();}
	}
	
	@Override
	public void run() {
		String nickname=null;
		try {
			nickname=br.readLine();
			server.setMsg("["+nickname+"]님이 입장하셨습니다\n"); // 서버 화면에 출력
			
			// 4. 클라이언트측에 접속자의 닉네임 전송..
			broadcast("["+nickname+"]님이 입장하셨습니다\n");
			// 4. end-----
			
			// 6. 대화 수신 및 송신
			while(true) {
				String text=br.readLine(); // 수신받은 문자열을 변수에 저장
				server.setMsg(nickname+":"+text+"\n"); // 서버쪽에 출력
				broadcast(nickname+":"+text+"\n"); // 클라이언트쪽에 출력
			}
			// 6. end-----
			
		} catch (IOException e) {e.printStackTrace();}
		finally {
			// 6. 퇴실 처리
			synchronized (server.inwon) {
				server.inwon.remove(this);
				server.setMsg("["+nickname+"]님이 퇴장하셨습니다\n");
				broadcast("["+nickname+"]님이 퇴장하셨습니다\n");
			}
			// 6. end-----
		}
	}

	// 5. 모든 접속자에게 메세지 보내기
	public void broadcast(String string) {
		// 동기화처리 : 접속자객체가 만들어지는 시점.. 
		// 접속자객체가 특정 시점에 자기 혼자서 업무(동기화 블럭)처리가 가능하도록 해주는 작업
		synchronized (server.inwon) { // 동기화 블럭, 과부하 예방
			int s=server.inwon.size(); // 접속자 객체의 수
			for (int i = 0; i < s; i++) {
				ChatHandle ch=server.inwon.elementAt(i);
				ch.pw.println(string);
				ch.pw.flush();
				
			}
		}
	}
	
}





























