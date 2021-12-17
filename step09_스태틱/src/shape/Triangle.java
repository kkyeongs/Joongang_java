package shape;

public class Triangle extends Shape {
	
	public Triangle() {
		
	}
	
	public Triangle(int x, int y) {
		super(x, y);
	}

	public double getSize() {
		return (getX() * getY()) / 2.0;
	}
}