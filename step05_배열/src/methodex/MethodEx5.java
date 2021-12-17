package methodex;

public class MethodEx5 {

	public static void show1() {
		
	}
	
	public static void show2(char a, int b) {
		System.out.println("타입 : " + a);
		System.out.println("코드 : " + b);
	}
	
	public static String show3() {
		return "hello";
	}
	
	public static float show4(int a, int b, int c) {
		return (a + b + c) / 3.0f;
	}
	
	public static void main(String[] args) {
		
		show1();
		show2('A', 25);
		
		String s = show3();
		System.out.println("리턴값 : " + s);
		
		float k = show4(15, 45, 73);
		System.out.printf("리턴값 : %.2f", k);
		
		// 리턴이 필요한 함수 : 함수로 이동해서 계산하고 결과값을 받아와야 하는 경우
		// 리턴이 필요없는 함수 : 함수로 이동해서 출력
		
	}
}