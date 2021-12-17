package io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class inputStreamTest {

	public static void main(String[] args) throws IOException {
		
//		1. 바이트 스트림, 한글 처리 불가
//		System.out.println("Input string : ");
//		
//		char ch='\0';
//		while(ch!='\n') { // 엔터가 입력되지 않은 동안
//			ch=(char) System.in.read(); // 바이트 스트림 처리
//			System.out.print(ch);
//		}
		
//		System.out.println("Input string : ");
//		
//		int ch=0;
//		while(ch!=-1) { // 엔터가 입력되지 않은 동안
//			ch=(char) System.in.read(); // 바이트 스트림 처리
//			System.out.print(ch);
//		}
		
//		2. 문자(character) 스트림, 한글 처리 가능, 속도가 느림
//		InputStreamReader isr=new InputStreamReader(System.in);
//		System.out.print("Input string : ");
//		
//		char ch1='\0';
//		while(ch1!='\n') { // 엔터가 입력되지 않은 동안
//			ch1=(char) isr.read(); // 바이트 스트림 처리
//			System.out.print(ch1);
//		}
//		isr.close();
		
//		InputStreamReader isr=new InputStreamReader(System.in);
//		System.out.print("Input string : ");
//		
//		int ch=0;
//		while(ch!='\n') { // 엔터가 입력되지 않은 동안
//			ch=isr.read(); // 바이트 스트림 처리
//			System.out.println(ch);
//		}
//		isr.close();
		
//		3. 버퍼스트림, 속도가 빠름
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		System.out.print("Input string : ");
		String str=br.readLine();
		System.out.println(str);
		br.close(); isr.close();
		
	}
}

























