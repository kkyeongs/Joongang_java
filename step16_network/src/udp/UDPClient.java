package udp;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPClient {

	public static void main(String[] args) {
		
		final int PORT=8888;
		String server_ip, msg;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		PrintStream ps=new PrintStream(System.out);
		
		try {
			ps.print("접속할 서버 ip 주소 입력 : ");		server_ip=br.readLine();
			
			while(true) {
				ps.print("\n전송할 메시지 : ");	msg=br.readLine();
				
				DatagramSocket ds=new DatagramSocket();
				InetAddress ip=InetAddress.getByName(server_ip);
				
				byte[] buf=msg.getBytes(); // 입력한 메시지를 바이트배열로 생성
				DatagramPacket dp=		 //데이터, 길이,	 서버주소, 포트
						new DatagramPacket(buf, buf.length, ip, PORT);
				
				ds.send(dp);
				ps.print(server_ip+"에 메시지 전송 성공...");
			} 
		} catch (IOException e) {e.printStackTrace();}
		finally {
			try {br.close(); ps.close();} catch (IOException e) {e.printStackTrace();}
		}
	}
}