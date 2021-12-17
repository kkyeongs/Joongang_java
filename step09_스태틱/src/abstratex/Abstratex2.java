package abstratex;

abstract class Shape {
	abstract public void onDraw();
	abstract public void onDelete();
}

class Rectangle extends Shape {
	@Override
	public void onDraw() {
		System.out.println("�簢���� �׸���");
	}
	@Override
	public void onDelete() {
		System.out.println("�簢���� �����");
	}
}

class Circle extends Shape {

	@Override
	public void onDraw() {
		System.out.println("���� �׸���");
	}
	@Override
	public void onDelete() {
		System.out.println("���� �����");
	}
}

public class Abstratex2 {

	public static void main(String[] args) {
		Shape sh = new Rectangle();
		sh.onDraw();
		sh.onDelete();
		
		sh = new Circle();
		sh.onDraw();
		sh.onDelete();
		
		Rectangle rt = new Rectangle();
		rt.onDraw();
		rt.onDelete();
		
		Circle cir = new Circle();
		cir.onDraw();
		cir.onDelete();
	}
}