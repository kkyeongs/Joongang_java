package �ָ�����;

import java.io.IOException;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class ExamTest05 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		Scanner sc=new Scanner(System.in);
		String s_rn=null;
		while (true) {
			System.out.print("����(1), ����(2), ��(3) �Է� : ");
			int n = sc.nextInt();
			String u_n=null;
			if(n==1)
				u_n="����";
			else if(n==2)
				u_n="����";
			else if(n==3)
				u_n="��";

			int int_rn = (int) (Math.random() * 3) + 1;
			if(int_rn==1)
				s_rn="����";
			else if(int_rn==2)
				s_rn="����";
			else if(int_rn==3)
				s_rn="��";
			
			switch (n) {
			case 1:
				if (int_rn == 1) {
					System.out.println("��ǻ�� : "+s_rn+"\t����� : "+u_n+"\t��� : You Draw!!\n");
				} else if (int_rn == 2) {
					System.out.println("��ǻ�� : "+s_rn+"\t����� : "+u_n+"\t��� : You Lose!!\n");
				} else if (int_rn == 3) {
					System.out.println("��ǻ�� : "+s_rn+"\t����� : "+u_n+"\t��� : You Win!!\n");
				}
				break;
			case 2:
				if (int_rn == 1) {
					System.out.println("��ǻ�� : "+s_rn+"\t����� : "+u_n+"\t��� : You Win!!\n");
				} else if (int_rn == 2) {
					System.out.println("��ǻ�� : "+s_rn+"\t����� : "+u_n+"\t��� : You Draw!!\n");
				} else if (int_rn == 3) {
					System.out.println("��ǻ�� : "+s_rn+"\t����� : "+u_n+"\t��� : You Lose!!\n");
				}
				break;
			case 3:
				if (int_rn == 1) {
					System.out.println("��ǻ�� : "+s_rn+"\t����� : "+u_n+"\t��� : You Lose!!\n");
				} else if (int_rn == 2) {
					System.out.println("��ǻ�� : "+s_rn+"\t����� : "+u_n+"\t��� : You Win!!\n");
				} else if (int_rn == 3) {
					System.out.println("��ǻ�� : "+s_rn+"\t����� : "+u_n+"\t��� : You Draw!!\n");
				}
				break;
			default:
				System.out.println("�߸��Է�\n");
				break;
			}
		}
	}
}


















