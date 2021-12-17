package exception;

public class ExceptionEx2 {

	public static void main(String[] args) {
		
		int[] num = {10, 20, 30};
		
		try {
			for (int i = 0; i < 5; i++) {
				System.out.println(num[i]);
			}
		} catch (Exception e) {
			System.out.println("배열의 개수가 초과됨");
		}
		System.out.println("--------------------------");
		
		// 이게 정석
		for (int i = 0; i < 5; i++) {
			try {
				System.out.println(num[i]);
			} catch (Exception e) {
				System.out.println("배열의 개수가 초과됨");
			}
		}
		
	}
}