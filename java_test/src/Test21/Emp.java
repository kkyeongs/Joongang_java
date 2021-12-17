package Test21;

public class Emp {
	String name;
	String dept;
	int salary;
	
	public Emp() {
	
	}
	
	public Emp(String name, String dept, int salary) {
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
	
	public String toString() {
		return name + "은 " + dept + "사원이며 " + salary + "원의 급여를 받습니다";
	}
}
