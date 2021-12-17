package atm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bank implements Runnable{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	private long balance; // 찾는 금액
	private long depositMoney=100000; // 통장 잔액
	
	public Bank() {
		
	}
	
	public synchronized void run() {
		System.out.println(Thread.currentThread().getName()+"고객님 어서오세요"); // 쓰레드 네임 지정, 메인에 있음
		System.out.print("출금하실 금액을 입려해 주세요 : ");
		try {
			balance=Long.parseLong(br.readLine());
		} catch (NumberFormatException | IOException e) {e.printStackTrace();}
		withDraw();
	}

	public void withDraw() {
		if(depositMoney>=balance) {
			if(balance%10000==0) {
				depositMoney=depositMoney-balance;
				System.out.println("남은 금액은 "+depositMoney+"원 입니다");
			} else {
				System.out.println("만원 단위로 입력하세요");
			}
		} else {
			System.out.println("잔액이 부족합니다");
		}
	}
}


















