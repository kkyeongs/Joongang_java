package test58;

import java.util.Scanner;

public class ShapeMain {

	public static void main(String[] args) {
		
		Shape sr = new Rectangle();
		Shape scr = new Circle();
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.print("1.사각형\t2.원\t3.종료\nselect(1-3) : ");
			int a = sc.nextInt();
			if (a == 1) {
				sr.onDraw();
				sr.onDelete();
			} else if (a == 2) {
				scr.onDraw();
				scr.onDelete();
			} else {
				System.out.println("종료합니다");
				System.exit(0);
			}
		}
	}
}