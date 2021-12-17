package staticex;

class Test {
	int x;
	int y;
	static int z; // 프로그램이 동작하는 동안 전 영역에 영향을 끼침
	
	static {
		System.out.println("static 초기화 영역"); // 맨 처음 1회만 초기화 됨
	}
	
	public Test(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
		System.out.println("객체 초기화 영역");
	}
	
	public void view() {
		System.out.println(x + " " + y + " " + z);
	}
}

public class StaticEx1 {

	public static void main(String[] args) {
		
		Test ob1 = new Test(1, 2, 3);
		ob1.view();
		
		Test ob2 = new Test(4, 5, 6);
		ob2.view();
	}
}