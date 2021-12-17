package employee;

public class Engineer extends Emp {
	// -salary : long
	// -bonus : long
	// +Engineer()
	// +Engineer(int eno, String ename, String phone)
	// +toString() : String
	// 조건 : 보너스 +=150000을 수당으로 지급
	
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
		return "사원번호 : " + super.getEno()
		+ "\n사원이름 : " + super.getEname()
		+ "\n내선번호 : " + super.getPhone()
		+ "\n기본급여 : " + salary
		+ "\n보너스 + 수당 : " + bonus
		+ "\n지급금액 : " + (salary + bonus);
	}
}