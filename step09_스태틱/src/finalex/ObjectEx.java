package finalex;

// �ڹٿ��� ���� ������ �͵�
class Test {
	String name = "��ȣ��";
	
	public Test() {	// ���� ����, �� �ٸ� �����ڰ� ���� ������ ���� ��
		super(); // ���� ����
	}	
	
	public void view() {
		System.out.println("�̸� : " + name.toString()); // toString() ���� ����
	}
}

public class ObjectEx {

	public static void main(String[] args) {
		
		new Test().view();
	}
}