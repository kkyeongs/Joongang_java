package object;

import java.util.Scanner;

public class ObjectEx7 {

	public static void main(String[] args) {

		// ***** ��ٸ����� ���� ���ϱ� *****
		// �غ��� �Է��ϼ��� : 
		// ������ �Է��ϼ��� : 
		// ���̸� �Է��ϼ��� : 
		
		// ���� : ???
		
		// �ѹ� �� �����ұ��?(Y/y)   
		// n������ 
		// ***** ����� *****
		
		Trapezoid tz = new Trapezoid();
		Scanner sc = new Scanner(System.in);
		char an;
		
		do {
			System.out.println("***** ��ٸ����� ���� ���ϱ� *****");
			System.out.print("�غ��� �Է��ϼ��� : ");		int base = sc.nextInt();
			System.out.print("������ �Է��ϼ��� : ");		int top = sc.nextInt();
			System.out.print("������ �Է��ϼ��� : ");		int height = sc.nextInt();
			tz.setTrapezoid(base, top, height);
			System.out.println(tz.toString());

			System.out.print("�ѹ��� �����ұ��?(Y/y) : ");
			an = sc.next().charAt(0);
		} while (an == 'Y' || an == 'y');
		System.out.println("***** ����� *****");
	}
}