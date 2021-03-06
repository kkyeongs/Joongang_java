package step02_연산자;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputTest2 {

	public static void main(String[] args) throws IOException {
		// A값을 입력하세요 : 15
		// B값을 입력하세요 : 10
		// 15 + 10 = 25
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		int A, B;
		System.out.print("A값을 입력하세요 : ");
		System.out.print("B값을 입력하세요 : ");
		
		A = Integer.parseInt(br.readLine());
		B = Integer.parseInt(br.readLine());
		System.out.println("\n" + A + " + " + B + " = " + (A + B));
	}
}