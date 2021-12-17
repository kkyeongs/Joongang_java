package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayEx5 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		// ũ�Ⱑ 5���� ������ �迭 ����
		// �迭�� ������ �Է�
		// ����ϰ� 
		// �ִ밪 �ּҰ� ���ϱ�
		// ���ȭ��
		// ar[0]�� ���� �Է��ϼ��� : 25
		// ar[1]�� ���� �Է��ϼ��� : 33
		// ar[2]�� ���� �Է��ϼ��� : -23
		// ar[3]�� ���� �Է��ϼ��� : 55
		// ar[4]�� ���� �Է��ϼ��� : 66
		// 25 33 -23 55 66
		// �ִ밪 : 66
		// �ּҰ� : -23
		
		int[] ar = new int[5];
				
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		for (int i = 0; i < ar.length; i++) {
			System.out.print("ar[" + i + "]�� ���� �Է��ϼ��� : ");
			ar[i] = Integer.parseInt(br.readLine());
		}
		
		for (int i : ar) {
			System.out.print(i + " ");
		}
		
		int max = 0;
		int min = 0;
		
		for (int i = 0; i < ar.length; i++) {
			if(ar[i] > max)
				max = ar[i];
			if(ar[i] < min)
				min = ar[i];
		}
		System.out.println("\n�ִ밪 : " + max);
		System.out.println("�ּҰ� : " + min);
	}
}