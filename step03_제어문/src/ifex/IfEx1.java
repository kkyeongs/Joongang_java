package ifex;

public class IfEx1 {

	public static void main(String[] args) {
		// 단순 if문
		// if(조건식) {
		// 		~~~~
		// }
		// 조건의 만족여부와 관계없이 동작하는 문장들
		String str1 = "Hello";
		if (str1 == "hello") {
			System.out.println("안녕하세요");
		}
		System.out.println("안녕히가세요");
		System.out.println("-------------------------");
		
		// if~else 문    조건이 만족하면 if, 만족하지 않으면 else
		String str2 = "Hello";
		if (str2 == "Hello") {
			System.out.println("안녕하세요");
		} else {
			System.out.println("안녕히가세요");
		}
		System.out.println("-------------------------");
		
		int score = 45;
		if(score >= 60) {
			System.out.println("합격");
			System.out.println("당신의 점수는 " + score + "점입니다");
		} else {
			System.out.println("불합격");
			System.out.println("당신의 점수는 " + score + "점이고 다음 기회에...");
		}
		System.out.println("안녕히가세요");
		System.out.println("-------------------------");
		
		// if~else if~ else
		int score2 = 95;
		char grade;
		
		if(score2 >= 90) {
			grade = 'A';
		} else if(score2 >= 80) {
			grade = 'B';
		} else if(score2 >= 70) {
			grade = 'C';
		} else if(score2 >= 60) {
			grade = 'D';
		} else {
			grade = 'F';
		} 
		System.out.println("점수는 " + score2 + "점이고 학점은 " + grade + "입니다");
		System.out.println("-------------------------");
		
		int score3 = 90;
		char grade3 = '\0'; // 초기값을 주지 않으면 에러가 생긴다
		
		if(score3 >= 90 && score3 <= 100) grade3 = 'A';
		if(score3 >= 80 && score3 < 90) grade3 = 'B';
		if(score3 >= 70 && score3 < 80) grade3 = 'C';
		if(score3 >= 60 && score3 < 70) grade3 = 'D';
		if(score3 >= 0 && score3 < 60) grade3 = 'F';

		System.out.println("점수는 " + score3 + "점이고 학점은 " + grade3 + "입니다");
	}
}