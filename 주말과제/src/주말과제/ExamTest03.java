package �ָ�����;

import java.util.Scanner;

public class ExamTest03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a=null;
		int sum=0;
		
		System.out.print("3�ڸ� ������ �Է��ϼ��� : ");	a=sc.next();
		
		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i)>=48 && a.charAt(i)<=57) {
				sum+=a.charAt(i)-48;
			}
		}
		System.out.println(a.length()+"�ڸ��� ���� "+sum+" �Դϴ�");
		sc.close();
	}
}
