package methodex;

public class MethodEx2 {
	
	// ���������� static ���ϰ����ڷ��� �Լ��̸�() {}
	public static int view1() { // �Լ� ����
		return 10; // ���� 10�� ����
	}
	
	public static char view2() {
		return 'A';
	}
	
	public static float view3() {
		return 50.3f;
	}

	public static double view4() {
		return 100.4;
	}
	
	public static String view5() {
		return "Hello";
	}
	
	public static boolean view6() {
		return true;
	}
	
	public static void main(String[] args) {
		
		int a = view1(); // �Լ� ȣ��, int a = 10;
		System.out.println(a);
		
		char b = view2();
		System.out.println(b);
		
		float c = view3();
		System.out.println(c);
		
		double d = view4();
		System.out.println(d);
		
		String e = view5();
		System.out.println(e);
		
		boolean f = view6();
		System.out.println(f);
	}
}