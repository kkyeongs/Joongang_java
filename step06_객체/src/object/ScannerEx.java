package object;

import java.io.BufferedReader;
import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		
		// �Է� : BufferedReader : �Է½�Ʈ��ó��, ���ڸ� �ִ� �״�� �о�´�(���ڿ���)
		// 						  ���ۿ� �����ߴٰ� ����ڰ� ��û�Ҷ����� �������� �̰� .readline()
		// 		 Scanner		: parse �Ḻ̌�� ����, ������ ��ȯ�� �� �ʿ䰡 ����, 
		//						  BufferedReader ���� ���� ����, ��� ���ϰ� ��� ����
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڿ� : ");	String str = sc.nextLine();
		System.out.print("���� : ");		int a = sc.nextInt();
		System.out.print("�Ǽ� : ");		double b = sc.nextDouble();
		System.out.print("���� : ");		char c = sc.next().charAt(0);
		
		System.out.println(str);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		sc.close();		
	}
}