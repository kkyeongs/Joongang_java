package methodex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MathodEx4 {
	
	public static int total(int a, int b, int c) {
		return a + b + c;
	}
	
	public static double avg(int tot) {
		return tot / 3.0;
	}
	
	public static char ad(double avg) {
		char grade;
		
		switch((int)avg / 10) { // ����ġ�� ���ǽ��� ������� ���� �Ǵ� ���ڿ�
		case 10:
		case 9: grade = 'A'; break; // case 9: return = 'A'; �̷��� �ص���
		case 8: grade = 'B'; break;
		case 7: grade = 'C'; break;
		case 6: grade = 'D'; break;
		default: grade = 'F';
		}
		return grade;
	}
	
	public static String res(char ad) {
		String res;
		char grade = 0;
		
		if(grade != 'F')
			res = "�հ�";
		else 
			res = "���հ�";
		return res;
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("���� ���� �Է� : ");
		int a = Integer.parseInt(br.readLine());
		
		System.out.print("���� ���� �Է� : ");
		int b = Integer.parseInt(br.readLine());
		
		System.out.print("���� ���� �Է� : ");
		int c = Integer.parseInt(br.readLine());
		
		System.out.println("���� : " + total(a, b, c));
		System.out.println("��� : " + avg(total(a, b, c)));
		System.out.println("���� : " + ad(avg(total(a, b, c))));
		System.out.println("��� : " + res(ad(avg(total(a, b, c )))));
	}
}