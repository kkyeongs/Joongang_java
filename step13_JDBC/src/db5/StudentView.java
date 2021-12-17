package db5;

import java.util.List;

public class StudentView {
	
	public void insertStudent(String name) {
		if(name!=null) {
			System.out.println(name+"님이 추가되었습니다");
		} else {
			System.out.println("데이터가 없다");
		}
	}
	
	public void getStudent(StudentEntity entity) {
		if(entity!=null) {
			System.out.print("번호 : "+entity.getNum()+"  ");
			System.out.print("이름 : "+entity.getName() + "  ");
			System.out.print("국어 : "+entity.getKor() + "  ");
			System.out.print("영어 : "+entity.getEng() + "  ");
			System.out.print("수학 : "+entity.getMat() + "  ");
			System.out.print("합계 : "+entity.getTot() + "  ");
			System.out.println("평균 : "+entity.getAvg() + "  ");
		} else {
			System.out.println("데이터가 없다");
		}
	}

	public void getStudentList(List<StudentEntity> list) {
		if (list != null) {
			for (StudentEntity entity : list) {
				System.out.print("이름 : "+entity.getName() + "  ");
				System.out.print("국어 : "+entity.getKor() + "  ");
				System.out.print("영어 : "+entity.getEng() + "  ");
				System.out.print("수학 : "+entity.getMat() + "  ");
				System.out.print("합계 : "+entity.getTot() + "  ");
				System.out.println("평균 : "+entity.getAvg() + "  ");
			}
		} else {
			System.out.println("데이터가 없다");
		}
	}

	public void defaultMassage() {
		System.out.println("다시 입력해주세요 :)");
	}
}
















