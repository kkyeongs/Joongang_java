package forex;

public class ForEx2 {

	public static void main(String[] args) {
		
		int [] num = {100, 200, 300, 400, 500}; // �迭 : ������ �ڷ����� ���ӵ� ������
		
		for (int i = 0; i < 5; i++) {
			System.out.println(num[i]);
		}
		
		// ���� for��, for each
		for (int n : num) {
			System.out.println(n);
		}
		System.out.println("-------------------------------");
		
		String [] color = {"red", "green", "blue"};
		for (int n = 0; n < color.length; n++) {
			System.out.println(color[n]);
		}
		
		// ���� for��
		for (String a : color) {	// for (���Թ����ڷ��� n : �������ڷ�)
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