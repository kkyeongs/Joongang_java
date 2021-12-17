package Test41;

public class Test41 extends Salary {
	
	private String department;
	
	public Test41() {
		
	}

	public Test41(String name, int salary, String department) {
		super(name, salary);
		this.department = department;
	}

	public void viewInfomation() {
		super.viewInfomation();
		System.out.println("부서 : " + department);
	}

	public static void main(String[] args) {
		Test41 ob = new Test41("홍길동",85000000,"개발부");
		ob.viewInfomation();
	}
}