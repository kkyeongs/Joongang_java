package network;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class InetAddressEx2 {

	public static void main(String[] args) throws UnknownHostException {
		
		Scanner sc=new Scanner(System.in);
		String host=null;
		System.out.print("홈페이지 주소 : ");
		host=sc.nextLine();
		
		InetAddress[] addr=InetAddress.getAllByName(host);
		System.out.println(host+"는 "+addr.length+"개의 ip주소를 갖고 있어요");
		
		for (int i = 0; i < addr.length; i++) {
			System.out.println((i+1)+"번째의 ip주소는 "+addr[i].getHostAddress());
		}
		sc.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}