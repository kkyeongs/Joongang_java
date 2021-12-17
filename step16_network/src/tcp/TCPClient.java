 package tcp;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.Writer;
import java.net.Socket;

public class TCPClient {

	final static int PORT=7100;
	
	public static void main(String[] args) {
		String server_ip;
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		PrintStream ps=new PrintStream(System.out);
		
		try {
			ps.print("������ ip �ּҸ� �Է��ϼ��� : ");
			server_ip=br.readLine();
			
			while(true) {
				Socket sock=new Socket(server_ip, PORT); // ������ ���� �õ�
				
				// ��Ʈ��ũ�� ������ ����
				OutputStream os=sock.getOutputStream();
				BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(os));
				
				ps.print("\n������ �޽��� �Է� : ");
				String str=br.readLine();
				
				bw.write(str, 0, str.length());
				bw.flush();
				ps.println(server_ip+"�� �޼��� ����"); // ���� ȭ�鿡 ���°�
				
				bw.close();
				sock.close();
				
				// Ŭ���̾�Ʈ ���� ����
				if(str.equals("exit")) {
					System.out.println("������ �����մϴ�");
					System.exit(0);
				}
			}
			
			
		} catch (IOException e) {e.printStackTrace();}
	}

}


//// ��Ʈ��ũ�� ���� ������ ����
//OutputStream os=sock.getOutputStream();
//BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(os));
////OutputStreamWriter writer=new OutputStreamWriter(os);
//
//ps.print("������ �޼����� �Է��ϼ��� : ");
//String str=br.readLine();
//
//bw.write(str, 0, str.length());
//bw.flush();
//
//ps.println(server_ip+"�� �޼��� ����");
//
//// Ŭ���̾�Ʈ���� ���� ���� ����
//if(str.equals("/exit")) {
//	System.out.println("������ �����մϴ�");
//	System.exit(0);
//}