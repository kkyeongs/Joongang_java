package object;

public class ObjectEx4 {

	public static void main(String[] args) {
		
		Employee em = new Employee();
		em.setEmployee("���޷�", "�ѹ���", 2000000, 90.54);
		System.out.println(em.toString());
		
		em.setName("�̼���");
		em.setDept("���ߺ�");
		em.setPay(1500000);
		em.setScore(85.75);
		System.out.println(em.toString());
		
		Employee em2 = new Employee();
		em2 = em; // em2 �� em�� ���� ������ ����(����Ų��)
		em2.setEmployee("īī��", "�ѹ���", 2000000, 90.54);
		
		// em2�� �ٲ�µ� em�� ���� �ٲ��, ���� ������ ���� ����
		System.out.println(em.toString());
	}
}