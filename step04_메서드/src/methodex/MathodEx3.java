package methodex;

public class MathodEx3 {
	// call by value : ���� ���� ����, �Ű����� ���� ���
	
	public static void show1(int a, char b, double c, float d) {
		System.out.println(a + " " + b + " " + c + " " + d);
	}
	
	public static int show2(int k, int e, int m) {
		return k + e + m;
	}
	
	public static double show3(int k, int e, int m) {
		return (k + e + m) / 3.0;
	}
	
	public static String show4(int k, int e, int m) {
		if(show3(k, e, m) > 80) {
			return "�հ�";
		}
		return "���հ�";
	}

	public static void main(String[] args) {
		
		show1(10, 'A', 10.5, 100.3f);
		
		int sum = show2(95, 85, 73);
		System.out.println("���� : " + sum);
		
		double avg = show3(95, 85, 73);
		System.out.println("��� : " + avg);
		
		String res = show4(95, 85, 73);
		System.out.println("��� : " + res);
	}
}