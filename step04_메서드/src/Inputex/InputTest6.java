package Inputex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputTest6 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		// �����ȣ �Է� : 102(int)
		// ����̸� �Է� : �̼���(string)
		// �μ��ڵ� �Է� : B(char)
		// �Ի缺�� �Է� : 90.54(double)
		
		// ���ȭ��
		// �����ȣ : 102
		// ����̸� : �̼���
		// �μ��ڵ� : B
		// �Ի缺�� : 90.54
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int eno;			// 4����Ʈ
		String ename;	// ��ü
		char dept;		// 2����Ʈ, �����ڷ�
		double score;	// 8����Ʈ, �Ǽ��ڷ���, ������ // float : ������ �Ǽ���, 4����Ʈ
		
		System.out.print("�����ȣ �Է� : ");
		eno = Integer.parseInt(br.readLine());
		
		System.out.print("����̸� �Է� : ");
		ename = br.readLine();
		
		System.out.print("�μ��ڵ� �Է� : ");
		dept = br.readLine().charAt(0);
		
		System.out.print("�Ի缺�� �Է� : ");
		score = Double.parseDouble(br.readLine()); 
		// String str = br.readLine( ); ����ڰ� �Է��� ���� str�� ���ϴ�.
		// float fnum = Float.parseFloat(str); str�� ��� ���� float���� ��ȯ �� fnum�� ����
		// double dnum = Double.parseDouble(str); str�� ��� ���� double�� ��ȯ �� dnum�� ����
		// int num = Integer.parseInt(str); str�� ��� ���� int�� ��ȯ �� numj�� ����
		
		System.out.println("�����ȣ : " + eno);
		System.out.println("����̸� : " + ename);
		System.out.println("�μ��ڵ� : " + dept);
		System.out.println("�Ի缺�� : " + score);
	}
}