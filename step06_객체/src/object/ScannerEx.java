package object;

import java.io.BufferedReader;
import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		
		// 입력 : BufferedReader : 입력스트림처리, 문자를 있는 그대로 읽어온다(문자열로)
		// 						  버퍼에 저장했다가 사용자가 요청할때마다 리턴해줌 이게 .readline()
		// 		 Scanner		: parse 파싱기능 제공, 별도에 변환을 할 필요가 없음, 
		//						  BufferedReader 보다 조금 늦음, 대신 편하게 사용 가능
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 : ");	String str = sc.nextLine();
		System.out.print("정수 : ");		int a = sc.nextInt();
		System.out.print("실수 : ");		double b = sc.nextDouble();
		System.out.print("문자 : ");		char c = sc.next().charAt(0);
		
		System.out.println(str);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		sc.close();		
	}
}