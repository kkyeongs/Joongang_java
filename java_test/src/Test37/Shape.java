package Test37;

import java.util.Scanner;

public class Shape {
	public double area;
	public final double PI = 3.141592;
	
	public Shape() {

	}
	
	public int menu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("*** �������� ***\n1.��\n2.�ﰢ��\n3.��ٸ���\n4.����");
		System.out.print("���� : " );
		int n = sc.nextInt();
		System.out.println();
		return n;
	}
	
	public void circle() {
		System.out.println("**** ���ǳ��� ****");
		Scanner sc = new Scanner(System.in);
		System.out.print("�������� �Է��ϼ��� : ");
		double a = sc.nextDouble();
		area = a * a * PI;
		output();
	}
	
	public void triangle() {
		System.out.println("**** �ﰢ���ǳ��� ****");
		Scanner sc = new Scanner(System.in);
		System.out.print("�غ��� �Է��ϼ��� : ");
		double a = sc.nextDouble();
		System.out.print("���̸� �Է��ϼ��� : ");
		double b = sc.nextDouble();
		area = a * b / 2;
		output();
	}
	
	public void trapezoid() {
		System.out.println("**** ��ٸ����ǳ��� ****");
		Scanner sc = new Scanner(System.in);
		System.out.print("�غ��� �Է��ϼ��� : ");
		double a = sc.nextDouble();
		System.out.print("������ �Է��ϼ��� : ");
		double b = sc.nextDouble();
		System.out.print("���̸� �Է��ϼ��� : ");
		double c = sc.nextDouble();
		area = (a + b) * c / 2;
		output();
	}
	
	public void output() {
		System.out.println("���� : " + area + "\n");
	}
}