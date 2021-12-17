package 주말과제;

import java.io.IOException;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class ExamTest05 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		Scanner sc=new Scanner(System.in);
		String s_rn=null;
		while (true) {
			System.out.print("가위(1), 바위(2), 보(3) 입력 : ");
			int n = sc.nextInt();
			String u_n=null;
			if(n==1)
				u_n="가위";
			else if(n==2)
				u_n="바위";
			else if(n==3)
				u_n="보";

			int int_rn = (int) (Math.random() * 3) + 1;
			if(int_rn==1)
				s_rn="가위";
			else if(int_rn==2)
				s_rn="바위";
			else if(int_rn==3)
				s_rn="보";
			
			switch (n) {
			case 1:
				if (int_rn == 1) {
					System.out.println("컴퓨터 : "+s_rn+"\t사용자 : "+u_n+"\t결과 : You Draw!!\n");
				} else if (int_rn == 2) {
					System.out.println("컴퓨터 : "+s_rn+"\t사용자 : "+u_n+"\t결과 : You Lose!!\n");
				} else if (int_rn == 3) {
					System.out.println("컴퓨터 : "+s_rn+"\t사용자 : "+u_n+"\t결과 : You Win!!\n");
				}
				break;
			case 2:
				if (int_rn == 1) {
					System.out.println("컴퓨터 : "+s_rn+"\t사용자 : "+u_n+"\t결과 : You Win!!\n");
				} else if (int_rn == 2) {
					System.out.println("컴퓨터 : "+s_rn+"\t사용자 : "+u_n+"\t결과 : You Draw!!\n");
				} else if (int_rn == 3) {
					System.out.println("컴퓨터 : "+s_rn+"\t사용자 : "+u_n+"\t결과 : You Lose!!\n");
				}
				break;
			case 3:
				if (int_rn == 1) {
					System.out.println("컴퓨터 : "+s_rn+"\t사용자 : "+u_n+"\t결과 : You Lose!!\n");
				} else if (int_rn == 2) {
					System.out.println("컴퓨터 : "+s_rn+"\t사용자 : "+u_n+"\t결과 : You Win!!\n");
				} else if (int_rn == 3) {
					System.out.println("컴퓨터 : "+s_rn+"\t사용자 : "+u_n+"\t결과 : You Draw!!\n");
				}
				break;
			default:
				System.out.println("잘못입력\n");
				break;
			}
		}
	}
}


















