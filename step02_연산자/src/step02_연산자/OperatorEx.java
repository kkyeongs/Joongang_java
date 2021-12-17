package step02_연산자;

public class OperatorEx {

	public static void main(String[] args) {
		// 산술연산자
		System.out.println(5/3); // 나누기 연산, 몫 구하기
		System.out.println(5%3); // 나누기 연산, 나머지 구하기
		System.out.println("---------------------------");
		
		// 관계연산자 == true or false
		int a = 5;
		System.out.println(a == 5); // a는 5와 같은가?
		System.out.println(a >= 3); // a는 3보다 크거나 같은가?
		System.out.println(a <= 3); // a는 3보다 작거나 같은가?
		System.out.println(a > 3); // a는 3보다 큰가?
		System.out.println(a < 3); // a는 3보다 작은가?
		System.out.println(a != 5); // a는 5가 아닌가? (부정)
		System.out.println("---------------------------");
		
		// 논리연산자 and &&, or ||, 
		String str = "korea";
		System.out.println(str == "korea" || str == "KOREA");
		int score = 57;
		System.out.println(score >= 60 && score < 90);
		System.out.println("---------------------------");
		
		// 대입연산자, 우변이 먼저 계산되고 그 결과를 좌변에 대입
		int b = 5; // = 대입연산자
		b += 7; // b = b + 7
		b *= 3; // b = b * 3
		b -= 2; // b = b - 2
		b %= 3; // b = b % 3
		System.out.println("---------------------------");
		
		// 단항연산자 ++ + -- -    k가 먼저 나오면 출력후 뒤에 연산을 실행
		int k = 5;					// 화면		메모리
		System.out.println(k++);	// 5		 6
		System.out.println(++k);	// 7		 7
		System.out.println(k);		// 7         7
		System.out.println(--k);	// 6		 6
		System.out.println(k--);	// 6		 5
		System.out.println("---------------------------");
		
		// 삼항연산자 : 항이 3개, 연산자 2개     조건 ? true값 : false값
		char code = 'f';
		String gender;
		gender = (code == 'f' || code == '여')? "female" : "male";
		System.out.println(" 성별 : " + gender);
		System.out.println("---------------------------");
		
		boolean ck = true; // 논리자료형
		System.out.println(!ck); // 논리부정
		
		// 변수의 초기화
		int q = 0;
		float w = 0;
		char e = '\0'; // null 문자 
		String r = null;
	}
}