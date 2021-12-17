package employee;

public class EmpMain {

	public static void main(String[] args) {
		
		Developer dev = new Developer(101, "Scott", "1234");
		dev.setSalary(2500000);
		dev.setBonus(350000);
		System.out.println(dev.toString());
		
		Engineer eng = new Engineer(201, "steve", "5678");
		eng.setSalary(1500000);
		eng.setBonus(75000);
		System.out.println(eng.toString());
	}
}