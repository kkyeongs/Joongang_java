package constructor;

public class ConstructorEx1 {

	ConstructorEx1() { // 디폴트 생성자
		System.out.println("default constructor");
	}
	
	ConstructorEx1(String str) {
		System.out.println(str + " constructor");
	}
	
	ConstructorEx1(String str, int n) {
		System.out.println(str + " " + n + " constructor");
	}
	
	public static void main(String[] args) {
		
		// 생성자 : 객체 초기화 담당, 서브루틴
		ConstructorEx1 ob = new ConstructorEx1();
		// new ConstructorEx1(); // 이렇게 사용하기도 함
		new ConstructorEx1("가나다");
		new ConstructorEx1("가나다", 25);
	}
}