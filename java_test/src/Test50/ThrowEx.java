package Test50;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ThrowEx {
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public int dan=0;
	
	public void inputData() throws NumberFormatException, IOException {
		System.out.print("���� �Է��Ͻÿ� : ");
		try {
			dan = Integer.parseInt(br.readLine());
		} catch (Exception e) {
			System.out.println("�������� �Է����ּ���");
		} finally {
			System.out.println("�� �Է� : " + dan);
			br.close();
			guguPrint();
		}
	}
	
	public void guguPrint() {
		for (int i = 1; i < 10; i++) {
			System.out.println(dan+" * "+i+" = "+(dan*i));
		}
	}
}