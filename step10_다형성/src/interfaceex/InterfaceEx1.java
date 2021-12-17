package interfaceex;

// �������̽�
interface Shape {
	final int r = 10;
	
	public void draw();
	public void erase();
}

class Circle implements Shape {
	public void draw() {System.out.println("�������� " + r + "�� ���� �׸���");}
	public void erase() {System.out.println("���� �����");}
}

public class InterfaceEx1 {
	
	public static void main(String[] args) {
	Circle cir = new Circle();
	cir.draw();
	}
}

/*
abstract class Shape {
	final int r = 10;
	
	abstract public void draw();
	abstract public void erase();
}

class Circle extends Shape {
	public void draw() {System.out.println("�������� " + r + "�� ���� �׸���");}
	public void erase() {System.out.println("���� �����");}
}

public class InterfaceEx1 {
	
	public static void main(String[] args) {
	Circle cir = new Circle();
	cir.draw();
	}
}
*/

/*
class Shape {
	final int r = 10;
	
	public void draw() {}
	public void erase() {}
}

class Circle extends Shape {
	public void draw() {System.out.println("�������� " + r + "�� ���� �׸���");}
	public void erase() {System.out.println("���� �����");}
}

public class InterfaceEx1 {
	
	public static void main(String[] args) {
	Circle cir = new Circle();
	cir.draw();
	}
}
*/