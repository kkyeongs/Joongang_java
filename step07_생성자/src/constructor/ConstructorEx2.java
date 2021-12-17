package constructor;

public class ConstructorEx2 {

	ConstructorEx2() {
		System.out.println("default constructor");	// 4번
	}
	
	ConstructorEx2(int num) {
		this("가나다", num);	// 2번
		System.out.println(num + " constructor");	// 6번
	}
	
	ConstructorEx2(String str, int n) {
		this(); 	// 3번
		System.out.println(str + " " + n + " constructor");	// 5번
	}
	
	public static void main(String[] args) {
		new ConstructorEx2(10);	// 1번
	}
}

/*
public class ConstructorEx2 {

	ConstructorEx2() {
		System.out.println("default constructor");	// 4번
	}
	
	ConstructorEx2(String str) {
		this("가나다", 10);	// 2번
		System.out.println(str + " constructor");	// 6번
	}
	
	ConstructorEx2(String str, int n) {
		this(); 	// 3번
		System.out.println(str + " " + n + " constructor");	// 5번
	}
	
	public static void main(String[] args) {
		new ConstructorEx2("가나다");	// 1번
	}
}
*/

/*
public class ConstructorEx2 {

	ConstructorEx2() {
		this("가나다", 10);	// 2번
		System.out.println("default constructor");	// 6번
	}
	
	ConstructorEx2(String str) {
		System.out.println(str + " constructor");	// 4번
	}
	
	ConstructorEx2(String str, int n) {
		this(str); 	// 3번
		System.out.println(str + " " + n + " constructor");	// 5번
	}
	
	public static void main(String[] args) {
		new ConstructorEx2();	// 1번
	}
}
*/

/*
public class ConstructorEx2 {

	ConstructorEx2() {
		System.out.println("default constructor");
	}
	
	ConstructorEx2(String str) {
		System.out.println(str + " constructor");
	}
	
	ConstructorEx2(String str, int n) {
		this(str); // 이 this(str)로 인해 ConstructorEx2(String str)이게 출력이됨
				   // 그렇기 때문에 this(str)이게 끝나고 밑에 함수가 출력이 된다
				   // 여기서 this()이거는 못함, 생성자에서 생성자는 한번만 호출 가능
		System.out.println(str + " " + n + " constructor");
	}
	
	public static void main(String[] args) {
		new ConstructorEx2("가나다", 10);
	}
}
*/