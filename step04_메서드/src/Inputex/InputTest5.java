package Inputex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputTest5 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		// eno : 101
		// ename : ȫ�浿
		// dept : A
		// score : 85.9
		
		// ���ȭ��
		// �����ȣ : 101
		// ����̸� : ȫ�浿
		// �μ��ڵ� : A
		// �Ի缺�� : 85.9
		
		int eno = 101;			// 4����Ʈ
		String ename = "ȫ�浿";	// ��ü
		char dept = 'A';		// 2����Ʈ, �����ڷ�
		double score = 85.9;	// 8����Ʈ, �Ǽ��ڷ���, ������ // float : ������ �Ǽ���, 4����Ʈ
		
		System.out.printf("�����ȣ : %d\n", eno);
		System.out.printf("����̸� : %s\n", ename);
		System.out.printf("�μ��ڵ� : %c\n", dept);
		System.out.printf("�Ի缺�� : %.1f	\n", score); // %.(�ڸ���)f �ؾ��Ѵ�
	}
}