package Test27;

import java.util.Scanner;

public class Test27 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է��Ͻÿ� : ");
		int a = sc.nextInt();
		
		if (a < 0 || a > 100) {
			System.out.println("�Է¿���!!");
		} else {
			System.out.println("�Էµ� �� : " + a);
		}
	}
}