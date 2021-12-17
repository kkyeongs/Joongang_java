package exception;

class MyExreption extends Exception {
	public MyExreption() {
		System.out.println("미성년자 출입금지\n집으로");
	}
}

public class ExceptionEx4 {
										// 자바가 제공하는건 throws s가 붙는다
	public static void main(String[] args) throws MyExreption {
		// 사용자 정의 예외 처리
		
		int age = Integer.parseInt(args[0]);
		
		if (age < 19)
			throw new MyExreption();	// 사용자가 지정하는건 throw s가 안붙는다
		else
			System.out.println("어서오세요 고객님...");

	}
}
