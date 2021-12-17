package 주말과제;

import java.util.Scanner;

public class ExamTest07 {
	public static void main(String[] args) {
		int hour, minute, second, temp;
		Scanner sc=new Scanner(System.in);

		do {
			System.out.print("초 입력 : ");		temp = sc.nextInt();
			if(temp>3600) {
				hour=temp/3600;
				minute=hour/60;
				second=temp%60;
				System.out.println("["+hour+"]시 ["+minute+"]분 ["+second+"]초 입니다");
			} else if(temp>60||temp<=3600) {
				minute=temp/60;
				second=temp%60;
				System.out.println("["+minute+"]분 ["+second+"]초 입니다");
			} else if(temp==0)
				break;
		} while (true);
		System.out.println("프로그램을 종료합니다");
		sc.close();
	}
}