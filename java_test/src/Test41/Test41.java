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
		System.out.println("�μ� : " + department);
	}

	public static void main(String[] args) {
		Test41 ob = new Test41("ȫ�浿",85000000,"���ߺ�");
		ob.viewInfomation();
	}
}