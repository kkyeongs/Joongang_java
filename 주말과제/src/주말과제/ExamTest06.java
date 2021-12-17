package 주말과제;

import java.util.Scanner;

public class ExamTest06{
	public static void main(String[] args) {
		int productPrice = 2340;
		Scanner sc = new Scanner(System.in);
		System.out.print("금액을 지불해 주세요 : ");
		int money = sc.nextInt();
		
		//1단계--------------------------------------------------------
		//거스름돈   지불금액   상품가격
		int change=money-productPrice;
		if(change > 0){
			System.out.println("상품의 가격 : " + productPrice);
			System.out.println("거스름돈 : " + change);
		}else if(change==0){
			System.out.println("거스름 돈이 없습니다");
		}else{
			System.out.println("재품을 구매할수 없어요");
		}
		
		int n=change%1000/500;
		System.out.println("500 동전 : "+n+"개");
		n=change%500/100;
		System.out.println("100 동전 : "+n+"개");
		n=change%100/50;
		System.out.println("50 동전 : "+n+"개");
		n=change%50/10;
		System.out.println("10 동전 : "+n+"개");
		
		sc.nextLine();
		sc.close();
	}
}





















