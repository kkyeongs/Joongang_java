package employee;

public abstract class Emp {
	// -eno : int
	// -ename : String
	// -phone : String
	// +Emp()
	// +Emp(eno ename phone)
	// +getter 
	// + setSalary(salary long) void abstract
	// setBonus(bonus long) void abstract
	
	private int eno;
	private String ename;
	private String phone;
	
	public Emp() {
		
	}

	public Emp(int eno, String ename, String phone) {
		this.eno = eno;
		this.ename = ename;
		this.phone = phone;
	}

	public int getEno() {
		return eno;
	}
	public String getEname() {
		return ename;
	}
	public String getPhone() {
		return phone;
	}

	public abstract void setSalary(long salary);
	public abstract void setBonus(long salary);
}