package test09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex09 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("x의 값을 입력하시오 : ");
		int x = Integer.parseInt(br.readLine());
		System.out.print("y의 값을 입력하시오 : ");
		int y = Integer.parseInt(br.readLine());
		
		int a = 1;
		for (int i = 1; i <= y; i++) {
			a = a * x;
		}
		System.out.println(x + "의 " + y + "승은 " + a);
	}
}