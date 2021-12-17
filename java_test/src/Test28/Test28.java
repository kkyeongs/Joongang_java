package Test28;

import java.util.Scanner;

public class Test28 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Input Character : ");
		int a = sc.next().charAt(0);
		
		// 65 ~ 90 , 97 ~ 122
		if(a > 64 && a < 91) {
			a = a + 32;
			System.out.println("result : " + (char)a);
		} else if(a > 96 && a < 123) {
			a = a - 32;
			System.out.println("result : " + (char)a);
		} else {
			System.out.println("입력데이터 오류");
		}
	}
}