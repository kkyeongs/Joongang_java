package family;

public class Mother extends Family implements Job {
	
	public Mother() {
		
	}
	
	public Mother(String name) {
		super(name);
	}

	public String work() {
		return "집안일";
	}
	
	public String toString() {
		return "이름 : " + name + "\n" + name + "은(는) " + work() + "을(를) 한다";
	}
}