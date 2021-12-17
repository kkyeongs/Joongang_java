package whileex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WhileEx2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// 구구단 출력하기
		// 단을 입력하세요 : 7
		// 7 X 1 = 7
		// 7 X 9 = 63 까지
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("단을 입력하세요 : ");
		int num = Integer.parseInt(br.readLine());
		
		int n = 0;
		while(n < 10) {
			System.out.println(num + " X " + n + " = " + (num * n));
			n++;
		}
	}
}