package protocol;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class ProtocolClient {

	Socket sock=null;
	BufferedReader keyboard=null;
	BufferedReader br=null;
	BufferedWriter bw=null;
	
	public ProtocolClient() {
		try {
			sock=new Socket("127.0.0.1", 7000);
		} catch (UnknownHostException e) {
			System.out.println("서버를 찾을 수 없습니다");
			e.printStackTrace();
			System.exit(0);
		} catch (IOException e) {
			System.out.println("서버와 연결할 수 없습니다");
			e.printStackTrace();
			System.exit(0);
		}
//		-----------------------------
//		키보드와 연결된 스트림
		try {
			keyboard=new BufferedReader(new InputStreamReader(System.in));
			br=new BufferedReader(new InputStreamReader(sock.getInputStream()));
			bw=new BufferedWriter(new OutputStreamWriter(sock.getOutputStream()));
			
			while(true) {
				// 메시지를 입력받아 서버로 전송
				System.out.println("ex)100:아이디(입장), 200:아이디(퇴장), 300:아이디:메시지(대화), 400:아이디1:아이디2:메시지(귓속말)");
				System.out.println("메세지를 입력하세요 : ");
				
				String msg=keyboard.readLine();
				bw.write(msg+"\n");
				bw.flush();
			}
		} catch(IOException e) {e.printStackTrace();}
	}
	
	public static void main(String[] args) {
		
		new ProtocolClient();
	}
}

























