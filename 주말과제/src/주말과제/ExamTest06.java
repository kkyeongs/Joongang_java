package �ָ�����;

import java.util.Scanner;

public class ExamTest06{
	public static void main(String[] args) {
		int productPrice = 2340;
		Scanner sc = new Scanner(System.in);
		System.out.print("�ݾ��� ������ �ּ��� : ");
		int money = sc.nextInt();
		
		//1�ܰ�--------------------------------------------------------
		//�Ž�����   ���ұݾ�   ��ǰ����
		int change=money-productPrice;
		if(change > 0){
			System.out.println("��ǰ�� ���� : " + productPrice);
			System.out.println("�Ž����� : " + change);
		}else if(change==0){
			System.out.println("�Ž��� ���� �����ϴ�");
		}else{
			System.out.println("��ǰ�� �����Ҽ� �����");
		}
		
		int n=change%1000/500;
		System.out.println("500 ���� : "+n+"��");
		n=change%500/100;
		System.out.println("100 ���� : "+n+"��");
		n=change%100/50;
		System.out.println("50 ���� : "+n+"��");
		n=change%50/10;
		System.out.println("10 ���� : "+n+"��");
		
		sc.nextLine();
		sc.close();
	}
}





















