package Test48;

public class Salary {
	private String name;
	private int pay;
	private int family_p;
	private int overtime_p;
	private int incen_p;
	private int tax;
	private int total_pay;
	private int family;
	private int overtime;
	private static float incentive = 0.5f;
	public static int count = 0;
	public Salary(String name, long pay, int family, int overtime) {
		this.name = name;
		this.pay = (int) pay;
		this.family = family;
		this.overtime = overtime;
	}
	public Salary() {
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPay() {
		return pay;
	}
	public void setPay(int pay) {
		this.pay = pay;
	}
	public int getFamily_p() {
		return family_p;
	}
	public void setFamily_p(int family_p) {
		this.family_p = family_p;
	}
	public int getOvertime_p() {
		return overtime_p;
	}
	public void setOvertime_p(int overtime_p) {
		this.overtime_p = overtime_p;
	}
	public int getIncen_p() {
		return incen_p;
	}
	public void setIncen_p(int incen_p) {
		this.incen_p = incen_p;
	}
	public int getTax() {
		return tax;
	}
	public void setTax(int tax) {
		this.tax = tax;
	}
	public int getTotal_pay() {
		return total_pay;
	}
	public void setTotal_pay(int total_pay) {
		this.total_pay = total_pay;
	}
	public int getFamily() {
		return family;
	}
	public void setFamily(int family) {
		this.family = family;
	}
	public int getOvertime() {
		return overtime;
	}
	public void setOvertime(int overtime) {
		this.overtime = overtime;
	}
	public static float getIncentive() {
		return incentive;
	}
	public static void setIncentive(float incentive) {
		Salary.incentive = incentive;
	}
	public static int getCount() {
		return count;
	}
	public static void setCount(int count) {
		Salary.count = count;
	}
}