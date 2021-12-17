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
		System.out.print("속도입력를 입력하시오 : ");
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
			System.out.println("현재속도는 : " + currVelocity + "km/h 입니다");
		} else {
			System.out.println("정지하셨습니다");
			System.exit(0);
		}
	}
}