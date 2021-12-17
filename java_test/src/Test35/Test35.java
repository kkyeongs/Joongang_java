package Test35;

public class Test35 {
	
	public static String personView(String name, int a, int b, int c) {
		return name + "의 총점은 " + (a + b + c) + "점입니다";
	}

	public static void main(String[] args) {
		String result = personView("홍길동", 90,78,88);
	    System.out.println(result);
	}
}