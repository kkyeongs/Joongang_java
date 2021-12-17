package Test49;

public class Profile {
	public String name;
	public String phone;
	
	public Profile() {
	}

	public Profile(String name, String phone) {
		super();
		this.name = name;
		this.phone = phone;
	}
	
	public void printView() {
		System.out.println(name+" "+phone);
	}
}
