package step02_������;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputTest2 {

	public static void main(String[] args) throws IOException {
		// A���� �Է��ϼ��� : 15
		// B���� �Է��ϼ��� : 10
		// 15 + 10 = 25
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		int A, B;
		System.out.print("A���� �Է��ϼ��� : ");
		System.out.print("B���� �Է��ϼ��� : ");
		
		A = Integer.parseInt(br.readLine());
		B = Integer.parseInt(br.readLine());
		System.out.println("\n" + A + " + " + B + " = " + (A + B));
	}
}