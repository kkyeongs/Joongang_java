package �ָ�����;

import java.util.Scanner;

public class ExamTest07 {
	public static void main(String[] args) {
		int hour, minute, second, temp;
		Scanner sc=new Scanner(System.in);

		do {
			System.out.print("�� �Է� : ");		temp = sc.nextInt();
			if(temp>3600) {
				hour=temp/3600;
				minute=hour/60;
				second=temp%60;
				System.out.println("["+hour+"]�� ["+minute+"]�� ["+second+"]�� �Դϴ�");
			} else if(temp>60||temp<=3600) {
				minute=temp/60;
				second=temp%60;
				System.out.println("["+minute+"]�� ["+second+"]�� �Դϴ�");
			} else if(temp==0)
				break;
		} while (true);
		System.out.println("���α׷��� �����մϴ�");
		sc.close();
	}
}