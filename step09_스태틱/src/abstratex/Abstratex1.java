package abstratex;

abstract class A {	// 추상(미완성) 클래스, 강제성을 갖고있음, 자식 객체에서 완성해야함
	abstract public void view1();
	
	public void view2() {
		System.out.println("view2 method");
	}
}

class B extends A {
	@Override
	public void view1() {	// A클래스의 view1() 재정의 -- 강제성이 없음
		System.out.println("view11 method");
	}
}

public class Abstratex1 {

	public static void main(String[] args) {
		
		// A ob1 = new A();	abstract는 미완성이기에 객체 생성이 불가
		// ob1.view1();
		
		B ob2 = new B();
		ob2.view1();
		
		A ob3 = new B(); // 업캐스팅은 가능하다
		ob3.view1();
		ob3.view2();
	}
}

/*
abstract class A {	// 추상(미완성) 클래스
	abstract public void view1();
	
	public void view2() {
		System.out.println("view2 method");
	}
}

class B extends A {
	@Override
	public void view1() {	// A클래스의 view1() 재정의 -- 강제성이 없음
		System.out.println("view11 method");
	}
}

public class Abstratex {

	public static void main(String[] args) {
		
		// A ob1 = new A();	abstract는 미완성이기에 객체 생성이 불가
		// ob1.view1();
		
		B ob2 = new B();
		ob2.view1();
		
		A ob3 = new B(); // 업캐스팅은 가능하다
		ob3.view1();
		ob3.view2();
	}
}
*/