package constructor;

public class ConstructorEx6 {

	public static void main(String[] args) {
		
		Student st = new Student();
		st.setName("ȫ�浿");
		st.setKor(95);
		st.setEng(85);
		st.setMat(73);
		
		System.out.println(st.toString());
		
		// �Ű����� 4�� �����ڸ� �̿��Ͽ� ���� �����ϰ� (�ε鷹, 95, 85, 73)
		// getter�� �̿��Ͽ� ���
		
		st = new Student("�ε鷹", 95, 85, 73);
		System.out.println("�̸� : " + st.getName());
		System.out.println("���� : " + st.getKor());
		System.out.println("���� : " + st.getEng());
		System.out.println("���� : " + st.getMat());
		System.out.println("��� : " + st.getAvg());
		System.out.println("���� : " + st.getGrade());
	}
}