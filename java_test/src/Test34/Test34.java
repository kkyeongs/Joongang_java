package Test34;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Test34 {

	public static void main(String[] args) throws IOException {

		
		int a = (int)(Math.random()*100);
		int count = 0;
		
		Scanner sc = new Scanner(System.in);
		
		while (true) {

			System.out.println("*** 난수가 발생하였습니다. 맞추어 보세요. ***");
			System.out.print("숫자입력 : ");
			
			int b = sc.nextInt();
			if (b == a) {
				count += 1;
				System.out.println("ㅊㅋㅊㅋ " + count + "번만에 맞추셨습니다");
				System.out.print("다시 할까요? (Y/y or N/n) : ");
				char z = sc.next().charAt(0);
				if (z == 'Y' || z == 'y') {
					continue;
				} else {
					System.out.println("** 수고하셨습니다 **");
					break;
				}
			} else if (b > a) {
				count += 1;
				System.out.println("컴퓨터의 숫자가 더 작습니다");
			} else if (b < a) {
				count += 1;
				System.out.println("컴퓨터의 숫자가 더 큽니다");
			}
		} 
		System.out.println("--------------------------------------");
	}
}