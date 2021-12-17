package object;

class Person {
	public String name;
	public int age;
	public float score;
	
	public void setPerson(String n, int a, float s) {
		name = n;
		age = a;
		score = s;
	}
	
	public void viewPerson() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("점수 : " + score);
	}
}

public class ObjectEx1 {
	
	public static void main(String[] args) {
		
		// -private, +public, #protected
		// 클래스명 : Person
		// +name : String
		// +age : int
		// +score : float
		
		// +setPerson(n : String, a : int, s : float) : void
		// viewPerson() : void
		
		// new Person(); heap영역에 메모리를 할당하는 작업
		Person ps = new Person(); // 객체 생성
		ps.setPerson("개나리", 23, 73.5f);
		ps.viewPerson();
		System.out.println(ps.hashCode());
		
		ps = new Person();
		ps.setPerson("민들래", 25, 90.54f);
		ps.viewPerson();
		System.out.println(ps.hashCode());
	}
}