package step03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputTest4 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// ������ ���� ����Ͽ� ����ϼ���
		// �������� �Է��ϼ��� " 5
		// ���� ���� : 78.5          <-- ������*������*3.14
		// ���� �ѷ� : 31.4          <-- 2*������*3.14
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int ������ = 0;
		
		System.out.print("�������� �Է��ϼ��� : ");
		������ = Integer.parseInt(br.readLine());
		
		double ���� = (������ * ������ * 3.14);
		double �ѷ� = (2 * ������ * 3.14);
		
		System.out.println("���� ���� : " + ����);
		System.out.printf("���� �ѷ� : %.1f\n", �ѷ�);
	}
} 