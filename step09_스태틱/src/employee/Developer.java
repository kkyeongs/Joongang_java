package employee;

public class Developer extends Emp {
	// -salary : long
	// -bonus : long
	// +Developer()
	// +Develpoer(int eno, String ename, String phone)
	// +toString() : String
	// ���� : ���ʽ� +=100000�� �������� ����
	
	private long salary;
	private long bonus;
	
	public Developer() {
		
	}
	public Developer(int eno, String ename, String phone) {
		super(eno, ename, phone);
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}
	public void setBonus(long bonus) {
		this.bonus = bonus + 100000;
	}
	
	public String toString() {
		return "�����ȣ : " + super.getEno()
				+ "\n����̸� : " + super.getEname()
				+ "\n������ȣ : " + super.getPhone()
				+ "\n�⺻�޿� : " + salary
				+ "\n���ʽ� + ���� : " + bonus
				+ "\n���ޱݾ� : " + (salary + bonus);
	}
}