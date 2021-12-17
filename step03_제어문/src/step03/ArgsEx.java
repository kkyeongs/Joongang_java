package step03;

public class ArgsEx {

	public static void main(String[] args) {
		// 아규먼트 argument : 함수의 입력값
		// 프로그램 : 상태 + 동작 
		// 상태 : 변수, 동작 : 함수
		// 아규먼트, 파라미터, 매개변수(형식매개변수, 실매개변수) --> 매개변수
		// 함수, 퍼션, 프로시저, 메소드, 메서드 --> 함수
		
		// $ java ArgsEx 10 20 30
		// 세 수의 합 : 60
		
		// run as -> run config~ -> 아규먼트 메뉴 -> 프로그램 아규먼트 -> 
		// 베리어블 -> string prompt -> 실행할 때 마다 값을 새로 넣을 수 있음

		// string 타입이기 때문에 int 타입으로 바꿔준다
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);
		
		System.out.println("세 수의 합 : " + (a + b + c));
	}
}