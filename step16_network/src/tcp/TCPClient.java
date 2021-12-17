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
			ps.print("접속할 ip 주소를 입력하세요 : ");
			server_ip=br.readLine();
			
			while(true) {
				Socket sock=new Socket(server_ip, PORT); // 서버에 접속 시도
				
				// 네트워크로 데이터 전송
				OutputStream os=sock.getOutputStream();
				BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(os));
				
				ps.print("\n전송할 메시지 입력 : ");
				String str=br.readLine();
				
				bw.write(str, 0, str.length());
				bw.flush();
				ps.println(server_ip+"에 메세지 전송"); // 서버 화면에 띄우는거
				
				bw.close();
				sock.close();
				
				// 클라이언트 종료 조건
				if(str.equals("exit")) {
					System.out.println("접속을 종료합니다");
					System.exit(0);
				}
			}
			
			
		} catch (IOException e) {e.printStackTrace();}
	}

}


//// 네트워크를 통해 데이터 전송
//OutputStream os=sock.getOutputStream();
//BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(os));
////OutputStreamWriter writer=new OutputStreamWriter(os);
//
//ps.print("전송할 메세지를 입력하세요 : ");
//String str=br.readLine();
//
//bw.write(str, 0, str.length());
//bw.flush();
//
//ps.println(server_ip+"에 메세지 전송");
//
//// 클라이언트측의 접속 종료 조건
//if(str.equals("/exit")) {
//	System.out.println("접속을 종료합니다");
//	System.exit(0);
//}