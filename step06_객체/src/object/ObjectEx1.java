package object;

class Person {
	public String name;
	public int age;
	public float score;
	
	public void setPerson(String n, int a, float s) {
		name = n;
		age = a;
		score = s;
	}
	
	public void viewPerson() {
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + age);
		System.out.println("���� : " + score);
	}
}

public class ObjectEx1 {
	
	public static void main(String[] args) {
		
		// -private, +public, #protected
		// Ŭ������ : Person
		// +name : String
		// +age : int
		// +score : float
		
		// +setPerson(n : String, a : int, s : float) : void
		// viewPerson() : void
		
		// new Person(); heap������ �޸𸮸� �Ҵ��ϴ� �۾�
		Person ps = new Person(); // ��ü ����
		ps.setPerson("������", 23, 73.5f);
		ps.viewPerson();
		System.out.println(ps.hashCode());
		
		ps = new Person();
		ps.setPerson("�ε鷡", 25, 90.54f);
		ps.viewPerson();
		System.out.println(ps.hashCode());
	}
}