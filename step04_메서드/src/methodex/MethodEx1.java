package methodex;

public class MethodEx1 {
	
	// call by name : 이름만 있는 함수
	public static void view() { // 함수 정의
		System.out.println("hello");
		return; // 값을 가지고 가지 않는 리턴, 제어를 함수 호출한 곳으로 되돌려주는 역할
	}
	
	public static void star() { // 함수 정의
		System.out.println("*****");
	}

	public static void main(String[] args) {
		
		view(); // 함수호출
		star();
	}
}