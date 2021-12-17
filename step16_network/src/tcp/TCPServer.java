package tcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {

	final static int PORT=7100;
	
	public static void main(String[] args) {
		
		try {
			ServerSocket ss = new ServerSocket(PORT); // �������� ����
			System.out.println("���� �����...");
			
			while(true) {
				Socket sock=ss.accept(); // ���� ��û ����
				
				// ��Ʈ��ũ���� ���� �����͸� �б�
				InputStream is=sock.getInputStream();
				BufferedReader br=new BufferedReader(new InputStreamReader(is));
				
				// �ַܼ� ���, �о�� �����͸� ȭ�鿡 ����ϱ�
				PrintStream ps=new PrintStream(System.out);
				ps.print(sock.getInetAddress().getHostAddress());
				ps.println("���� ���ŵ� �޼��� : "+br.readLine()+"\n");
			}
		} catch (IOException e) {e.printStackTrace();}
	}
}