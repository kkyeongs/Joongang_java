package Test43;

public class CircleArea extends Circle {
	
	public CircleArea(int r) {
		super(r);
	}
	
	public void compute() {
		size = r * r * PI;
	}
	
	public void output() {
		System.out.println("¿øÀÇ ³ĞÀÌ : " + super.size);
	}
}