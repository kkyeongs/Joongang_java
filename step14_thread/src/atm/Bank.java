package atm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bank implements Runnable{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	private long balance; // ã�� �ݾ�
	private long depositMoney=100000; // ���� �ܾ�
	
	public Bank() {
		
	}
	
	public synchronized void run() {
		System.out.println(Thread.currentThread().getName()+"���� �������"); // ������ ���� ����, ���ο� ����
		System.out.print("����Ͻ� �ݾ��� �Է��� �ּ��� : ");
		try {
			balance=Long.parseLong(br.readLine());
		} catch (NumberFormatException | IOException e) {e.printStackTrace();}
		withDraw();
	}

	public void withDraw() {
		if(depositMoney>=balance) {
			if(balance%10000==0) {
				depositMoney=depositMoney-balance;
				System.out.println("���� �ݾ��� "+depositMoney+"�� �Դϴ�");
			} else {
				System.out.println("���� ������ �Է��ϼ���");
			}
		} else {
			System.out.println("�ܾ��� �����մϴ�");
		}
	}
}


















