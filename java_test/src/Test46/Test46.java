package Test46;

import java.util.Scanner;

public class Test46 {

	public static void main(String[] args) {
		// Shape ob = null;
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("1.�ﰢ�� 2. �簢��  3. ��  ��\n����(1-3) : ");
			int n = sc.nextInt();
			if(n == 1) {
				System.out.print("�غ� : ");
				int nData1 = sc.nextInt();
				System.out.print("���� : ");
				int nData2 = sc.nextInt();
				double ar = new Triangle(nData1, nData2).getArea();
				System.out.println("���� : " + ar);
			} else if (n == 2) {
				System.out.print("���� : ");
				int nData1 = sc.nextInt();
				System.out.print("���� : ");
				int nData2 = sc.nextInt();
				double ar = new Rectangle(nData1, nData2).getArea();
				System.out.println("���� : " + ar);
			} else if (n == 3) {
				System.out.println("�����");
				break;
			}
		}
	}
}