package step01_기초;

public class DataType2 {

	public static void main(String[] args) {
		// 제어문자
		// System.out.printf("메세지 or 제어문자", 변수1, 변수2, ...변수n);
		// 제어문자와 변수의 개수는 일치해야 함
		// 종류
		// %s = String
		// %c = char
		// %d = int 정수
		// %f = double, float 실수
		
		String name = "이순신";
		System.out.printf("이름 : %s\n", name);
		
		String dept = "개발부";
		System.out.printf("부서 : %s\n", dept);
		
		char gender = '남';
		System.out.printf("성별 : %c\n", gender);
		
		double score = 85.3;
		System.out.printf("점수 : %10.1f\n", score);
		System.out.printf("점수 : %-10.1f\n", score);
		System.out.printf("점수 : %.1f\n", score);
		
		int age = 23;
		System.out.printf("점수 : %d\n", age);
	}
}