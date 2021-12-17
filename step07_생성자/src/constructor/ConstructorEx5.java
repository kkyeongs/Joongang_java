package constructor;

import java.util.Scanner;

class Max {
	private int a;
	private int b;
	Max() {
		Scanner sc = new Scanner(System.in);
		System.out.print("a �Է� : ");		a = sc.nextInt();
		System.out.print("b �Է� : ");		b = sc.nextInt();
	}
	
	public int maxValue() {
		return a > b ? a : b;
	}
	
	public int minValue() {
		return a < b ? a : b;
	}
	
	public void show() {
		System.out.println("ū �� : " + maxValue());
		System.out.println("���� �� : " + minValue());
	}
}

public class ConstructorEx5 {

	public static void main(String[] args) {
		
		// �����ڿ��� �� ���� �Է¹޾� ū���� �������� ���
		// show()���� maxValue(), minValue()�� ȣ��
		
		// Ŭ������ Max
		// -a : int
		// -b : int 
		// +Max()		+maxValue() int		+minValue() int
		// +show() void
		// ���ȭ��
		// a �Է� : 
		// b �Է� : 
		// ū�� : 
		// ������ : 
		new Max().show();
	}
}