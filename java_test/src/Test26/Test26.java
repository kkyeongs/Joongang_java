package Test26;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Test26 {

	public static void main(String[] args) throws IOException {
		int q = 65430;
		int q1 = q % 10000;
		int q2 = q1 % 1000;
		int q3 = q2 % 100;
		System.out.println("money = " + q + "��");
		System.out.println("���� = " + q / 10000);
		System.out.println("õ�� = " + q1 / 1000);
		System.out.println("��� = " + q2 / 100);
		System.out.println("�ʿ� = " + q3 / 10);
		
		// ������������ �ߺ��� ���� �Է¹��� ��� ��󳻱�.....
		Scanner sc = new Scanner(System.in);
		System.out.print("�ݾ��� �Է��Ͻÿ� : ");
		int money = sc.nextInt();
		String num = String.valueOf(money);
		
		int moneylg = num.length();
		int x = 0;
		
		System.out.println("�Է��Ͻ� �ݾ��� : " + money + "���Դϴ�");
		if(moneylg == 2) {
			System.out.println("�ʿ� : " + Character.getNumericValue(num.charAt(x)) + "��");
		} else if(moneylg == 3) {
			System.out.println("��� : " + Character.getNumericValue(num.charAt(x)) + "��");
			x += 1;
			System.out.println("�ʿ� : " + Character.getNumericValue(num.charAt(x)) + "��");
		} else if(moneylg == 4) {
			System.out.println("õ�� : " + Character.getNumericValue(num.charAt(x)) + "��");
			x += 1;
			System.out.println("��� : " + Character.getNumericValue(num.charAt(x)) + "��");
			x += 1;
			System.out.println("�ʿ� : " + Character.getNumericValue(num.charAt(x)) + "��");
			x += 1;
		} else if(moneylg == 5) {
			System.out.println("���� : " + Character.getNumericValue(num.charAt(x)) + "��");
			x += 1;
			System.out.println("õ�� : " + Character.getNumericValue(num.charAt(x)) + "��");
			x += 1;
			System.out.println("��� : " + Character.getNumericValue(num.charAt(x)) + "��");
			x += 1;
			System.out.println("�ʿ� : " + Character.getNumericValue(num.charAt(x)) + "��");
			x += 1;
		} else if(moneylg == 6) {
			System.out.println("�ʸ��� : " + Character.getNumericValue(num.charAt(x)) + "��");
			x += 1;
			System.out.println("���� : " + Character.getNumericValue(num.charAt(x)) + "��");
			x += 1;
			System.out.println("õ�� : " + Character.getNumericValue(num.charAt(x)) + "��");
			x += 1;
			System.out.println("��� : " + Character.getNumericValue(num.charAt(x)) + "��");
			x += 1;
			System.out.println("�ʿ� : " + Character.getNumericValue(num.charAt(x)) + "��");
			x += 1;
		} else if(moneylg == 7) {
			System.out.println("�鸸�� : " + Character.getNumericValue(num.charAt(x)) + "��");
			x += 1;
			System.out.println("�ʸ��� : " + Character.getNumericValue(num.charAt(x)) + "��");
			x += 1;
			System.out.println("���� : " + Character.getNumericValue(num.charAt(x)) + "��");
			x += 1;
			System.out.println("õ�� : " + Character.getNumericValue(num.charAt(x)) + "��");
			x += 1;
			System.out.println("��� : " + Character.getNumericValue(num.charAt(x)) + "��");
			x += 1;
			System.out.println("�ʿ� : " + Character.getNumericValue(num.charAt(x)) + "��");
			x += 1;
		} else if(moneylg == 8) {
			System.out.println("õ���� : " + Character.getNumericValue(num.charAt(x)) + "��");
			x += 1;
			System.out.println("�鸸�� : " + Character.getNumericValue(num.charAt(x)) + "��");
			x += 1;
			System.out.println("�ʸ��� : " + Character.getNumericValue(num.charAt(x)) + "��");
			x += 1;
			System.out.println("���� : " + Character.getNumericValue(num.charAt(x)) + "��");
			x += 1;
			System.out.println("õ�� : " + Character.getNumericValue(num.charAt(x)) + "��");
			x += 1;
			System.out.println("��� : " + Character.getNumericValue(num.charAt(x)) + "��");
			x += 1;
			System.out.println("�ʿ� : " + Character.getNumericValue(num.charAt(x)) + "��");
			x += 1;
		}
	}
}
