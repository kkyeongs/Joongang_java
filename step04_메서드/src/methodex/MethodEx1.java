package methodex;

public class MethodEx1 {
	
	// call by name : �̸��� �ִ� �Լ�
	public static void view() { // �Լ� ����
		System.out.println("hello");
		return; // ���� ������ ���� �ʴ� ����, ��� �Լ� ȣ���� ������ �ǵ����ִ� ����
	}
	
	public static void star() { // �Լ� ����
		System.out.println("*****");
	}

	public static void main(String[] args) {
		
		view(); // �Լ�ȣ��
		star();
	}
}