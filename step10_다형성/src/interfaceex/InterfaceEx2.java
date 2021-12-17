package interfaceex;

interface Cryable {
	public void cry();
}

interface Flyable {
	public void fly();
}

class Eagle implements Flyable, Cryable {
	public void fly() {
		System.out.println("�������� ���ƴٳ��~");
	}
	public void cry() {
		System.out.println("��� ���");
	}
}

public class InterfaceEx2 {

	public static void main(String[] args) {
		Eagle eg = new Eagle();
		eg.fly();
		eg.cry();
	}
}

/*
abstract class Cryable {
	abstract public void cry();
}

abstract class Flyable {
	abstract public void fly();
}

class Eagle extends Flyable {
	public void fly() {
		System.out.println("�������� ���ƴٳ��~");
		new CryableEx().cry();
	}
	class CryableEx extends Cryable {
		public void cry() {
			System.out.println("��� ���");
		}
	}
}

public class InterfaceEx2 {

	public static void main(String[] args) {
		
		new Eagle().fly();
	}
}
*/