package inheritance;

class ParentEx {
	public ParentEx() {
		System.out.println("parent class");
	}
}

class ChildEx extends ParentEx {
	public ChildEx() {
		//super();	// ��������, ��� �θ�Ŭ���� �����ڰ� ���� ��µ�
		System.out.println("child class");
	}
}

public class InheritanceEx2 {

	public static void main(String[] args) {
		
		new ChildEx(); // �ڽ� �����ڸ� ȣ���ϸ� �θ�Ŭ���� �����ڰ� ���� ȣ���
		
// this.����									super.����
// this.�޼���()								super.�޼���()
// this() == ������ ȣ��						super() == ������ ȣ��
// this(����, ����, ...) == ������ ȣ��(�ڽ�)		super(����, ����, ...) == ������ ȣ��(�θ�)
	}
}