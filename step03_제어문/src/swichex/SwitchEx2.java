package swichex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SwitchEx2 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// 문제
		// 숫자를 입력하세요 : 5
		// 
		// 5는 홀 수 입니다
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num;
		System.out.print("숫자를 입력하세요 : ");
		num = Integer.parseInt(br.readLine());
				
		switch(num % 2) {
		case 0 : System.out.println(num + "은(는) 짝 수 입니다");
			break;
		default : System.out.println(num + "은(는) 홀 수 입니다");
		}
	}
}