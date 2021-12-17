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
	
	// 1. ���� ���� ����
	String ip_txt;	// ip�ּҸ� ������ ����
	Socket sock;	// ������ ���ε�
	final int PORT=7500;
	PrintWriter pw=null;
	BufferedReader br=null;
	// 1. end------
	// 3. �۽Ž�Ʈ�� ����, �г������� �� ����������
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
		cardPane.add(connectPane,"����â");
		cardPane.add(chatPane,"ä��â");
		card.show(cardPane, "����â");
		//----------------------------------
		add(cardPane);
		setSize(400,300);
		setVisible(true);
		super.setDefaultCloseOperation(EXIT_ON_CLOSE);
		//�̺�Ʈó��-----------------------
		// �̺�Ʈ ������ : �̺�Ʈ�� �����ϴ� ���� �����ϴ� �޼���
		// �̺�Ʈ �����ʰ� �̺�Ʈ�� ������ ��� ������ �޼���� �̵� --> ���⼭�� �׼�������
		btn_connect.addActionListener(this);
		btn_exit.addActionListener(this);
		btn_send.addActionListener(this);	// ���۹�ư �̺�Ʈ ó��
		txt_input.addActionListener(this);	// �Է�â ���� �̺�Ʈ ó��
		//----------------------------------
	}
	public void ConnectPane()
	{
		connectPane = new JPanel();
		JPanel pn=new JPanel();
		JPanel pn1 = new JPanel();
		JPanel pn2 = new JPanel();
		
		msg = new JLabel("IP�� ��ȭ���� �Է��Ͻÿ�");
		msg.setFont(new Font("����ü", Font.BOLD, 15));
		msg.setForeground(Color.magenta);
		
		JLabel lb1 = new JLabel("���� I P : ");
		txt_server_ip = new JTextField("localhost", 15);
		pn1.add(lb1);    pn1.add(txt_server_ip);
		
		JLabel lb2 = new JLabel("�� ȭ �� : ");
		txt_name = new JTextField("ĵ��",15);		
		pn2.add(lb2);    pn2.add(txt_name);
		
		pn.add(pn1);     pn.add(pn2);    pn.add(msg);
		
		btn_connect = new JButton("Connection");
		
		connectPane.setBorder(BorderFactory.createTitledBorder("����ä��ȭ��"));
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
		btn_send = new JButton("����");
		btn_exit = new JButton("����");

		pn.setBorder(BorderFactory.createTitledBorder("�ٴ�ȭ�ϱ��"));
		chatPane.setBorder(BorderFactory.createTitledBorder("��ä�ó����"));
		pn.add(txt_input);   pn.add(btn_send);  pn.add(btn_exit);
		
		chatPane.setLayout(new BorderLayout());
		chatPane.add(txt_list, "Center");
		chatPane.add(pn, "South");
	}

	public void actionPerformed(ActionEvent e) {
		Object ob = e.getSource();
		if(ob == btn_connect)
		{
			card.show(cardPane, "ä��â");
			// 1. --- ���� ���� �� ������ ����
			ip_txt=txt_server_ip.getText();	// �Է��ص� ���� �ּ� ���
			Thread th=new Thread(this);
			th.start();
			// 1. --- end
		}
		// 5. txt_input �Ǵ� btn_send�� �̿��Ͽ� �޼����� ������ ����
		if(ob==txt_input || ob==btn_send) {	// ���� �Ǵ� ���۹�ư Ŭ����..
			String text=txt_input.getText(); // ��ȭ �Է�â�� �޼����� ���ڿ��� ����
			if(text.trim().equals("")) { // �������
				txt_input.setText("");
				return;
			}
			pw.println(text); // ������ ������ ������
			pw.flush();
			txt_input.setText("");	// �Է�â�� ������ ����(�ʱ�ȭ)
			txt_input.requestFocus(); // Ŀ���� txt_input�� ��ġ�� �̵�
		}
		
		
		if(ob ==btn_exit)
			System.exit(0);
	}
	
	@Override
	public void run() {
		try {
			sock=new Socket(ip_txt, PORT);
			
			// 3. �г��� �����ϱ� -----
			String nickname=txt_name.getText();
			os=sock.getOutputStream();
			pw=new PrintWriter(new OutputStreamWriter(os));
			pw.println(nickname); // ����) �ݵ�� println���
			pw.flush();
			// 3. end -----
			// 5. �������� ������ ���� ����� �г����� ȭ�鿡 ���(����)-----
			InputStream is=sock.getInputStream();
			br=new BufferedReader(new InputStreamReader(is));
			
			String str;
			while(true) {
				try {
					str=br.readLine();
					txt_list.append(str+"\n");
				} catch (Exception e) {txt_list.append("������ �����"); return;} 
			}
			// 5. end -----
		} catch (UnknownHostException e) {e.printStackTrace();} 
		catch (IOException e) {e.printStackTrace();}
		
		
	}
	
	public static void main(String[] args) {
		new GUIChatClient();
	}
	
	
	
	
	
}








