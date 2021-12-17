package test12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex12 {

	public static void compute(String item, int qtv, int price) {
		System.out.println("품명 : " + item);
		System.out.println("수량 : " + qtv);
		System.out.println("단가 : " + price*qtv + "원");
	}
	
	public static void main(String[] args) throws IOException {

		String item;
		int qtv;
		int price;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("품명을 입력하시오 : ");
		item = br.readLine();
		System.out.print("수량을 입력하시오 : ");
		qtv = Integer.parseInt(br.readLine());
		System.out.print("단가를 입력하시오 : ");
		price = Integer.parseInt(br.readLine());
		
		compute(item, qtv, price);
	}
}