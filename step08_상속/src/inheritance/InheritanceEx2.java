package inheritance;

class ParentEx {
	public ParentEx() {
		System.out.println("parent class");
	}
}

class ChildEx extends ParentEx {
	public ChildEx() {
		//super();	// 생략가능, 없어도 부모클래스 생성자가 먼저 출력됨
		System.out.println("child class");
	}
}

public class InheritanceEx2 {

	public static void main(String[] args) {
		
		new ChildEx(); // 자식 생성자를 호출하면 부모클래스 생성자가 먼저 호출됨
		
// this.변수									super.변수
// this.메서드()								super.메서드()
// this() == 생성자 호출						super() == 생성자 호출
// this(인자, 인자, ...) == 생성자 호출(자신)		super(인자, 인자, ...) == 생성자 호출(부모)
	}
}