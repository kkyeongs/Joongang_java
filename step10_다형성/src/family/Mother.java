package family;

public class Mother extends Family implements Job {
	
	public Mother() {
		
	}
	
	public Mother(String name) {
		super(name);
	}

	public String work() {
		return "������";
	}
	
	public String toString() {
		return "�̸� : " + name + "\n" + name + "��(��) " + work() + "��(��) �Ѵ�";
	}
}