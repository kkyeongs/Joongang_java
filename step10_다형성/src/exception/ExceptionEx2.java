package exception;

public class ExceptionEx2 {

	public static void main(String[] args) {
		
		int[] num = {10, 20, 30};
		
		try {
			for (int i = 0; i < 5; i++) {
				System.out.println(num[i]);
			}
		} catch (Exception e) {
			System.out.println("�迭�� ������ �ʰ���");
		}
		System.out.println("--------------------------");
		
		// �̰� ����
		for (int i = 0; i < 5; i++) {
			try {
				System.out.println(num[i]);
			} catch (Exception e) {
				System.out.println("�迭�� ������ �ʰ���");
			}
		}
		
	}
}