package Test46;

public class Triangle extends Shape {
	public Triangle(int nData1, int nData2) {
		super(nData1, nData2);
	}
	
	public double getArea() {
		return (getnData1() * getnData2()) / 2;
	}
}