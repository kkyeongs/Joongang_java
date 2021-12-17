package Test26;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Test26 {

	public static void main(String[] args) throws IOException {
		int q = 65430;
		int q1 = q % 10000;
		int q2 = q1 % 1000;
		int q3 = q2 % 100;
		System.out.println("money = " + q + "원");
		System.out.println("만원 = " + q / 10000);
		System.out.println("천원 = " + q1 / 1000);
		System.out.println("백원 = " + q2 / 100);
		System.out.println("십원 = " + q3 / 10);
		
		// 허접스럽지만 중복이 많은 입력받은 장수 골라내기.....
		Scanner sc = new Scanner(System.in);
		System.out.print("금액을 입력하시오 : ");
		int money = sc.nextInt();
		String num = String.valueOf(money);
		
		int moneylg = num.length();
		int x = 0;
		
		System.out.println("입력하신 금액은 : " + money + "원입니다");
		if(moneylg == 2) {
			System.out.println("십원 : " + Character.getNumericValue(num.charAt(x)) + "개");
		} else if(moneylg == 3) {
			System.out.println("백원 : " + Character.getNumericValue(num.charAt(x)) + "개");
			x += 1;
			System.out.println("십원 : " + Character.getNumericValue(num.charAt(x)) + "개");
		} else if(moneylg == 4) {
			System.out.println("천원 : " + Character.getNumericValue(num.charAt(x)) + "장");
			x += 1;
			System.out.println("백원 : " + Character.getNumericValue(num.charAt(x)) + "개");
			x += 1;
			System.out.println("십원 : " + Character.getNumericValue(num.charAt(x)) + "개");
			x += 1;
		} else if(moneylg == 5) {
			System.out.println("만원 : " + Character.getNumericValue(num.charAt(x)) + "장");
			x += 1;
			System.out.println("천원 : " + Character.getNumericValue(num.charAt(x)) + "장");
			x += 1;
			System.out.println("백원 : " + Character.getNumericValue(num.charAt(x)) + "개");
			x += 1;
			System.out.println("십원 : " + Character.getNumericValue(num.charAt(x)) + "개");
			x += 1;
		} else if(moneylg == 6) {
			System.out.println("십만원 : " + Character.getNumericValue(num.charAt(x)) + "장");
			x += 1;
			System.out.println("만원 : " + Character.getNumericValue(num.charAt(x)) + "장");
			x += 1;
			System.out.println("천원 : " + Character.getNumericValue(num.charAt(x)) + "장");
			x += 1;
			System.out.println("백원 : " + Character.getNumericValue(num.charAt(x)) + "개");
			x += 1;
			System.out.println("십원 : " + Character.getNumericValue(num.charAt(x)) + "개");
			x += 1;
		} else if(moneylg == 7) {
			System.out.println("백만원 : " + Character.getNumericValue(num.charAt(x)) + "장");
			x += 1;
			System.out.println("십만원 : " + Character.getNumericValue(num.charAt(x)) + "장");
			x += 1;
			System.out.println("만원 : " + Character.getNumericValue(num.charAt(x)) + "장");
			x += 1;
			System.out.println("천원 : " + Character.getNumericValue(num.charAt(x)) + "장");
			x += 1;
			System.out.println("백원 : " + Character.getNumericValue(num.charAt(x)) + "개");
			x += 1;
			System.out.println("십원 : " + Character.getNumericValue(num.charAt(x)) + "개");
			x += 1;
		} else if(moneylg == 8) {
			System.out.println("천만원 : " + Character.getNumericValue(num.charAt(x)) + "장");
			x += 1;
			System.out.println("백만원 : " + Character.getNumericValue(num.charAt(x)) + "장");
			x += 1;
			System.out.println("십만원 : " + Character.getNumericValue(num.charAt(x)) + "장");
			x += 1;
			System.out.println("만원 : " + Character.getNumericValue(num.charAt(x)) + "장");
			x += 1;
			System.out.println("천원 : " + Character.getNumericValue(num.charAt(x)) + "장");
			x += 1;
			System.out.println("백원 : " + Character.getNumericValue(num.charAt(x)) + "개");
			x += 1;
			System.out.println("십원 : " + Character.getNumericValue(num.charAt(x)) + "개");
			x += 1;
		}
	}
}
