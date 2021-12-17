package inheritance;

class NumberEx1 {
	int a, b;
	
	public NumberEx1(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public void view1() {
		System.out.println(a + " " + b);
	}
}

class NumberEx2 extends NumberEx1 {
	int c;
	public NumberEx2(int a, int b, int c) {
		super(a, b);	// 부모 클래스가 변수를 가지고 있다면 
						// 자식 클래스에서는 부모 클래스로 값을 전달할 수 있는 방법이 있어야 함
		this.c = c;
	}
	
	public void view2() {
		view1();
		System.out.println(c);
	}
}

public class InheritanceEx4 {

	public static void main(String[] args) {
		
		new NumberEx1(100, 200).view1();
		new NumberEx2(10, 20, 30).view2();
	}
}