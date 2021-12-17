package emp;

import java.util.List;
import java.util.Scanner;

public class EmpMain {

	public static void main(String[] args) {
		EmpDAO dao = new EmpDAO();
		System.out.println("*** ��� ��� ����ϱ� ***");
		
		List<EmpVO> list = dao.getEmpList();	// �ٿ��� ���� ��� ���� ���� �Լ�
												// dao�� list�� ���ϵż� ���µ� �̰� ���� ���ؼ���
												// list�� ���������Ѵ�
		
		for (EmpVO vo : list) {
			System.out.println("�̸� : " + vo.getName());
			System.out.println("�μ� : " + vo.getDept());
			System.out.println("�޿� : " + vo.getSalary() + "\n");
		}
		System.out.println("------------------------------------");
		
		System.out.println("*** �˻� ��� ����ϱ� ***");
		System.out.print("�˻��� ��� �̸� : ");
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		
		EmpVO em = dao.getEMP(name);
		if (em == null) {
			System.out.println("ã�� ����� ����");
		} else {
			System.out.println("�̸� : " + em.getName());
			System.out.println("�μ� : " + em.getDept());
			System.out.println("�޿� : " + em.getSalary() + "\n");
		}
	}
}