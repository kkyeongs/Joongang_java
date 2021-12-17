package Test37;

public class Test37 {

	public static void main(String[] args) {
		
		Shape ob = new Shape();
		int n = 0;
		while (true) {
			n = ob.menu();
			switch (n) {
			case 1:
				ob.circle();
				break;
			case 2:
				ob.triangle();
				break;
			case 3:
				ob.trapezoid();
				break;
			case 4:
				System.out.println("감사합니다 ^_^");
				System.exit(0);
			}
		}
	}
}