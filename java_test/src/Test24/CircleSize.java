package Test24;

public class CircleSize extends Circle {
	public CircleSize() {
		
	}
	public CircleSize(int r) {
		super(r);
	}
	
	public double getCalc() {
		return super.getR() * super.getR() * 3.14;
	}
	
	public String toString() {
		return super.toString() + "\n원의 넓이는 : " + getCalc();
	}
}