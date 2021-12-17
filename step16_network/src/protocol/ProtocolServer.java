package protocol;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ProtocolServer {
	
	ServerSocket ss=null;
	Socket sock=null;
	BufferedReader br=null;
	BufferedWriter bw=null;
	
	public ProtocolServer() throws IOException {
		ss=new ServerSocket(7000);
		System.out.println("���� �����...");
		sock=ss.accept();
		
		br=new BufferedReader(new InputStreamReader(sock.getInputStream()));
		bw=new BufferedWriter(new OutputStreamWriter(sock.getOutputStream()));
		
		while(true) {
			String buf=br.readLine();
			String[] word=buf.split(":");	// �о�� ���ڿ��� ������(:)�� �и�
											// a:b ��� a��[0] b��[1] �̷������� ����
			
			if(word[0].equals(Protocol.Enter)) { // ����ó��
				enter(word);
			} else if(word[0].equals(Protocol.Exit)) {
				exit(word);
			} else if(word[0].equals(Protocol.SEND_MESSAGE)) {
				sendMessage(word);
			} else if(word[0].equals(Protocol.SECRET_MESSAGE)) {
				secretMessage(word);
			} else {
				bw.write("�߸��� ��û�Դϴ�\n");
				bw.flush();
			}
		}
	}
	
	private void secretMessage(String[] word) {
		// 400:���̵�1:���̵�2:�޼���
		System.out.println("***["+word[1]+"]���� ["+word[2]+"]�Կ��� �ӼӸ��� ����***");
	}

	private void sendMessage(String[] word) {
		// 300:���̵�:�޼���
		System.out.println("["+word[1]+"]"+word[2]+"\n");
	}

	private void exit(String[] word) {
		// 200:���̵�
		System.out.println("["+word[1]+"]���� �����ϼ̽��ϴ�\n");
	}

	public void enter(String[] word) {
		// 100:���̵�
		System.out.println("["+word[1]+"]���� �����ϼ̽��ϴ�\n");
	}
	
	
	
	public static void main(String[] args) throws IOException {
		// �������� : ���۱Ծ�
		// 100:���̵�			==> ����
		// 200:���̵�			==> ����
		// 300:���̵�			==> ������ ����ڿ��� �޽��� ����
		// 400:���̵�1:���̵�2:�޽��� ==> ���̵�1�� ���̵�2���� �Ӹ�
		
		new ProtocolServer();
	}
}