package constructor;

public class ConstructorEx2 {

	ConstructorEx2() {
		System.out.println("default constructor");	// 4��
	}
	
	ConstructorEx2(int num) {
		this("������", num);	// 2��
		System.out.println(num + " constructor");	// 6��
	}
	
	ConstructorEx2(String str, int n) {
		this(); 	// 3��
		System.out.println(str + " " + n + " constructor");	// 5��
	}
	
	public static void main(String[] args) {
		new ConstructorEx2(10);	// 1��
	}
}

/*
public class ConstructorEx2 {

	ConstructorEx2() {
		System.out.println("default constructor");	// 4��
	}
	
	ConstructorEx2(String str) {
		this("������", 10);	// 2��
		System.out.println(str + " constructor");	// 6��
	}
	
	ConstructorEx2(String str, int n) {
		this(); 	// 3��
		System.out.println(str + " " + n + " constructor");	// 5��
	}
	
	public static void main(String[] args) {
		new ConstructorEx2("������");	// 1��
	}
}
*/

/*
public class ConstructorEx2 {

	ConstructorEx2() {
		this("������", 10);	// 2��
		System.out.println("default constructor");	// 6��
	}
	
	ConstructorEx2(String str) {
		System.out.println(str + " constructor");	// 4��
	}
	
	ConstructorEx2(String str, int n) {
		this(str); 	// 3��
		System.out.println(str + " " + n + " constructor");	// 5��
	}
	
	public static void main(String[] args) {
		new ConstructorEx2();	// 1��
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
		this(str); // �� this(str)�� ���� ConstructorEx2(String str)�̰� ����̵�
				   // �׷��� ������ this(str)�̰� ������ �ؿ� �Լ��� ����� �ȴ�
				   // ���⼭ this()�̰Ŵ� ����, �����ڿ��� �����ڴ� �ѹ��� ȣ�� ����
		System.out.println(str + " " + n + " constructor");
	}
	
	public static void main(String[] args) {
		new ConstructorEx2("������", 10);
	}
}
*/