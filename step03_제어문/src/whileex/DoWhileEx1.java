package whileex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DoWhileEx1 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num;
		
		do {
			System.out.print("점수를 입력하세요 : ");
			num = Integer.parseInt(br.readLine());
		} while(num < 0 || num > 100); // 이 범위 안에서 do가 계속 실행
		System.out.println("입력하신 점수는 " + num + "점입니다");
	}
}