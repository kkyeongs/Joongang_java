package constructor;

public class ConstructorEx1 {

	ConstructorEx1() { // ����Ʈ ������
		System.out.println("default constructor");
	}
	
	ConstructorEx1(String str) {
		System.out.println(str + " constructor");
	}
	
	ConstructorEx1(String str, int n) {
		System.out.println(str + " " + n + " constructor");
	}
	
	public static void main(String[] args) {
		
		// ������ : ��ü �ʱ�ȭ ���, �����ƾ
		ConstructorEx1 ob = new ConstructorEx1();
		// new ConstructorEx1(); // �̷��� ����ϱ⵵ ��
		new ConstructorEx1("������");
		new ConstructorEx1("������", 25);
	}
}