package Inputex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputTest5 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		// eno : 101
		// ename : 홍길동
		// dept : A
		// score : 85.9
		
		// 출력화면
		// 사원번호 : 101
		// 사원이름 : 홍길동
		// 부서코드 : A
		// 입사성적 : 85.9
		
		int eno = 101;			// 4바이트
		String ename = "홍길동";	// 객체
		char dept = 'A';		// 2바이트, 정수자료
		double score = 85.9;	// 8바이트, 실수자료형, 배정도 // float : 단정도 실수형, 4바이트
		
		System.out.printf("사원번호 : %d\n", eno);
		System.out.printf("사원이름 : %s\n", ename);
		System.out.printf("부서코드 : %c\n", dept);
		System.out.printf("입사성적 : %.1f	\n", score); // %.(자리수)f 해야한다
	}
}