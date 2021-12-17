package udp;

import java.io.IOException;
import java.io.PrintStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

import javax.sound.sampled.Port;

public class UDPServer {

	public static void main(String[] args) {
		final int PORT=8888;
		final int BUFFER=50;
		String message;
		
		PrintStream ps=new PrintStream(System.out);
		
		try {
			DatagramSocket ds=new DatagramSocket(PORT);
			ps.print("���� �����...");
			
			while(true) {
				byte[] buf=new byte[BUFFER];
				DatagramPacket dp=new DatagramPacket(buf, buf.length);
				ds.receive(dp);
				
				message=new String(dp.getData());
				ps.print("\n���� ������ : "+message);
				ps.flush();
				message="";
			}
		} catch (SocketException e) {e.printStackTrace();} catch (IOException e) {e.printStackTrace();}
		ps.close();
		
		
		
		
		
	}
}