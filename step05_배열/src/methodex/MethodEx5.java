package methodex;

public class MethodEx5 {

	public static void show1() {
		
	}
	
	public static void show2(char a, int b) {
		System.out.println("Ÿ�� : " + a);
		System.out.println("�ڵ� : " + b);
	}
	
	public static String show3() {
		return "hello";
	}
	
	public static float show4(int a, int b, int c) {
		return (a + b + c) / 3.0f;
	}
	
	public static void main(String[] args) {
		
		show1();
		show2('A', 25);
		
		String s = show3();
		System.out.println("���ϰ� : " + s);
		
		float k = show4(15, 45, 73);
		System.out.printf("���ϰ� : %.2f", k);
		
		// ������ �ʿ��� �Լ� : �Լ��� �̵��ؼ� ����ϰ� ������� �޾ƿ;� �ϴ� ���
		// ������ �ʿ���� �Լ� : �Լ��� �̵��ؼ� ���
		
	}
}