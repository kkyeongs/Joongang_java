package test09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex09 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("x�� ���� �Է��Ͻÿ� : ");
		int x = Integer.parseInt(br.readLine());
		System.out.print("y�� ���� �Է��Ͻÿ� : ");
		int y = Integer.parseInt(br.readLine());
		
		int a = 1;
		for (int i = 1; i <= y; i++) {
			a = a * x;
		}
		System.out.println(x + "�� " + y + "���� " + a);
	}
}