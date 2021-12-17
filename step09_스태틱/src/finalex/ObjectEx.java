package finalex;

// 자바에서 생략 가능한 것들
class Test {
	String name = "강호동";
	
	public Test() {	// 생략 가능, 단 다른 생성자가 없고 사용되지 않을 때
		super(); // 생략 가능
	}	
	
	public void view() {
		System.out.println("이름 : " + name.toString()); // toString() 생략 가능
	}
}

public class ObjectEx {

	public static void main(String[] args) {
		
		new Test().view();
	}
}