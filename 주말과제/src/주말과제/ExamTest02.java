package �ָ�����;

import java.io.IOException;
import java.util.Scanner;

public class ExamTest02 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc=new Scanner(System.in);
		int age=0;
		System.out.print("���̸� �Է� �ϼ��� : ");	age=sc.nextInt();
		
		if(age>=65) {
			System.out.println("������ 10000���Դϴ�");
		} else if(age>=13&&age<65) {
			System.out.println("������ 20000���Դϴ�");
		} else if(age>=6&&age<13) {
			System.out.println("������ 8000���Դϴ�");
		} else if(age<6) {
			System.out.println("������ 5000���Դϴ�");
		}
		sc.close();
	}
}
