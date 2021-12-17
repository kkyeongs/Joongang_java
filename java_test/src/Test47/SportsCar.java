package Test47;

import java.util.Scanner;

public class SportsCar implements Speed, CurrentSpeed {
	public int velocity;
	public int currVelocity;
	
	public SportsCar() {
		currVelocity = SPEED;
	}
	
	public void inVelocity() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�ӵ��Է¸� �Է��Ͻÿ� : ");
		velocity = sc.nextInt();
	}
	
	public void outVelocity() {
		if (velocity > 0) {
			speedUp(velocity);
		} else if (velocity < 0) {
			speedDown(velocity);
		}
	}
	
	public int speedUp(int inc) {
		return currVelocity += inc;
	}

	public int speedDown(int dec) {
		return currVelocity += dec;
	}

	public void currSpeedCheck() {
		if (currVelocity > 0) {
			System.out.println("����ӵ��� : " + currVelocity + "km/h �Դϴ�");
		} else {
			System.out.println("�����ϼ̽��ϴ�");
			System.exit(0);
		}
	}
}