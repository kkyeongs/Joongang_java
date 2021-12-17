package network;

import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;

public class InetAddressEx1 {

	public static void main(String[] args) throws UnknownHostException, MalformedURLException {
		
		InetAddress addr1=InetAddress.getByName("google.co.kr");
		InetAddress addr2=InetAddress.getLocalHost();
		URL url=new URL("http://127.0.0.1:9000");
		
		System.out.println("addr1 : "+addr1);
		System.out.println("addr1 : "+addr1.getHostAddress());
		System.out.println("addr1 : "+addr1.getHostName());
		
		System.out.println("addr1 : "+addr2);
		System.out.println("addr1 : "+addr2.getHostAddress());
		System.out.println("addr1 : "+addr2.getHostName());
		
		System.out.println("protocol : "+url.getProtocol());
		System.out.println("port : "+url.getPort());
	}
}