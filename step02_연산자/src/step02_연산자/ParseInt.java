package step02_������;

public class ParseInt {

	public static void main(String[] args) {
		
		// ���ڿ��� ���ڷ� ��ȯ�ϴ� ���� --> �Ľ��� �� ����
		// �Ľ� : � �����͸� ���� ���ϴ� ���·� �����ϴ� ��
		
		String a = "100";
		String b = "200";
		System.out.println(a + b); // ���ڿ� ��
		
		int a1 = Integer.parseInt(a);
		int b1 = Integer.parseInt(b);
		System.out.println(a1 + b1);
		
		float c1 = Float.parseFloat("1234.5");
		System.out.println(c1 + 100);
		
		double d1 = Double.parseDouble("345.5");
		System.out.println(d1 + 100);
	}
}