package object;

class Member {
	private String name;
	private int age;
	private double tall;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setTall(double tall) {
		this.tall = tall;
	}
	
	public double getTall() {
		return tall;
	}
}

public class ObjectEx3 {

	public static void main(String[] args) {
		
		// setter & getter : 멤버 변수 하나당 값을 대입하는 함수 (setter)
		//			       : 그 값을 리턴하는 함수 (getter)
		// 변수들을 private로 숨기고 그 값을 사용할때 쓰는거?..
		
		Member mb = new Member();
		mb.setName("강호동");
		mb.setAge(23);
		mb.setTall(185.3);
		
		System.out.println("이름 : " + mb.getName());
		System.out.println("나이 : " + mb.getAge());
		System.out.println("신장 : " + mb.getTall());
	}
}