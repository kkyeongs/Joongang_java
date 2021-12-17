package step03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputTest4 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// 다음과 같이 계산하여 출력하세요
		// 반지름을 입력하세요 " 5
		// 원의 넓이 : 78.5          <-- 반지름*반지름*3.14
		// 원의 둘레 : 31.4          <-- 2*반지름*3.14
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int 반지름 = 0;
		
		System.out.print("반지름을 입력하세요 : ");
		반지름 = Integer.parseInt(br.readLine());
		
		double 넓이 = (반지름 * 반지름 * 3.14);
		double 둘레 = (2 * 반지름 * 3.14);
		
		System.out.println("원의 넓이 : " + 넓이);
		System.out.printf("원의 둘레 : %.1f\n", 둘레);
	}
} 