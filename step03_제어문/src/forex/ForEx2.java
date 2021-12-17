package forex;

public class ForEx2 {

	public static void main(String[] args) {
		
		int [] num = {100, 200, 300, 400, 500}; // 배열 : 동일한 자료형의 연속된 기억공간
		
		for (int i = 0; i < 5; i++) {
			System.out.println(num[i]);
		}
		
		// 향상된 for문, for each
		for (int n : num) {
			System.out.println(n);
		}
		System.out.println("-------------------------------");
		
		String [] color = {"red", "green", "blue"};
		for (int n = 0; n < color.length; n++) {
			System.out.println(color[n]);
		}
		
		// 향상된 for문
		for (String a : color) {	// for (대입받을자료형 n : 대입할자료)
			System.out.println(a);
		}
		System.out.println("-----"
				+ "--------------------------");
		
		// continue, break
		for (int a = 1; a <= 10; a++) {
			if(a == 5) 
				// break;
				continue;
			System.out.print(a + " ");
		}
	}
}