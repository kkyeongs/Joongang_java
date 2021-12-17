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
	
	// 1. �������� ����-----
	ServerSocket ss=null;
	// 1. -----
	// 4. ���� ���� ����-----
	Vector<ChatHandle> inwon=null; // ���� �ο� ī��Ʈ �ϴ� ����
	// 4. -----
	
	public GUIChatServer()
	{
		super("Chatting Server");
		
		txt_list = new TextArea();
		btn_exit = new JButton("��������");
		jp=new JScrollPane(txt_list, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		
		add(jp , "Center");
		add(btn_exit,"South");
		setSize(250,250);
		setVisible(true);
		//�̺�Ʈó��-----------------------
		super.setDefaultCloseOperation(EXIT_ON_CLOSE);
		btn_exit.addActionListener(this);
		//----------------------------------
		// 4. ����(�ο�����) �ʱ�ȭ-----
		inwon=new Vector<ChatHandle>(); // ����)�ݵ�� serverStart()���� ���� ����
		// 4. end-----
		serverStart();
	}
	
	public void serverStart()
	{	
		// 1. ----- ���� ����
		final int PORT=7500;
		
		try{
			ss=new ServerSocket(PORT);
			while(true)
			{
				Socket sock=ss.accept();
				String str=sock.getInetAddress().getHostAddress();
				txt_list.append(str);
				// 4. ����ó���� ���� Ŭ���̾�Ʈ ��ü ����(����� ���� Ŭ����)
				ChatHandle ch=new ChatHandle(this, sock);
				// ���� ���� �۾�..
				inwon.add(ch);	// �������� inwon �����ϱ�
				ch.start();
				// 4. end-----
			}
		}catch(IOException e){e.printStackTrace();}
		// 1. ----- ���� ��
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

//4. ����� ���� Ŭ���� ���� -- ����ó����
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
			server.setMsg("["+nickname+"]���� �����ϼ̽��ϴ�\n"); // ���� ȭ�鿡 ���
			
			// 4. Ŭ���̾�Ʈ���� �������� �г��� ����..
			broadcast("["+nickname+"]���� �����ϼ̽��ϴ�\n");
			// 4. end-----
			
			// 6. ��ȭ ���� �� �۽�
			while(true) {
				String text=br.readLine(); // ���Ź��� ���ڿ��� ������ ����
				server.setMsg(nickname+":"+text+"\n"); // �����ʿ� ���
				broadcast(nickname+":"+text+"\n"); // Ŭ���̾�Ʈ�ʿ� ���
			}
			// 6. end-----
			
		} catch (IOException e) {e.printStackTrace();}
		finally {
			// 6. ��� ó��
			synchronized (server.inwon) {
				server.inwon.remove(this);
				server.setMsg("["+nickname+"]���� �����ϼ̽��ϴ�\n");
				broadcast("["+nickname+"]���� �����ϼ̽��ϴ�\n");
			}
			// 6. end-----
		}
	}

	// 5. ��� �����ڿ��� �޼��� ������
	public void broadcast(String string) {
		// ����ȭó�� : �����ڰ�ü�� ��������� ����.. 
		// �����ڰ�ü�� Ư�� ������ �ڱ� ȥ�ڼ� ����(����ȭ ��)ó���� �����ϵ��� ���ִ� �۾�
		synchronized (server.inwon) { // ����ȭ ��, ������ ����
			int s=server.inwon.size(); // ������ ��ü�� ��
			for (int i = 0; i < s; i++) {
				ChatHandle ch=server.inwon.elementAt(i);
				ch.pw.println(string);
				ch.pw.flush();
				
			}
		}
	}
	
}





























