package Test36;

public class Test36 {
	
	private double base = 5.0;
	private double height = 3.5;
	
	public double getArea() {
		return (base * height) / 2;
	}
	
	public double getHypotenuse() {
		return Math.sqrt((base * base) + (height * height));
	}
	
	public double getPerimeter() {
		return base + height + getHypotenuse();
	}

	public static void main(String[] args) {
		
		Test36 ob = new Test36();
		System.out.println("»ï°¢ÇüÀÇ ³ĞÀÌ : " + ob.getArea());
		System.out.printf("»ï°¢ÇüÀÇ ³ĞÀÌ : %.2f", ob.getHypotenuse());
		System.out.printf("\n»ï°¢ÇüÀÇ ³ĞÀÌ : %.2f", ob.getPerimeter());
	}
}