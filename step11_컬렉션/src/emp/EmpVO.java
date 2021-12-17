package emp;

public class EmpVO {
	//	: ���� 3��, ����Ʈ������, �Ű����� 3�� ������, ���ͼ���
	// VO(value object) : ���� �����ִ� ��ü, �����͸� �ϳ��� ��� ������ �������� ���� Ŭ����
	// entity, dto(data transfer object), bean 
	
	private String name;
	private String dept;
	private int salary;
	
	public EmpVO() {
		
	}

	public EmpVO(String name, String dept, int salary) {
		super();
		this.name = name;
		this.dept = dept;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}

	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
}