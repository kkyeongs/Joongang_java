package Test22;

public class SalarySub extends Salary {
	private String dept;
	
	public SalarySub() {
		
	}

	public SalarySub(String dept) {
		this.dept = dept;
	}
	
	public SalarySub(String name, int salary, String dept) {
		super(name, salary);	
		this.dept = dept;
	}

	public String toString() {
		return super.toString() + "\nºÎ¼­ : " + dept;
	}
}