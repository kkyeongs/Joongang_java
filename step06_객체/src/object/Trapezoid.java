package object;

public class Trapezoid {

	// 사다리꼴의 넓이 구하기
	// -base : int
	// -top : int
	// -height : int
	
	// +setTrapezoid() : void
	// +calc() : double			<== 사다리꼴의 넓이를 구해서 리턴 (아랫변+윗변)*높이*2
	// +toString : String
	
	private int base;
	private int top;
	private int height;
	
	public void setTrapezoid(int base, int top, int height) {
		this.base = base;
		this.top = top;
		this.height = height;
	}
	
	public String toString() {
		return "넓이 : " + calc();
	}
	
	public double calc() {
		return ((base + top) * height / 2.0);
	}
}