package Test45;

import java.util.Scanner;

public class Test45 extends Height {
	
	public double getInch(double cm) {
		return (cm / INCH);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�Է�(cm)�� �Է��Ͻÿ� : ");
		double cm = sc.nextDouble();

		System.out.println(cm + "cm�� " + new Test45().getInch(cm) + "��ġ �Դϴ�");
	}
}