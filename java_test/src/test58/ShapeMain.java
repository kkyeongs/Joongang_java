package test58;

import java.util.Scanner;

public class ShapeMain {

	public static void main(String[] args) {
		
		Shape sr = new Rectangle();
		Shape scr = new Circle();
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.print("1.�簢��\t2.��\t3.����\nselect(1-3) : ");
			int a = sc.nextInt();
			if (a == 1) {
				sr.onDraw();
				sr.onDelete();
			} else if (a == 2) {
				scr.onDraw();
				scr.onDelete();
			} else {
				System.out.println("�����մϴ�");
				System.exit(0);
			}
		}
	}
}