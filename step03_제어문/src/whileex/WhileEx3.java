package whileex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WhileEx3 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// switch와 while을 이용한 메뉴 선택 프로그램
		// 1. 사각형 2. 삼각형 3. 원 4. 종료
		// 선택하세요 : 1 
		// 사각형이 선택되었습니다
		// 1. 사각형 2. 삼각형 3. 원 4. 종료
		// 선택하세요 : 2 
		// 삼각형이 선택되었습니다
		// 1. 사각형 2. 삼각형 3. 원 4. 종료
		// 선택하세요 : 3 
		// 원이 선택되었습니다
		// ***** 프로그램을 종료합니다 *****
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			System.out.print("1.사각형 2.삼각형 3.원 4.종료 \n선택하세요 : ");
			int num = Integer.parseInt(br.readLine());
			switch(num) {
			case 1: System.out.println("사각형이 선택되었습니다"); break;
			case 2: System.out.println("삼각형이 선택되었습니다"); break;
			case 3: System.out.println("원이 선택되었습니다"); break;
			case 4: System.out.println("***** 프로그램을 종료합니다 *****"); 
			System.exit(0); // 강제종료
			}
		}
	}
}