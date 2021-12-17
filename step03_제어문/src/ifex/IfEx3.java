package ifex;

public class IfEx3 {

	public static void main(String[] args) {
		// 다음 프로그램을 작성하세요
		// a 변수에 55 또는 46을 대입
		// 1. if 이용
		// 조건문에서 50과 비교하여 50보다 크면
		// "55는 50보다 크거나 같다, 46은 50보다 작다
		// 2. if else 이용
		// a 변수의 값이 홀수 인지 짝수인지 출력
		// 3. if ~ else if ~ else 이용
		// a의 변수의 값이 음수인지 양수인지 zero인지 출력
		
		// 출력결과 
		// 55는 50보다 크거나 같다
		// 55는 홀수입니다
		// 55는 양수입니다
		int a = 55;
		if(a >= 50) {
			System.out.println(a + "는 50보다 크거나 같다");
		}
		
		if(a % 2 == 0) {
			System.out.println(a + "는 짝수입니다");
		} else {
			System.out.println(a + "는 홀수입니다");
		}
		
		if(a > 0) {
			System.out.println(a + "는 양수입니다");
		} else if(a < 0) {
			System.out.println(a + "는 음수입니다");
		} else if(a == 0){
			System.out.println(a + "는 zero입니다");
		}
		
		// 코드가 한줄일 경우에는 { } 안써도된다 아래처럼 사용 가능
		if(a % 2 == 0)
			System.out.println(a + "는 짝수입니다");
		else
			System.out.println(a + "는 홀수입니다");
	}
}