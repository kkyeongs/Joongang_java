package test06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex06 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Input name: ");
		String name = br.readLine();
		System.out.print("Input gender: ");
		char gender = br.readLine().charAt(0);
		System.out.print("Input age: ");
		int age = Integer.parseInt(br.readLine());
		System.out.print("Input tall: ");
		double tall = Double.parseDouble(br.readLine());

		System.out.println("�̸� : " + name);
		if (gender == 'M') {
			System.out.println("���� : ����");
		} else {
			System.out.println("���� : ����");
		}
		System.out.println("���� : " + age);
		System.out.println("���� : " + tall + "cm");
	}
}