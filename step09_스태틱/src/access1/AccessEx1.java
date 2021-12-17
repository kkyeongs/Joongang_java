package access1;

import access2.AccessEx3;
import access2.AccessEx4;

public class AccessEx1 extends AccessEx4 {
	
	private int x = 10;
	private int y = 20;

	public static void main(String[] args) {
		
		// private < default < protected < public 
		
		AccessEx1 a1 = new AccessEx1();
		System.out.println(a1.x + " " + a1.y);	// private 자기 클래스 안에서만 접근 가능
		
		AccessEx2 a2 = new AccessEx2();
		System.out.println(a2.x + " " + a2.y);	// dafault 같은 패키지 안에서만 사용 가능
		
		AccessEx3 a3 = new AccessEx3();
		System.out.println(a3.x + " " + a3.y);	// public 사용 다 가능(프로젝트 벗어나는건 안됨)
		
		AccessEx4 a4 = new AccessEx4();
		System.out.println(a1.a + " " + a1.b);	// protected클래스를 상속받아서 사용
	}
}