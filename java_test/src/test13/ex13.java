package test13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex13 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		int[] month = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a;
		
		System.out.print("���ϴ� month�� �Է��Ͻÿ� : ");
		a = Integer.parseInt(br.readLine());
		System.out.println(a + "���� " + month[a-1] + "�� �Դϴ�.");
	}
}