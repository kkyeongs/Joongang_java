package forex;

public class ForEx1 {

	public static void main(String[] args) {
		
		int sum = 0, even = 0, odd = 0; // 합계 값을 누적할 변수
		for (int i = 0; i < 100; i++) {
			sum += i; // sum = sum + i
			
			switch(i % 2) {
			case 0: 
				even += i; break;
			case 1:
				odd += i; break;
			}
		}
		System.out.println("sum : " + sum); // 총 합계
		System.out.println("even : " + even); // 짝수
		System.out.println("odd : " + odd); // 홀수
		System.out.println("--------------------------------");
		
		// A B C D ... Y Z (char 자료형은 정수자료형의 한 종류)
		// 65~90
		int a = 65;
		for (int j = 65; j < 91; j++) {
			System.out.print((char)a + " ");
			++a;
		}
		System.out.println();
		for (char c = 'A'; c <= 'Z'; c++) {
			System.out.print(c + " ");
		}
		System.out.println("\n--------------------------------");
		
		for (int i = 100; i >=80; i -= 3) {
			System.out.print(i + " ");
		}
	}
}