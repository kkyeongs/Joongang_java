package instance;

class A{}
class B extends A {}
class C extends A {}

public class InstanceofEx1 {

	public static void main(String[] args) {
		
		//										 B 객체가 A에 포함되나?
		// instanceof 연산자 : B instanceof A ---> B 객체가 A 자료형일 수 있는가?
		//						--- 상속관계에서 자료형 검사
		// 상속관계에 있는 자식객체는 부모클래스(자료형)으로 형변환 가능
		
		A a = new A();
		B b = new B();
		C c = new C();
		
		System.out.println(a instanceof A); // true
		System.out.println(b instanceof A); // true
		System.out.println(c instanceof A); // true
		
		System.out.println(a instanceof C); // false
	}
}