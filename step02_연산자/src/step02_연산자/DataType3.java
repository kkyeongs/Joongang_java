package step02_������;

public class DataType3 {

	public static void main(String[] args) {
		// ���� ������ �����ؼ� ���
		// �̸� : �̼��� <-- println() ���
		// ���� : 25�� <-- print() ���
		// �μ� : ���ߺ� <-- printf() ���
		// ���� : 87.5��
		
		String name = "�̼���";
		int age = 25;
		String where = "���ߺ�";
		float grade = 87.5f;
				
		System.out.println("�̸� : " + name);
		System.out.print("���� : " + age + "��\n");
		System.out.printf("�μ� : %s\n���� : %.1f\n", where, grade);
	}
}