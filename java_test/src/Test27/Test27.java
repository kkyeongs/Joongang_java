package Test27;

import java.util.Scanner;

public class Test27 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력하시오 : ");
		int a = sc.nextInt();
		
		if (a < 0 || a > 100) {
			System.out.println("입력오류!!");
		} else {
			System.out.println("입력된 값 : " + a);
		}
	}
}