package family;

public class Father extends Family implements Job {
	
	public Father() {
		
	}
	
	public Father(String name) {
		super(name);
	}
	
	public String work() {
		return "������ ��";
	}
	
	public String toString() {
		return "�̸� : " + name + "\n" + name + "��(��) " + work() + "��(��) �Ѵ�";
	}
}