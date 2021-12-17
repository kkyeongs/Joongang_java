package object;

class Emp3 {
	private String name;
	private String dept;
	private int salary;
	
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
	
	public String toString() {	// 출력문의 구조는 여기서
		return name + " 사원은 " + dept + "에 근무하며 " + salary + "원의 급여를 받습니다";
	}
}

public class ObjectTest3 {

	public static void main(String[] args) {
		
		// 클래스명 Emp3
		// -name:String		-dept:String		-salary:int
		// getter setter
		// toString string
		Emp3 em = new Emp3();
		em.setName("강호동");
		em.setDept("영업부");
		em.setSalary(1500000);
		System.out.println(em.toString());
	}
}