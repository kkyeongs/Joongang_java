package Test34;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Test34 {

	public static void main(String[] args) throws IOException {

		
		int a = (int)(Math.random()*100);
		int count = 0;
		
		Scanner sc = new Scanner(System.in);
		
		while (true) {

			System.out.println("*** ������ �߻��Ͽ����ϴ�. ���߾� ������. ***");
			System.out.print("�����Է� : ");
			
			int b = sc.nextInt();
			if (b == a) {
				count += 1;
				System.out.println("�������� " + count + "������ ���߼̽��ϴ�");
				System.out.print("�ٽ� �ұ��? (Y/y or N/n) : ");
				char z = sc.next().charAt(0);
				if (z == 'Y' || z == 'y') {
					continue;
				} else {
					System.out.println("** �����ϼ̽��ϴ� **");
					break;
				}
			} else if (b > a) {
				count += 1;
				System.out.println("��ǻ���� ���ڰ� �� �۽��ϴ�");
			} else if (b < a) {
				count += 1;
				System.out.println("��ǻ���� ���ڰ� �� Ů�ϴ�");
			}
		} 
		System.out.println("--------------------------------------");
	}
}