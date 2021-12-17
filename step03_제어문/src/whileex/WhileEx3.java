package whileex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WhileEx3 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// switch�� while�� �̿��� �޴� ���� ���α׷�
		// 1. �簢�� 2. �ﰢ�� 3. �� 4. ����
		// �����ϼ��� : 1 
		// �簢���� ���õǾ����ϴ�
		// 1. �簢�� 2. �ﰢ�� 3. �� 4. ����
		// �����ϼ��� : 2 
		// �ﰢ���� ���õǾ����ϴ�
		// 1. �簢�� 2. �ﰢ�� 3. �� 4. ����
		// �����ϼ��� : 3 
		// ���� ���õǾ����ϴ�
		// ***** ���α׷��� �����մϴ� *****
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			System.out.print("1.�簢�� 2.�ﰢ�� 3.�� 4.���� \n�����ϼ��� : ");
			int num = Integer.parseInt(br.readLine());
			switch(num) {
			case 1: System.out.println("�簢���� ���õǾ����ϴ�"); break;
			case 2: System.out.println("�ﰢ���� ���õǾ����ϴ�"); break;
			case 3: System.out.println("���� ���õǾ����ϴ�"); break;
			case 4: System.out.println("***** ���α׷��� �����մϴ� *****"); 
			System.exit(0); // ��������
			}
		}
	}
}