package exception;

public class ExceptionEx1 {
	
	public static void main(String[] args) {
		
		// try ~ catch �� : �ͼ����� �߻��� �� ����ִ� ����
		// ���� ó���� �ϴ� ���� : ���α׷��� ���������� ������ �� �ֵ��� ���ִ� ����
		
		try {
		int var = 5;
		int n = Integer.parseInt(args[0]);
		System.out.println(var / n);
		} catch(ArithmeticException e) { // ������� ������ ����
			System.out.println("0���� ���� �� �����ϴ�");
		} catch(NumberFormatException e) { // �ԷµǴ� ������ ������ ���� ����
			System.out.println("���ڷ� ��ȯ�� �� �����ϴ�");
		} catch(ArrayIndexOutOfBoundsException e) { // �����͸� �޾Ƶ��̴� �������� �������
			System.out.println("�Էµ� ���� �����ϴ�");
		} finally {
			System.out.println("������ ����Ǵ� ����");
		}
		
		try {
			
		} catch (Exception e) { // ���� Exception Ŭ����, �̰� ���� �ٸ� ����ó�� �� Ŀ�� ����
		}
		
		System.out.println("hello");
	}
}