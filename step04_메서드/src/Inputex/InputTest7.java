package Inputex;

public class InputTest7 {

	public static void main(String[] args) {
		
		// argument�� �̿��Ͽ� �Է� �ް� ���
		// $ java InputTest7 103 ��ȣ�� C 75.3
		// ���ȭ��
		// �����ȣ : 103
		// ����̸� : ��ȣ��
		// �μ��ڵ� : C
		// �Ի缺�� : 75.3
		// printf�� �� �� ����Ͽ� ���
		
		int eno = Integer.parseInt(args[0]);			
		String ename = args[1];	
		char dept = args[2].charAt(0);		
		double score = Double.parseDouble(args[3]);
		
		System.out.printf("�����ȣ : %d\n"
				+ "����̸� : %s\n"
				+ "�μ��ڵ� : %c\n"
				+ "�Ի缺�� : %.1f", eno, ename, dept, score);
	}
}