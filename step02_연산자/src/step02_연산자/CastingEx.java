package step02_������;

public class CastingEx {

	public static void main(String[] args) {
		// ĳ����, ����ȯ
		byte a = (byte) 128; // byte �ڷ��� ���� ���� 256�� (-128~+127)
		int b = a;
		
		double c = 73.45;
		int d = (int)c; // �Ҽ��� ���� ���� ������
		System.out.println(a + " , " + b);
		System.out.println(c + " , " + d);
		System.out.println("-----------------------------");
		
		int k = 95, e = 85, m = 73;
		int tot = k + e + m;
		double avg = tot / 3;
		System.out.println("�հ� : " + tot);
		System.out.println("��� : " + avg);
		
		System.out.println(Math.round(124.4)); // �ݿø� �Լ� .round �����ο��� �ݿø�
		System.out.println("-----------------------------");
		
		int pay = 857650;
		double tax = 0.033;
		
		int rPay = pay - (int)(pay * tax);
		System.out.println("�Ǽ��ɾ� : " + rPay);
	}
}