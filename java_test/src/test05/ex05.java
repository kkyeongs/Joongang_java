package test05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex05 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("**** �ﰢ���� ���� ���ϱ� ****");
		System.out.print("�غ� : ");
		int �غ� = Integer.parseInt(br.readLine());
		System.out.print("���� : ");
		int ���� = Integer.parseInt(br.readLine());
		
	    double ���� = (�غ� * ����) / 2;
	    System.out.printf("���� : %.2f", ����);
	}
}