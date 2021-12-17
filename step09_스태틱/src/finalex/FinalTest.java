package finalex;

class A {
	final int n = 100;
	
	final public void view() { 
		// n = 200; // final ������ ���� ������ �� ����
		System.out.println("A class");
	}
}

class B extends A {
//	 public void view() {	 AŬ������ final �ֱ⶧���� �������̵� �� �� ����
//		System.out.println("B class"); 
//	}
}

public class FinalTest {

	public static void main(String[] args) {
		
		// final ����, �Լ��� ���ȭ �Ѵ�. ��, ���� ���� �� ���� �Ѵ�
		
		new A().view();
	}
}