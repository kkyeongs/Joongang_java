package constructor;

public class Member {
	private String name = "�̼���";
	private int age = 25;
	public Member() {
		
	}
	
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void view() {
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + age);
	}
}
