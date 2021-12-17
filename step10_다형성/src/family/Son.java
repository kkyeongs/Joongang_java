package family;

public class Son extends Family implements Job {

	public Son() {
		
	}
	
	public Son(String name) {
		super(name);
	}

	public String work() {
		return "공부";
	}
	
	public String toString() {
		return "이름 : " + name + "\n" + name + "은(는) " + work() + "을(를) 한다";
	}
}