package methodex;

public class MethodEx8 {

	public static void view1() {
		System.out.println("static method");
	}
	
	public void view2() {
		System.out.println("non-static method");
	}
	
	public static void main(String[] args) {
		// static�� ��ü���� ȣ�� ����
		view1(); // = MethodEx8.view1(); �̰Ŷ� ��������
		
		// �ν��Ͻ� �޼��� : �ݵ�� ��ü�� ������ �� �޼��� ȣ���� ����
		MethodEx8 v2 = new MethodEx8();
		v2.view2();
	}
}