package Test35;

public class Test35 {
	
	public static String personView(String name, int a, int b, int c) {
		return name + "�� ������ " + (a + b + c) + "���Դϴ�";
	}

	public static void main(String[] args) {
		String result = personView("ȫ�浿", 90,78,88);
	    System.out.println(result);
	}
}