package object;

class Emp {
	private String name;
	private String dept;
	private int salary;
	
	public void setEmp(String name, String dept, int salary) {
		this.name = name;
		this.dept = dept;
		this.salary = salary;
	}
	
	public void printEmp() {
		System.out.println(name + " ����� " + dept + "�� �ٹ��ϸ� " + salary + "���� �޿��� �޽��ϴ�");
	}
}

public class ObjectTest1 {

	public static void main(String[] args) {
		
		// Ŭ������ Emp
		// -name:String		-dept:String		-salary:int
		// +setEmp(-name:String		-dept:String		-salary:int) void
		// printEmp() void
		Emp em = new Emp();
		em.setEmp("ȫ�浿", "���ߺ�", 1500000);
		em.printEmp();
	}
}