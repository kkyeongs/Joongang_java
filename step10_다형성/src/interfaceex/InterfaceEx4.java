package interfaceex;

class User {
	private String name;
	
	public User() {
		
	}
	public User(String name) {
		super();
		this.name = name;
	}

	public String toString() {
		return "�̸� : " + name;
	}
}

interface Score {
	public int sol=20;
	public int getScore();
}

interface Print {
	public String toPaint();
}

public class InterfaceEx4 extends User implements Score, Print {

	int i;
	
	public InterfaceEx4(String name, int i) {
		super(name);
		this.i = i;
	}

	public int getScore() {
		return i * sol;
	}
	
	public String toPaint() {
		return super.toString() + "\n���� : " + getScore();
	}
	
	public static void main(String[] args) {
		
		// class�� interface�� �̿��� ���� ó��
		// Ŭ������ User
		// -name : String
		// +User()
		// +User(String name)
		// +toString : String
		// �������̽��� : Score
		// +sol : int(�ʱⰪ : 20) -- ����
		// +getScore() : int -- ������ * sol ����
		// �������̽��� : Print
		// +toPaint() : String
		// ���ȭ��
		// �̸� : ȫ�浿
		// ���� : 60��
		
		InterfaceEx4 ob = new InterfaceEx4("ȫ�浿", 3);
		System.out.println(ob.toPaint());
	}
}