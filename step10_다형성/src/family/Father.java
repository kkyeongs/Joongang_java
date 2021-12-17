package family;

public class Father extends Family implements Job {
	
	public Father() {
		
	}
	
	public Father(String name) {
		super(name);
	}
	
	public String work() {
		return "나가서 일";
	}
	
	public String toString() {
		return "이름 : " + name + "\n" + name + "은(는) " + work() + "을(를) 한다";
	}
}