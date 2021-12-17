package overload;

public class OverloadEx {

	int x = 17;
	int y = 15;
	
	public int max() {
		return x > y ? x : y;
	}
	
	public int max(int x, int y) {
		return x > y ? x : y; // 3항연산자 ( 조건식 ) ? (true) : (false);
	}
	
	public float max(float x, float y) {
		return x > y ? x : y;
	}
	
	public static void main(String[] args) {
		
		// 오버로드(중복) : 같은 이름의 함수를 여러번 구현
		// 1. 반드시 함수의 이름이 같아야 한다
		// 2. 함수의 매개변수의 타입이 다르거나, 개수가 달라야 함
		
		OverloadEx ol = new OverloadEx();
		System.out.println("큰 수 : " + ol.max());
		System.out.println("큰 수 : " + ol.max(75, 100));
		System.out.println("큰 수 : " + ol.max(90.5f, 50.4f));
	}
}