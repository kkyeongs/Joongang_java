package step02_������;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputTest1 {

	public static void main(String[] args) throws IOException {
		// �ַܼ� �����͸� �Է¹޴� ���
		// �̸��� �Է��ϼ��� : ��ȣ��
		// �̸��� ��ȣ���Դϴ�.
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		String name;
		System.out.print("�̸��� �Է��ϼ��� : ");
		name = br.readLine();	// Ű����� �Է��� �޴´�
		System.out.println("�̸��� " + name + "�Դϴ�");
		
		char gender;
		System.out.print("������ �Է��ϼ��� : ");
		gender = br.readLine().charAt(0);
		System.out.println("������ " + gender + "���Դϴ�");
		
		int age;
		System.out.print("���̸� �Է��ϼ��� : ");
		age = Integer.parseInt(br.readLine());
		System.out.println("���̴� " + age + "���Դϴ�");
		
		float tall;
		System.out.print("������ �Է��ϼ��� : ");
		tall = Float.parseFloat(br.readLine());
		System.out.println("������ " + tall + "cm�Դϴ�");
		
		double weight;
		System.out.print("ü���� �Է��ϼ��� : ");
		weight = Double.parseDouble(br.readLine());
		System.out.println("ü���� " + weight + "kg�Դϴ�");
		
		// .�� �ǹ�
		// system . out . println();
		//       ����    �Է�
		// Ŭ���� �̸����� �빮��, () ��ȣ ���� ����
		// () ��ȣ �ٴ°� �ҹ��ڷ� ����
	}
}
