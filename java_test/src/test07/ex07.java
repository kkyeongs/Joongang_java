package test07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex07 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int x = 0;
		int y = 0;
		char z;
		int m = 0;

		while (true) {
			System.out.print("x값을 입력하시오 : ");
			x = Integer.parseInt(br.readLine());

			System.out.print("y값을 입력하시오 : ");
			y = Integer.parseInt(br.readLine());

			// z == '+' || z == '-' || z == '*' || z == '/'

			System.out.print("연산자를 입력 (+, -, *, /) : ");
			z = br.readLine().charAt(0);
			if (z == '+') {
				System.out.println(x + " + " + y + " = " + (x + y));
			} else if (z == '-') {
				System.out.println(x + " - " + y + " = " + (x - y));
			} else if (z == '*') {
				System.out.println(x + " * " + y + " = " + (x * y));
			} else if (z == '/') {
				System.out.println(x + " / " + y + " = " + (x / y));
			} else {
				System.out.println("연산자 error");
			}
		}
	}
}