package employee;

public class Engineer extends Emp {
	// -salary : long
	// -bonus : long
	// +Engineer()
	// +Engineer(int eno, String ename, String phone)
	// +toString() : String
	// ���� : ���ʽ� +=150000�� �������� ����
	
	private long salary;
	private long bonus;
	
	public Engineer() {
		
	}
	public Engineer(int eno, String ename, String phone) {
		super(eno, ename, phone);
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}
	public void setBonus(long bonus) {
		this.bonus = bonus + 150000;
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