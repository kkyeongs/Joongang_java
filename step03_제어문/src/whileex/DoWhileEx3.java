package whileex;

public class DoWhileEx3 {

	public static void main(String[] args) {
		
		// 65 ~ 90 ������ ������ ���� ���� 10���� ���弼��
		int count = 0;
		
		do {
			System.out.print((int)(Math.random()*26+65) + " ");
			++count;
		} while(count < 10);
		System.out.println("\n----------------------------");
		
		// ������� �Ѱ�
		int count1 = 0;
		int num;
		
		do {
			++count1;
			num = (int)(Math.random()*26+65);
			System.out.print(num + " ");
		} while(count1 < 10);
	}
}
