package 주말과제;

import java.util.Scanner;

public class ExamTest03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a=null;
		int sum=0;
		
		System.out.print("3자리 정수를 입력하세요 : ");	a=sc.next();
		
		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i)>=48 && a.charAt(i)<=57) {
				sum+=a.charAt(i)-48;
			}
		}
		System.out.println(a.length()+"자리의 합은 "+sum+" 입니다");
		sc.close();
	}
}
