package step03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputTest3 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String name;
		char gender;
		int age;
		// �Է��� �޽���, �Է��϶�� �޽���
		System.out.print("�̸� : ");
		name = br.readLine();
		
		System.out.print("���� : ");
		gender = br.readLine().charAt(0); // �Էµ� ���ڿ����� (0)��° �ڸ�
		
		System.out.print("���� : ");
		age = Integer.parseInt(br.readLine());
		
		System.out.println("�̸��� " + name + "�Դϴ�");
		System.out.println("������ " + gender + "���Դϴ�");
		System.out.println("���̴� " + age + "���Դϴ�");
	}
}
