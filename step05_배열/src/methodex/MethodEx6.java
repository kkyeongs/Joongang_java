package methodex;

public class MethodEx6 {

	public static int total(int a, int b) {
		return a + b;
	}
	
	public static String re(int total) {
		if(total >= 800) {
			return "합격";
		} else {
			return "불합격";
		}
	}
	
	public static void main(String[] args) {
		
		// 입사총점 : 815
		// 입사결과 : 합격입니다
		
		int toeic = 750, it = 65;
		
		System.out.println("입사총점 : " + total(toeic, it) + "점");
		System.out.println("입사결과 : " + re(total(toeic, it)) + "입니다");
	}
}