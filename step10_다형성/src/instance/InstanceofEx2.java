package instance;

abstract class Employee {
	String name;
	int salary;
	
	public Employee() {
		
	}

	public Employee(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	
	abstract public int getBonus();
	
	public String toString() {
		return name + "\t" + salary;
	}
}

class Engineer extends Employee {
	public Engineer() {
		
	}

	public Engineer(String name, int salary) {
		super(name, salary);
	}
	
	public int getBonus() {
		return 150000;
	}
	
	public String toString() {
		return super.toString() + "\t" + getBonus();
	}
}

class Developer extends Employee {
	public Developer() {
		
	}

	public Developer(String name, int salary) {
		super(name, salary);
	}
	
	public int getBonus() {
		return 100000;
	}
	
	public String toString() {
		return super.toString() + "\t" + getBonus();
	}
}

public class InstanceofEx2 {

	public static void main(String[] args) {
		
//												 B 객체가 A에 포함되나?
//		 instanceof 연산자 : B instanceof A ---> B 객체가 A 자료형일 수 있는가?
//								--- 상속관계에서 자료형 검사
// 							상속관계에 있는 자식객체는 부모클래스(자료형)으로 형변환 가능
		
		Employee[] em = new Employee[] {
			new Engineer("kim", 1200000),
			new Developer("lee", 1750000),
			new Engineer("park", 2500000),
			new Developer("hong", 2350000)
		};
		
		// Engineer는 급여의 13%, Developer는 15%의 특별보너스 지급
		System.out.println("이름 	  급여	정규보너스	특별보너스");
		System.out.println("===============================");
		for (Employee ob : em) {
			if(ob instanceof Engineer) {
				System.out.println(ob.toString() + "\t" + (int)(ob.salary * 0.13));
			} else if(ob instanceof Developer) {
				System.out.println(ob.toString() + "\t" + (int)(ob.salary * 0.13));
			}
		}
	}
}