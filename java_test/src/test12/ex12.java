package test12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex12 {

	public static void compute(String item, int qtv, int price) {
		System.out.println("ǰ�� : " + item);
		System.out.println("���� : " + qtv);
		System.out.println("�ܰ� : " + price*qtv + "��");
	}
	
	public static void main(String[] args) throws IOException {

		String item;
		int qtv;
		int price;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("ǰ���� �Է��Ͻÿ� : ");
		item = br.readLine();
		System.out.print("������ �Է��Ͻÿ� : ");
		qtv = Integer.parseInt(br.readLine());
		System.out.print("�ܰ��� �Է��Ͻÿ� : ");
		price = Integer.parseInt(br.readLine());
		
		compute(item, qtv, price);
	}
}