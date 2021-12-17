package Inputex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputTest6 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		// 사원번호 입력 : 102(int)
		// 사원이름 입력 : 이순신(string)
		// 부서코드 입력 : B(char)
		// 입사성적 입력 : 90.54(double)
		
		// 출력화면
		// 사원번호 : 102
		// 사원이름 : 이순신
		// 부서코드 : B
		// 입사성적 : 90.54
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int eno;			// 4바이트
		String ename;	// 객체
		char dept;		// 2바이트, 정수자료
		double score;	// 8바이트, 실수자료형, 배정도 // float : 단정도 실수형, 4바이트
		
		System.out.print("사원번호 입력 : ");
		eno = Integer.parseInt(br.readLine());
		
		System.out.print("사원이름 입력 : ");
		ename = br.readLine();
		
		System.out.print("부서코드 입력 : ");
		dept = br.readLine().charAt(0);
		
		System.out.print("입사성적 입력 : ");
		score = Double.parseDouble(br.readLine()); 
		// String str = br.readLine( ); 사용자가 입력한 값이 str에 담깁니다.
		// float fnum = Float.parseFloat(str); str에 담긴 값을 float으로 변환 후 fnum에 대입
		// double dnum = Double.parseDouble(str); str에 담긴 값을 double로 변환 후 dnum에 대입
		// int num = Integer.parseInt(str); str에 담긴 값을 int로 변환 후 numj에 대입
		
		System.out.println("사원번호 : " + eno);
		System.out.println("사원이름 : " + ename);
		System.out.println("부서코드 : " + dept);
		System.out.println("입사성적 : " + score);
	}
}