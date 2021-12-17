package Test20;

public class Circle {
	private int r;
	
	public Circle(int r) {
		this.r = r;
	}
	
	public double getSize() {
		return ((r / 2) * (r / 2) * 3.14);
	}
}
