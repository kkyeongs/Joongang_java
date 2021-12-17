package step02_������;

public class OperatorEx {

	public static void main(String[] args) {
		// ���������
		System.out.println(5/3); // ������ ����, �� ���ϱ�
		System.out.println(5%3); // ������ ����, ������ ���ϱ�
		System.out.println("---------------------------");
		
		// ���迬���� == true or false
		int a = 5;
		System.out.println(a == 5); // a�� 5�� ������?
		System.out.println(a >= 3); // a�� 3���� ũ�ų� ������?
		System.out.println(a <= 3); // a�� 3���� �۰ų� ������?
		System.out.println(a > 3); // a�� 3���� ū��?
		System.out.println(a < 3); // a�� 3���� ������?
		System.out.println(a != 5); // a�� 5�� �ƴѰ�? (����)
		System.out.println("---------------------------");
		
		// �������� and &&, or ||, 
		String str = "korea";
		System.out.println(str == "korea" || str == "KOREA");
		int score = 57;
		System.out.println(score >= 60 && score < 90);
		System.out.println("---------------------------");
		
		// ���Կ�����, �캯�� ���� ���ǰ� �� ����� �º��� ����
		int b = 5; // = ���Կ�����
		b += 7; // b = b + 7
		b *= 3; // b = b * 3
		b -= 2; // b = b - 2
		b %= 3; // b = b % 3
		System.out.println("---------------------------");
		
		// ���׿����� ++ + -- -    k�� ���� ������ ����� �ڿ� ������ ����
		int k = 5;					// ȭ��		�޸�
		System.out.println(k++);	// 5		 6
		System.out.println(++k);	// 7		 7
		System.out.println(k);		// 7         7
		System.out.println(--k);	// 6		 6
		System.out.println(k--);	// 6		 5
		System.out.println("---------------------------");
		
		// ���׿����� : ���� 3��, ������ 2��     ���� ? true�� : false��
		char code = 'f';
		String gender;
		gender = (code == 'f' || code == '��')? "female" : "male";
		System.out.println(" ���� : " + gender);
		System.out.println("---------------------------");
		
		boolean ck = true; // ���ڷ���
		System.out.println(!ck); // ������
		
		// ������ �ʱ�ȭ
		int q = 0;
		float w = 0;
		char e = '\0'; // null ���� 
		String r = null;
	}
}