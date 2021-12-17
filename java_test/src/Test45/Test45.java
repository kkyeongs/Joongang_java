package Test45;

import java.util.Scanner;

public class Test45 extends Height {
	
	public double getInch(double cm) {
		return (cm / INCH);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력(cm)를 입력하시오 : ");
		double cm = sc.nextDouble();

		System.out.println(cm + "cm는 " + new Test45().getInch(cm) + "인치 입니다");
	}
}