package finalex;

class A {
	final int n = 100;
	
	final public void view() { 
		// n = 200; // final 변수는 값을 변경할 수 없다
		System.out.println("A class");
	}
}

class B extends A {
//	 public void view() {	 A클래스에 final 있기때문에 오버라이드 할 수 없다
//		System.out.println("B class"); 
//	}
}

public class FinalTest {

	public static void main(String[] args) {
		
		// final 변수, 함수를 상수화 한다. 즉, 값을 변할 수 없게 한다
		
		new A().view();
	}
}