package Test18;

public class Shape {
	int x;
	int y;
	int z;
	
	public Shape(int x) {
		double a;
		a = (x / 2) * (x / 2) * 3.14;
		System.out.println("���� ���� : " + a);
	}
	
	public Shape(int x, int y) {
		double a;
		a = x * y;
		System.out.println("�簢���� ���� : " + a);
	}
	
	public Shape(int x, int y, int z) {
		double a;
		a = (x + y) * z / 2;
		System.out.println("��ٸ����� ���� : " + a);
	}
}