package �ָ�����;

public class Date {

	protected int year;
	protected int month;
	protected int day;
	
	public Date(int year, int month, int day) {
		super();
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
	public void printDate() {
		System.out.println("������ : "+year+"/"+month+"/"+day);
	}
}
