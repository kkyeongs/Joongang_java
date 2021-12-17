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
			ServerSocket ss = new ServerSocket(PORT); // 서버소켓 생성
			System.out.println("접속 대기중...");
			
			while(true) {
				Socket sock=ss.accept(); // 접속 요청 수락
				
				// 네트워크에서 들어온 데이터를 읽기
				InputStream is=sock.getInputStream();
				BufferedReader br=new BufferedReader(new InputStreamReader(is));
				
				// 콘솔로 출력, 읽어온 데이터를 화면에 출력하기
				PrintStream ps=new PrintStream(System.out);
				ps.print(sock.getInetAddress().getHostAddress());
				ps.println("에서 수신된 메세지 : "+br.readLine()+"\n");
			}
		} catch (IOException e) {e.printStackTrace();}
	}
}