package Test46;

import java.util.Scanner;

public class Test46 {

	public static void main(String[] args) {
		// Shape ob = null;
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("1.삼각형 2. 사각형  3. 종  료\n선택(1-3) : ");
			int n = sc.nextInt();
			if(n == 1) {
				System.out.print("밑변 : ");
				int nData1 = sc.nextInt();
				System.out.print("높이 : ");
				int nData2 = sc.nextInt();
				double ar = new Triangle(nData1, nData2).getArea();
				System.out.println("넓이 : " + ar);
			} else if (n == 2) {
				System.out.print("가로 : ");
				int nData1 = sc.nextInt();
				System.out.print("세로 : ");
				int nData2 = sc.nextInt();
				double ar = new Rectangle(nData1, nData2).getArea();
				System.out.println("넓이 : " + ar);
			} else if (n == 3) {
				System.out.println("수고용");
				break;
			}
		}
	}
}