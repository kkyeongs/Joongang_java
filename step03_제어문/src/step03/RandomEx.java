package step03;

import java.util.Random;

public class RandomEx {

	public static void main(String[] args) {
		// ���� �Լ� : ��ǻ�Ͱ� ������ ���� �߻�
		//			�ǻ� ����(pseudo random) : ������ ������ �������� ���� ���� �߻�
		
		// Math Ŭ������ �̿�
		System.out.println(Math.random()); // 0�̻� 1�̸��� ���� �߻�
		System.out.println(Math.random()*10+1);
		System.out.println((int)(Math.random()*10+1)); // 1�̻� 11�̸��� ��, n�̻� ~ n�̸�
		System.out.println("-----------------------------");
		
		// ���� ���ϱ�!!!!
		// 20 ~ 40 ���̸� ��Ÿ������
		// 20 �̻�! 41 �̸�!
		// Math.random()*	21			 +	 20
		//          41(�̸���)-20(�̻�)    ���۰�(�̻�)
		
		// 51���� 80������ ���� ���� ����        51�̻� 81�̸�
		System.out.println((int)(Math.random()*30+51));
		
		// 50���� 80������ ���� ���� ����        50�̻� 81�̸�
		System.out.println((int)(Math.random()*31+50));
		System.out.println("--------------------------------");
		
		// Random Ŭ���� �̿�
		Random rd = new Random();
		System.out.println(rd.nextInt(101)); // 0���� ~ 101�̸�!�� ��
		
		//                (�̸���) (�̻�)
		int n1 = rd.nextInt(101) + 0; // 0�̻� 101�̸��� ���� ����
		int n2 = rd.nextInt(31) + 50; // 50�̻� 81�̸��� ���� ����
		int n3 = rd.nextInt(41) + 30; // 30�̻� 71�̸��� ���� ����
		System.out.println(n1 + " " + n2 + " " + n3);
	}
}