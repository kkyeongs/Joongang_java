package whileex;

public class WhileEx1 {

	public static void main(String[] args) {
		
		int n = 0;
		
		while(true) {  // <--- 무한루프 내부에 탈출조건을 만들어줘야 함
			++n;
			if(n <= 5 ) {
				System.out.println("Hello Java");
			} else {
				break;
			}
		}
		System.out.println("-----------------------");
		
		int a = 10;
		while(a >= 1) {
			System.out.print(a + " ");
			--a;
		}
	}
}