package ifex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.Scanner;

public class IfEx4 {

	public static void main(String[] args) throws IOException {
		// ��ø if�� ���
		// 3�� ������ ������ �Է� �޾Ƽ� �հ�, ���հ��� �����Ͽ� ���
		// 3�� ������ ���� 40�� �̻�, ��� 60�̻� "�հ�"
		// ����� 60���� ������ �Ѱ��� �����̶� 40�� �̸� "�������� ���հ�"
		// ����� 60�̸� "���հ�"
		
		// ����� ù��° ����, �� 40�� �̻��� �ι�° ����
		
		// ��°��
		// ���������Է� : 95
		// ���������Է� : 85
		// ���������Է� : 73
		// ��� : �հ�
		
		// ���������Է� : 95
		// ���������Է� : 85
		// ���������Է� : 30
		// ��� : �������� ���հ�
		
		// ���������Է� : 55
		// ���������Է� : 35
		// ���������Է� : 60
		// ��� : ���հ�
		
		// BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		// Scanner sc = new Scanner(System.in);
		String ����, ����, ����;
		
		for (int i = 0; i < 3; i++) {
			System.out.print("���������Է� : ");
			// int kor = Integer.parseInt(br.readLine());
			���� = br.readLine();	 // Ű����� �Է��� �޴´�
			System.out.print("���������Է� : ");
			���� = br.readLine();
			System.out.print("���������Է� : ");
			���� = br.readLine();
		
			int kor = Integer.parseInt(����);
			int eng = Integer.parseInt(����);
			int mat = Integer.parseInt(����);
			
			if((kor + eng + mat) / 3 < 60) {
				System.out.println("��� : ���հ�");
			} else if(kor >= 40 && eng >= 40 && mat >= 40) {
				System.out.println("��� : �հ�");
			} else {
				System.out.println("��� : �������� ���հ�");
			}
			System.out.println();
		}
		System.out.println("----------------------------------");

		int kor1, eng1, mat1; // �� ���� �� �ʱ�ȭ
		double avg;
		
		System.out.println("���������Է� : ");
		kor1 = Integer.parseInt(br.readLine());
		System.out.println("���������Է� : ");
		eng1 = Integer.parseInt(br.readLine());
		System.out.println("���������Է� : ");
		mat1 = Integer.parseInt(br.readLine());
		
		avg = (kor1 + eng1 + mat1) / 3.0;
		
		System.out.print("��� : ");
		if(avg >= 60) {
			if(kor1 >= 40 && eng1 >= 40 && mat1 >= 40) {
				System.out.println("�հ�");
			} else {
				System.out.println("�������� ���հ�");
			}
		} else {
			System.out.println("���հ�");
		}
		
		/* or ���� ��빮
		if(avg >= 60) {
			if(kor < 40 || eng < 40 || mat < 40) {
				System.out.println("�������� ���հ�");
			} else {
				System.out.println("�հ�");
			}
		}
		*/
	}
}