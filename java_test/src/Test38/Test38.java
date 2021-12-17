package Test38;

class Parent {
	String name;

	public Parent() {
		System.out.println("###��������###");
	}

	public Parent(String name) {
		this.name = name;
	}

	public void printView() {
		System.out.println("�̸� : " + name);
	}
}
class Child extends Parent {
	int age;
	float tall;

	public Child(String name, int age, float tall) {
		super(name);
		this.age = age;
		this.tall = tall;
	}

	public void printView() {
		super.printView();
		System.out.println("���� : " + age);
		System.out.println("���� : " + tall);
	}
}

public class Test38 {

	public static void main(String[] args) {
		new Child("�ε鷡", 23, 165.3f).printView();
	}
}