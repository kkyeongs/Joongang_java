package methodex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MathodEx4 {
	
	public static int total(int a, int b, int c) {
		return a + b + c;
	}
	
	public static double avg(int tot) {
		return tot / 3.0;
	}
	
	public static char ad(double avg) {
		char grade;
		
		switch((int)avg / 10) { // 스위치의 조건식의 결과값은 정수 또는 문자열
		case 10:
		case 9: grade = 'A'; break; // case 9: return = 'A'; 이렇게 해도됨
		case 8: grade = 'B'; break;
		case 7: grade = 'C'; break;
		case 6: grade = 'D'; break;
		default: grade = 'F';
		}
		return grade;
	}
	
	public static String res(char ad) {
		String res;
		char grade = 0;
		
		if(grade != 'F')
			res = "합격";
		else 
			res = "불합격";
		return res;
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("국어 점수 입력 : ");
		int a = Integer.parseInt(br.readLine());
		
		System.out.print("수학 점수 입력 : ");
		int b = Integer.parseInt(br.readLine());
		
		System.out.print("영어 점수 입력 : ");
		int c = Integer.parseInt(br.readLine());
		
		System.out.println("총점 : " + total(a, b, c));
		System.out.println("평균 : " + avg(total(a, b, c)));
		System.out.println("학점 : " + ad(avg(total(a, b, c))));
		System.out.println("결과 : " + res(ad(avg(total(a, b, c )))));
	}
}