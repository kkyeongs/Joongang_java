package Test39;

class SuperEx {
	int x, y, z;

	public SuperEx() {
		System.out.println("**** x,y,z�� ��ä���***");
	}

	public SuperEx(int k) {
		this();
		System.out.println(k + "�� �Ѱܹ��� ������");
	}

	public SuperEx(int a, int b) {
		this(a);
		System.out.println(a + "   " + b + "   �� �Ѱܹ��� ������");
	}

	public SuperEx(int x, int y, int z) {
		this(x, y);
		this.x = x;
		this.y = y;
		this.z = z;
		System.out.println(x + "   " + y + "   " + z + "   �� �Ѱܹ��� ������");
	}

	public void display() {
		System.out.println(this.x + "   " + this.y + "   " + this.z);
	}
}

class SubEx extends SuperEx {
	public SubEx() {
		super();
	}

	public SubEx(int a, int b, int c) {
		super(a, b, c);
		
		super.display();
		this.sumData();
	}

	public void sumData() {
		System.out.println("�� : " + (x + y + z));
	}
}

public class Test39 {

	public static void main(String[] args) {
		new SubEx(10, 20, 30);
	}
}