package access1;

import access2.AccessEx3;
import access2.AccessEx4;

public class AccessEx1 extends AccessEx4 {
	
	private int x = 10;
	private int y = 20;

	public static void main(String[] args) {
		
		// private < default < protected < public 
		
		AccessEx1 a1 = new AccessEx1();
		System.out.println(a1.x + " " + a1.y);	// private �ڱ� Ŭ���� �ȿ����� ���� ����
		
		AccessEx2 a2 = new AccessEx2();
		System.out.println(a2.x + " " + a2.y);	// dafault ���� ��Ű�� �ȿ����� ��� ����
		
		AccessEx3 a3 = new AccessEx3();
		System.out.println(a3.x + " " + a3.y);	// public ��� �� ����(������Ʈ ����°� �ȵ�)
		
		AccessEx4 a4 = new AccessEx4();
		System.out.println(a1.a + " " + a1.b);	// protectedŬ������ ��ӹ޾Ƽ� ���
	}
}