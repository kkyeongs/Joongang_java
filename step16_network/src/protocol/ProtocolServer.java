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
		System.out.println("접속 대기중...");
		sock=ss.accept();
		
		br=new BufferedReader(new InputStreamReader(sock.getInputStream()));
		bw=new BufferedWriter(new OutputStreamWriter(sock.getOutputStream()));
		
		while(true) {
			String buf=br.readLine();
			String[] word=buf.split(":");	// 읽어온 문자열을 구분자(:)로 분리
											// a:b 라면 a는[0] b는[1] 이런식으로 저장
			
			if(word[0].equals(Protocol.Enter)) { // 입장처리
				enter(word);
			} else if(word[0].equals(Protocol.Exit)) {
				exit(word);
			} else if(word[0].equals(Protocol.SEND_MESSAGE)) {
				sendMessage(word);
			} else if(word[0].equals(Protocol.SECRET_MESSAGE)) {
				secretMessage(word);
			} else {
				bw.write("잘못된 요청입니다\n");
				bw.flush();
			}
		}
	}
	
	private void secretMessage(String[] word) {
		// 400:아이디1:아이디2:메세지
		System.out.println("***["+word[1]+"]님이 ["+word[2]+"]님에게 귓속말을 보냄***");
	}

	private void sendMessage(String[] word) {
		// 300:아이디:메세지
		System.out.println("["+word[1]+"]"+word[2]+"\n");
	}

	private void exit(String[] word) {
		// 200:아이디
		System.out.println("["+word[1]+"]님이 퇴장하셨습니다\n");
	}

	public void enter(String[] word) {
		// 100:아이디
		System.out.println("["+word[1]+"]님이 입장하셨습니다\n");
	}
	
	
	
	public static void main(String[] args) throws IOException {
		// 프로토콜 : 전송규약
		// 100:아이디			==> 입장
		// 200:아이디			==> 퇴장
		// 300:아이디			==> 접속한 사용자에게 메시지 전달
		// 400:아이디1:아이디2:메시지 ==> 아이디1이 아이디2에게 귓말
		
		new ProtocolServer();
	}
}