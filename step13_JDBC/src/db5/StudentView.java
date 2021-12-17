package db5;

import java.util.List;

public class StudentView {
	
	public void insertStudent(String name) {
		if(name!=null) {
			System.out.println(name+"���� �߰��Ǿ����ϴ�");
		} else {
			System.out.println("�����Ͱ� ����");
		}
	}
	
	public void getStudent(StudentEntity entity) {
		if(entity!=null) {
			System.out.print("��ȣ : "+entity.getNum()+"  ");
			System.out.print("�̸� : "+entity.getName() + "  ");
			System.out.print("���� : "+entity.getKor() + "  ");
			System.out.print("���� : "+entity.getEng() + "  ");
			System.out.print("���� : "+entity.getMat() + "  ");
			System.out.print("�հ� : "+entity.getTot() + "  ");
			System.out.println("��� : "+entity.getAvg() + "  ");
		} else {
			System.out.println("�����Ͱ� ����");
		}
	}

	public void getStudentList(List<StudentEntity> list) {
		if (list != null) {
			for (StudentEntity entity : list) {
				System.out.print("�̸� : "+entity.getName() + "  ");
				System.out.print("���� : "+entity.getKor() + "  ");
				System.out.print("���� : "+entity.getEng() + "  ");
				System.out.print("���� : "+entity.getMat() + "  ");
				System.out.print("�հ� : "+entity.getTot() + "  ");
				System.out.println("��� : "+entity.getAvg() + "  ");
			}
		} else {
			System.out.println("�����Ͱ� ����");
		}
	}

	public void defaultMassage() {
		System.out.println("�ٽ� �Է����ּ��� :)");
	}
}
















