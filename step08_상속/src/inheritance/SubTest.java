package inheritance;

public class SubTest extends SuperTest {
	
	private int age;
	private double score;
	
	public SubTest() {
		
	}

	public SubTest(String name, String addr, int age, double score) {
		super(name, addr);
		this.age = age;
		this.score = score;
	}
	
	public String toString() {
		return super.toString() + "���̴� " + age + "�̰� ������ " + score + "�� �Դϴ�";
	}

	public static void main(String[] args) {
		
		SuperTest ob1 = new SuperTest("��ȣ��", "����");
		System.out.println(ob1.toString());
		System.out.println("----------------------------");
		
		SubTest ob2 = new SubTest("��ȣ��", "����", 25, 85.4);
		System.out.println(ob2.toString());
	}
}