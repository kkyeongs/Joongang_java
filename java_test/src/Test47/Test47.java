package Test47;

public class Test47 {

	public static void main(String[] args) {
		SportsCar ob = new SportsCar();
		System.out.println("**��� �ӵ��� 10km/h�Դϴ� **");
		while (true) {
			ob.inVelocity();
			ob.outVelocity();
			ob.currSpeedCheck();
		}
	}
}