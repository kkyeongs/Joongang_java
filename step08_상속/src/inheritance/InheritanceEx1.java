package inheritance;

class SuperEx {
	public void show() {
		System.out.println("show1 method");
	}
}

class subEx extends SuperEx {
	public void show() {
		super.show();
		System.out.println("show2 method");
	}
}

public class InheritanceEx1 {

	public static void main(String[] args) {
	
		subEx ob = new subEx();
		ob.show(); // 오버라이드
	}
}

/*
class SuperEx {
	public void show1() {
		System.out.println("show1 method");
	}
}

class subEx extends SuperEx {
	public void show2() {
		System.out.println("show2 method");
	}
}

public class InheritanceEx1 {

	public static void main(String[] args) {
	
		subEx ob = new subEx();
		ob.show1();
		ob.show2();
	}
}
*/