package db5;

import java.util.List;

public class StudentBiz {
	StudentDao dao=new StudentDao();
	StudentView view=new StudentView();
	StudentEntity entity=new StudentEntity();
	List<StudentEntity> list=null;
	
	public void insertStudent(StudentEntity entity) {
		String name=null;
		if(entity.getKor()<=100 && entity.getKor()>=0 && 
				entity.getEng()<=100 && entity.getEng()>=0 &&
				entity.getMat()<=100 && entity.getMat()>=0) {
			name=dao.insertStudent(entity);
		} else {
			System.out.println("값이 올바르지 않습니다 범위(0~100)");
		}
		view.insertStudent(name);
	}
	
	public void getStudent(String name) {
		entity=dao.getStudent(name);
		view.getStudent(entity);
	}
	
	public void getStudentList() {
		list=dao.getStudentList();
		view.getStudentList(list);
	}
	
	public void defaultMassage() {
		view.defaultMassage();
	}
}