package shape;

public class Rectangle extends Shape {

	public Rectangle() {
		
	}
	
	public Rectangle(int x, int y) {
		super(x, y);
	}

	public double getSize() {
		return getX() * getY();
	}
}