package abstratex;

abstract class A {	// �߻�(�̿ϼ�) Ŭ����, �������� ��������, �ڽ� ��ü���� �ϼ��ؾ���
	abstract public void view1();
	
	public void view2() {
		System.out.println("view2 method");
	}
}

class B extends A {
	@Override
	public void view1() {	// AŬ������ view1() ������ -- �������� ����
		System.out.println("view11 method");
	}
}

public class Abstratex1 {

	public static void main(String[] args) {
		
		// A ob1 = new A();	abstract�� �̿ϼ��̱⿡ ��ü ������ �Ұ�
		// ob1.view1();
		
		B ob2 = new B();
		ob2.view1();
		
		A ob3 = new B(); // ��ĳ������ �����ϴ�
		ob3.view1();
		ob3.view2();
	}
}

/*
abstract class A {	// �߻�(�̿ϼ�) Ŭ����
	abstract public void view1();
	
	public void view2() {
		System.out.println("view2 method");
	}
}

class B extends A {
	@Override
	public void view1() {	// AŬ������ view1() ������ -- �������� ����
		System.out.println("view11 method");
	}
}

public class Abstratex {

	public static void main(String[] args) {
		
		// A ob1 = new A();	abstract�� �̿ϼ��̱⿡ ��ü ������ �Ұ�
		// ob1.view1();
		
		B ob2 = new B();
		ob2.view1();
		
		A ob3 = new B(); // ��ĳ������ �����ϴ�
		ob3.view1();
		ob3.view2();
	}
}
*/