package step01_����;

public class DataType2 {

	public static void main(String[] args) {
		// �����
		// System.out.printf("�޼��� or �����", ����1, ����2, ...����n);
		// ����ڿ� ������ ������ ��ġ�ؾ� ��
		// ����
		// %s = String
		// %c = char
		// %d = int ����
		// %f = double, float �Ǽ�
		
		String name = "�̼���";
		System.out.printf("�̸� : %s\n", name);
		
		String dept = "���ߺ�";
		System.out.printf("�μ� : %s\n", dept);
		
		char gender = '��';
		System.out.printf("���� : %c\n", gender);
		
		double score = 85.3;
		System.out.printf("���� : %10.1f\n", score);
		System.out.printf("���� : %-10.1f\n", score);
		System.out.printf("���� : %.1f\n", score);
		
		int age = 23;
		System.out.printf("���� : %d\n", age);
	}
}