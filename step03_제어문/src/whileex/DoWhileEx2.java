package whileex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DoWhileEx2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		// do while을 이용하여 반복처리 하세요
		// 다시 실행 할까요?(y/Y) y
		// 다시 실행 할까요?(y/Y) Y
		// 다시 실행 할까요?(y/Y) n
		// *** 수고요 ***
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char ck;
		
		do {
			System.out.print("다시 실행 할까요? (y/Y) : ");
			ck = br.readLine().charAt(0);
		} while(ck == 'Y' || ck == 'y');
		System.out.println("\n*** 수고요 ***");
	}
}