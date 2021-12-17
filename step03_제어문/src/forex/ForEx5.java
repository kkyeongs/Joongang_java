package forex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class ForEx5 {
	
	public static void main(String[] args) throws IOException {
		
		// BufferedReader를 이용해서 프로그램 작성
		// 1. 문자를 입력받기(단, 대문자만 입력받기)
		// 2. 랜덤하게 대문자를 30개 발생하여 화면에 출력
		// 3. 발생한 문자 중에 입력한 문자가 몇개인지 출력
		
		// 결과화면
		// 문자입력 : K
		// D D F K R .....
		// K의 개수 : ?
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("문자 입력(대문자만) : ");
		char a = br.readLine().charAt(0);
		
		char Rn;
		int count = 0;
		for (int i = 0; i < 30; i++) {
			Rn = (char)(Math.random()*26+65);
			System.out.print(Rn + " ");
			if(a == Rn) {
				++count;
			}
		}
		System.out.println();
		System.out.println(a + "의 개수 : " + count);
	}
}