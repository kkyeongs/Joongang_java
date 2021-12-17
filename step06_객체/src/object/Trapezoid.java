package object;

public class Trapezoid {

	// ��ٸ����� ���� ���ϱ�
	// -base : int
	// -top : int
	// -height : int
	
	// +setTrapezoid() : void
	// +calc() : double			<== ��ٸ����� ���̸� ���ؼ� ���� (�Ʒ���+����)*����*2
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
		return "���� : " + calc();
	}
	
	public double calc() {
		return ((base + top) * height / 2.0);
	}
}