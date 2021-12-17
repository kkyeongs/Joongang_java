package db5;

import java.util.Scanner;

public class StudentMain {
	StudentEntity entity=null;
	StudentBiz biz=null;
	Scanner sc=null;

	public StudentMain() {
		sc=new Scanner(System.in);
		biz=new StudentBiz();
		entity=new StudentEntity();
	}
	
	public void menu() {
		String name=null;
		int n=0;
		
		while(true) {
			System.out.print("1.�߰� 2.�˻� 3.��ü���� 4.����\n����(1-4) : "); n=sc.nextInt();
			switch (n) {
			case 1:
				System.out.print("�̸� �Է� : ");		entity.setName(sc.next());
				System.out.print("�������� �Է� : ");	entity.setKor(sc.nextInt());
				System.out.print("�������� �Է� : ");	entity.setEng(sc.nextInt());
				System.out.print("�������� �Է� : ");	entity.setMat(sc.nextInt());
				biz.insertStudent(entity);
				break;
			case 2:
				System.out.print("�̸��� �Է��Ͻÿ� : "); name=sc.next();
				biz.getStudent(name);
				break;
			case 3:
				biz.getStudentList();
				break;
			case 4:
				System.out.println("** ����ϼ̽��ϴ� **");
				System.exit(0);
			default:
				biz.defaultMassage();
				break;
			}
		}
	}

	public static void main(String[] args) {
		new StudentMain().menu();
	}
}