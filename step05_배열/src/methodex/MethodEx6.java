package methodex;

public class MethodEx6 {

	public static int total(int a, int b) {
		return a + b;
	}
	
	public static String re(int total) {
		if(total >= 800) {
			return "�հ�";
		} else {
			return "���հ�";
		}
	}
	
	public static void main(String[] args) {
		
		// �Ի����� : 815
		// �Ի��� : �հ��Դϴ�
		
		int toeic = 750, it = 65;
		
		System.out.println("�Ի����� : " + total(toeic, it) + "��");
		System.out.println("�Ի��� : " + re(total(toeic, it)) + "�Դϴ�");
	}
}