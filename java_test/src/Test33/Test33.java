package Test33;

import java.util.Scanner;

public class Test33 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("단을 입력하시오 : ");
		int a = sc.nextInt();
		
		for (int i = 1; i < 10; i++) {
			System.out.println(a + " * " + i + " = " + (a * i) + "\t\t" + 
					(a+1) + " * " + i + " = " + ((a+1) * i));
		}
	}
}