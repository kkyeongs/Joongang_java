package test13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex13 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		int[] month = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a;
		
		System.out.print("원하는 month를 입력하시오 : ");
		a = Integer.parseInt(br.readLine());
		System.out.println(a + "월은 " + month[a-1] + "일 입니다.");
	}
}