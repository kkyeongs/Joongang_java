package family;

public class Son extends Family implements Job {

	public Son() {
		
	}
	
	public Son(String name) {
		super(name);
	}

	public String work() {
		return "����";
	}
	
	public String toString() {
		return "�̸� : " + name + "\n" + name + "��(��) " + work() + "��(��) �Ѵ�";
	}
}