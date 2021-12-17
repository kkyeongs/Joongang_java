package exception;

public class ExceptionEx1 {
	
	public static void main(String[] args) {
		
		// try ~ catch 블럭 : 익셉션이 발생할 때 잡아주는 역할
		// 예외 처리를 하는 이유 : 프로그램이 정상적으로 진행할 수 있도록 해주는 과정
		
		try {
		int var = 5;
		int n = Integer.parseInt(args[0]);
		System.out.println(var / n);
		} catch(ArithmeticException e) { // 산술연산 과정의 문제
			System.out.println("0으로 나눌 수 없습니다");
		} catch(NumberFormatException e) { // 입력되는 숫자의 형식이 맞지 않음
			System.out.println("숫자로 변환할 수 없습니다");
		} catch(ArrayIndexOutOfBoundsException e) { // 데이터를 받아들이는 기억공간이 비어있음
			System.out.println("입력된 값이 없습니다");
		} finally {
			System.out.println("무조건 실행되는 영역");
		}
		
		try {
			
		} catch (Exception e) { // 상위 Exception 클래스, 이거 쓰면 다른 오류처리 다 커버 가능
		}
		
		System.out.println("hello");
	}
}