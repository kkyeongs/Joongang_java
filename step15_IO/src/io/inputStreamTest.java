package io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class inputStreamTest {

	public static void main(String[] args) throws IOException {
		
//		1. ����Ʈ ��Ʈ��, �ѱ� ó�� �Ұ�
//		System.out.println("Input string : ");
//		
//		char ch='\0';
//		while(ch!='\n') { // ���Ͱ� �Էµ��� ���� ����
//			ch=(char) System.in.read(); // ����Ʈ ��Ʈ�� ó��
//			System.out.print(ch);
//		}
		
//		System.out.println("Input string : ");
//		
//		int ch=0;
//		while(ch!=-1) { // ���Ͱ� �Էµ��� ���� ����
//			ch=(char) System.in.read(); // ����Ʈ ��Ʈ�� ó��
//			System.out.print(ch);
//		}
		
//		2. ����(character) ��Ʈ��, �ѱ� ó�� ����, �ӵ��� ����
//		InputStreamReader isr=new InputStreamReader(System.in);
//		System.out.print("Input string : ");
//		
//		char ch1='\0';
//		while(ch1!='\n') { // ���Ͱ� �Էµ��� ���� ����
//			ch1=(char) isr.read(); // ����Ʈ ��Ʈ�� ó��
//			System.out.print(ch1);
//		}
//		isr.close();
		
//		InputStreamReader isr=new InputStreamReader(System.in);
//		System.out.print("Input string : ");
//		
//		int ch=0;
//		while(ch!='\n') { // ���Ͱ� �Էµ��� ���� ����
//			ch=isr.read(); // ����Ʈ ��Ʈ�� ó��
//			System.out.println(ch);
//		}
//		isr.close();
		
//		3. ���۽�Ʈ��, �ӵ��� ����
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		System.out.print("Input string : ");
		String str=br.readLine();
		System.out.println(str);
		br.close(); isr.close();
		
	}
}

























