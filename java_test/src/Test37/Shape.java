package Test37;

import java.util.Scanner;

public class Shape {
	public double area;
	public final double PI = 3.141592;
	
	public Shape() {

	}
	
	public int menu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("*** 도형선택 ***\n1.원\n2.삼각형\n3.사다리꼴\n4.종료");
		System.out.print("선택 : " );
		int n = sc.nextInt();
		System.out.println();
		return n;
	}
	
	public void circle() {
		System.out.println("**** 원의넓이 ****");
		Scanner sc = new Scanner(System.in);
		System.out.print("반지름을 입력하세요 : ");
		double a = sc.nextDouble();
		area = a * a * PI;
		output();
	}
	
	public void triangle() {
		System.out.println("**** 삼각형의넓이 ****");
		Scanner sc = new Scanner(System.in);
		System.out.print("밑변을 입력하세요 : ");
		double a = sc.nextDouble();
		System.out.print("높이를 입력하세요 : ");
		double b = sc.nextDouble();
		area = a * b / 2;
		output();
	}
	
	public void trapezoid() {
		System.out.println("**** 사다리꼴의넓이 ****");
		Scanner sc = new Scanner(System.in);
		System.out.print("밑변을 입력하세요 : ");
		double a = sc.nextDouble();
		System.out.print("윗변을 입력하세요 : ");
		double b = sc.nextDouble();
		System.out.print("높이를 입력하세요 : ");
		double c = sc.nextDouble();
		area = (a + b) * c / 2;
		output();
	}
	
	public void output() {
		System.out.println("넓이 : " + area + "\n");
	}
}