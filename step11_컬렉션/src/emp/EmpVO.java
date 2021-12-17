package emp;

public class EmpVO {
	//	: 변수 3개, 디폴트생성자, 매개변수 3개 생성자, 게터세터
	// VO(value object) : 값을 갖고있는 객체, 데이터를 하나로 묶어서 전송할 목적으로 만든 클래스
	// entity, dto(data transfer object), bean 
	
	private String name;
	private String dept;
	private int salary;
	
	public EmpVO() {
		
	}

	public EmpVO(String name, String dept, int salary) {
		super();
		this.name = name;
		this.dept = dept;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}

	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
}