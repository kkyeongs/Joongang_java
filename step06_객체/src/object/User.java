package object;

public class User {
	// -private, +public, #protected
	// +name : String
	// +k : int
	// +e : int
	// +m : int
	
	// +setUser(name:String, k:int, e:int, m:int) : void
	// +getTotal() : int
	// +getUser() : String
	
	public String name;
	public int k, e, m;
	
	public void setUser(String name, int k, int e, int m) {
		this.name = name;
		this.k = k;
		this.e = e;
		this.m = m;
	}
	
	public int getTotal() { // ��� ��� ����
		return k + e + m;
	}
	
	public String getUser() { // ��� ����
		return "�̸��� " + name + "�̰� ������ " + getTotal() + "�� �Դϴ�";
	}
}
