package methodex;

public class MethodEx8 {

	public static void view1() {
		System.out.println("static method");
	}
	
	public void view2() {
		System.out.println("non-static method");
	}
	
	public static void main(String[] args) {
		// static은 객체없이 호출 가능
		view1(); // = MethodEx8.view1(); 이거랑 같은거임
		
		// 인스턴스 메서드 : 반드시 객체를 생성한 후 메서드 호출이 가능
		MethodEx8 v2 = new MethodEx8();
		v2.view2();
	}
}