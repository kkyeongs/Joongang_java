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
	
	public String toString() {	// ��¹��� ������ ���⼭
		return name + " ����� " + dept + "�� �ٹ��ϸ� " + salary + "���� �޿��� �޽��ϴ�";
	}
}

public class ObjectTest3 {

	public static void main(String[] args) {
		
		// Ŭ������ Emp3
		// -name:String		-dept:String		-salary:int
		// getter setter
		// toString string
		Emp3 em = new Emp3();
		em.setName("��ȣ��");
		em.setDept("������");
		em.setSalary(1500000);
		System.out.println(em.toString());
	}
}