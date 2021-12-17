package Test24;

public class CircleRound extends Circle{
	public CircleRound() {
		
	}
	public CircleRound(int r) {
		super(r);
	}
	
	public double getCalc() {
		return super.getR() * 2 * 3.14;
	}
	
	public String toString() {
		return super.toString() + "\n원의 둘레는 : " + getCalc();
	}
}