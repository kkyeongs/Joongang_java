package object;

class Member {
	private String name;
	private int age;
	private double tall;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setTall(double tall) {
		this.tall = tall;
	}
	
	public double getTall() {
		return tall;
	}
}

public class ObjectEx3 {

	public static void main(String[] args) {
		
		// setter & getter : ��� ���� �ϳ��� ���� �����ϴ� �Լ� (setter)
		//			       : �� ���� �����ϴ� �Լ� (getter)
		// �������� private�� ����� �� ���� ����Ҷ� ���°�?..
		
		Member mb = new Member();
		mb.setName("��ȣ��");
		mb.setAge(23);
		mb.setTall(185.3);
		
		System.out.println("�̸� : " + mb.getName());
		System.out.println("���� : " + mb.getAge());
		System.out.println("���� : " + mb.getTall());
	}
}