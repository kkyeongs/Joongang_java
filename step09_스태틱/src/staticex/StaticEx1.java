package staticex;

class Test {
	int x;
	int y;
	static int z; // ���α׷��� �����ϴ� ���� �� ������ ������ ��ħ
	
	static {
		System.out.println("static �ʱ�ȭ ����"); // �� ó�� 1ȸ�� �ʱ�ȭ ��
	}
	
	public Test(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
		System.out.println("��ü �ʱ�ȭ ����");
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