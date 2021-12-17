package 주말과제;

import java.io.IOException;
import java.util.Scanner;

public class ExamTest02 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc=new Scanner(System.in);
		int age=0;
		System.out.print("나이를 입력 하세요 : ");	age=sc.nextInt();
		
		if(age>=65) {
			System.out.println("입장료는 10000원입니다");
		} else if(age>=13&&age<65) {
			System.out.println("입장료는 20000원입니다");
		} else if(age>=6&&age<13) {
			System.out.println("입장료는 8000원입니다");
		} else if(age<6) {
			System.out.println("입장료는 5000원입니다");
		}
		sc.close();
	}
}
