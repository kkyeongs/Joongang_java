package forex;

public class ForEx3 {

	public static void main(String[] args) {
		
		// 1 ~ 100 ������ 7�� ����� ����ϼ���
		int n = 7;
		for (int i = 0; i < 100; i++) {
			if(i % n != 0)
				continue;
				System.out.println(n + "�� ����� : " + i);
		}
	}
}