package instance;

class A{}
class B extends A {}
class C extends A {}

public class InstanceofEx1 {

	public static void main(String[] args) {
		
		//										 B ��ü�� A�� ���Եǳ�?
		// instanceof ������ : B instanceof A ---> B ��ü�� A �ڷ����� �� �ִ°�?
		//						--- ��Ӱ��迡�� �ڷ��� �˻�
		// ��Ӱ��迡 �ִ� �ڽİ�ü�� �θ�Ŭ����(�ڷ���)���� ����ȯ ����
		
		A a = new A();
		B b = new B();
		C c = new C();
		
		System.out.println(a instanceof A); // true
		System.out.println(b instanceof A); // true
		System.out.println(c instanceof A); // true
		
		System.out.println(a instanceof C); // false
	}
}