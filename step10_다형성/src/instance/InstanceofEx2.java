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
		
//												 B ��ü�� A�� ���Եǳ�?
//		 instanceof ������ : B instanceof A ---> B ��ü�� A �ڷ����� �� �ִ°�?
//								--- ��Ӱ��迡�� �ڷ��� �˻�
// 							��Ӱ��迡 �ִ� �ڽİ�ü�� �θ�Ŭ����(�ڷ���)���� ����ȯ ����
		
		Employee[] em = new Employee[] {
			new Engineer("kim", 1200000),
			new Developer("lee", 1750000),
			new Engineer("park", 2500000),
			new Developer("hong", 2350000)
		};
		
		// Engineer�� �޿��� 13%, Developer�� 15%�� Ư�����ʽ� ����
		System.out.println("�̸� 	  �޿�	���Ժ��ʽ�	Ư�����ʽ�");
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