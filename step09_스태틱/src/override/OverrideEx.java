package override;

class Test1 {
	public void view1() {
		System.out.println("view1 method");
	}
	
	public void view3() {
		System.out.println("view3 method");
	}
}

class Test2 extends Test1 {
	@Override
	public void view1() {
		System.out.println("view11 method");
	}
	
	public void view2() {
		System.out.println("view2 method");
	}
}

public class OverrideEx {

	public static void main(String[] args) {
		
		Test2 ob = new Test2();
		ob.view1();
		ob.view2();
		ob.view3();
		System.out.println("-----------------------");
		
		Test1 ob2 = new Test2(); // 부모클래스의 참조변수로 자식 객체 생성
								 // 부모클래스를 베이스로 두고 수정할 것만 자식클래스에서 수정
		ob2.view1();
		ob2.view3();
	}
}