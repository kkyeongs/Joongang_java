package interfaceex;

class User {
	private String name;
	
	public User() {
		
	}
	public User(String name) {
		super();
		this.name = name;
	}

	public String toString() {
		return "이름 : " + name;
	}
}

interface Score {
	public int sol=20;
	public int getScore();
}

interface Print {
	public String toPaint();
}

public class InterfaceEx4 extends User implements Score, Print {

	int i;
	
	public InterfaceEx4(String name, int i) {
		super(name);
		this.i = i;
	}

	public int getScore() {
		return i * sol;
	}
	
	public String toPaint() {
		return super.toString() + "\n점수 : " + getScore();
	}
	
	public static void main(String[] args) {
		
		// class와 interface를 이용한 성적 처리
		// 클래스명 User
		// -name : String
		// +User()
		// +User(String name)
		// +toString : String
		// 인터페이스명 : Score
		// +sol : int(초기값 : 20) -- 배점
		// +getScore() : int -- 맞은수 * sol 리턴
		// 인터페이스명 : Print
		// +toPaint() : String
		// 출력화면
		// 이름 : 홍길동
		// 점수 : 60점
		
		InterfaceEx4 ob = new InterfaceEx4("홍길동", 3);
		System.out.println(ob.toPaint());
	}
}