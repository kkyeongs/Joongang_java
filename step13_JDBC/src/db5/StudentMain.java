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
			System.out.print("1.추가 2.검색 3.전체보기 4.종료\n선택(1-4) : "); n=sc.nextInt();
			switch (n) {
			case 1:
				System.out.print("이름 입력 : ");		entity.setName(sc.next());
				System.out.print("국어점수 입력 : ");	entity.setKor(sc.nextInt());
				System.out.print("영어점수 입력 : ");	entity.setEng(sc.nextInt());
				System.out.print("수학점수 입력 : ");	entity.setMat(sc.nextInt());
				biz.insertStudent(entity);
				break;
			case 2:
				System.out.print("이름을 입력하시오 : "); name=sc.next();
				biz.getStudent(name);
				break;
			case 3:
				biz.getStudentList();
				break;
			case 4:
				System.out.println("** 고생하셨습니다 **");
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