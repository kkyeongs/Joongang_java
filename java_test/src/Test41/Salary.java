package Test41;

public class Salary {
	private String name;
	private int salary;
	
	public Salary() {
		
	}

	public Salary(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	
	public void viewInfomation() {
		System.out.println("¿Ã∏ß : " + name + "\nø¨∫¿ : " + salary);
	}
}
