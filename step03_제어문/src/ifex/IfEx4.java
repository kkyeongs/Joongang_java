package ifex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.Scanner;

public class IfEx4 {

	public static void main(String[] args) throws IOException {
		// 중첩 if문 사용
		// 3개 과목의 점수를 입력 받아서 합격, 불합격을 판정하여 출력
		// 3개 과목이 전부 40점 이상, 평균 60이상 "합격"
		// 평균이 60점이 넘지만 한개의 과목이라도 40점 미만 "과락으로 불합격"
		// 평균이 60미만 "불합격"
		
		// 평균이 첫번째 기준, 각 40점 이상이 두번째 기준
		
		// 출력결과
		// 국어점수입력 : 95
		// 영어점수입력 : 85
		// 수학점수입력 : 73
		// 결과 : 합격
		
		// 국어점수입력 : 95
		// 영어점수입력 : 85
		// 수학점수입력 : 30
		// 결과 : 과락으로 불합격
		
		// 국어점수입력 : 55
		// 영어점수입력 : 35
		// 수학점수입력 : 60
		// 결과 : 불합격
		
		// BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		// Scanner sc = new Scanner(System.in);
		String 국어, 영어, 수학;
		
		for (int i = 0; i < 3; i++) {
			System.out.print("국어점수입력 : ");
			// int kor = Integer.parseInt(br.readLine());
			국어 = br.readLine();	 // 키보드로 입력을 받는다
			System.out.print("영어점수입력 : ");
			영어 = br.readLine();
			System.out.print("수학점수입력 : ");
			수학 = br.readLine();
		
			int kor = Integer.parseInt(국어);
			int eng = Integer.parseInt(영어);
			int mat = Integer.parseInt(수학);
			
			if((kor + eng + mat) / 3 < 60) {
				System.out.println("결과 : 불합격");
			} else if(kor >= 40 && eng >= 40 && mat >= 40) {
				System.out.println("결과 : 합격");
			} else {
				System.out.println("결과 : 과락으로 불합격");
			}
			System.out.println();
		}
		System.out.println("----------------------------------");

		int kor1, eng1, mat1; // 값 선언 및 초기화
		double avg;
		
		System.out.println("국어점수입력 : ");
		kor1 = Integer.parseInt(br.readLine());
		System.out.println("영어점수입력 : ");
		eng1 = Integer.parseInt(br.readLine());
		System.out.println("수학점수입력 : ");
		mat1 = Integer.parseInt(br.readLine());
		
		avg = (kor1 + eng1 + mat1) / 3.0;
		
		System.out.print("결과 : ");
		if(avg >= 60) {
			if(kor1 >= 40 && eng1 >= 40 && mat1 >= 40) {
				System.out.println("합격");
			} else {
				System.out.println("과락으로 불합격");
			}
		} else {
			System.out.println("불합격");
		}
		
		/* or 조건 사용문
		if(avg >= 60) {
			if(kor < 40 || eng < 40 || mat < 40) {
				System.out.println("과락으로 불합격");
			} else {
				System.out.println("합격");
			}
		}
		*/
	}
}