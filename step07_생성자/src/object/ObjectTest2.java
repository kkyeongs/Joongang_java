package object;

class Emp2 {
	private String name;
	private String dept;
	private int salary;
	
	public void setEmp(String name, String dept, int salary) {
		this.name = name;
		this.dept = dept;
		this.salary = salary;
	}
	
	public String printEmp() {
		return name + " ����� " + dept + "�� �ٹ��ϸ� " + salary + "���� �޿��� �޽��ϴ�";
	}
}

public class ObjectTest2 {

	public static void main(String[] args) {
		
		// Ŭ������ Emp
		// -name:String		-dept:String		-salary:int
		// +setEmp(-name:String		-dept:String		-salary:int) void
		// printEmp() String
		Emp2 em = new Emp2();
		em.setEmp("ȫ�浿", "���ߺ�", 1500000);
		System.out.println(em.printEmp());
	}
}