package ifex;

public class IfEx3 {

	public static void main(String[] args) {
		// ���� ���α׷��� �ۼ��ϼ���
		// a ������ 55 �Ǵ� 46�� ����
		// 1. if �̿�
		// ���ǹ����� 50�� ���Ͽ� 50���� ũ��
		// "55�� 50���� ũ�ų� ����, 46�� 50���� �۴�
		// 2. if else �̿�
		// a ������ ���� Ȧ�� ���� ¦������ ���
		// 3. if ~ else if ~ else �̿�
		// a�� ������ ���� �������� ������� zero���� ���
		
		// ��°�� 
		// 55�� 50���� ũ�ų� ����
		// 55�� Ȧ���Դϴ�
		// 55�� ����Դϴ�
		int a = 55;
		if(a >= 50) {
			System.out.println(a + "�� 50���� ũ�ų� ����");
		}
		
		if(a % 2 == 0) {
			System.out.println(a + "�� ¦���Դϴ�");
		} else {
			System.out.println(a + "�� Ȧ���Դϴ�");
		}
		
		if(a > 0) {
			System.out.println(a + "�� ����Դϴ�");
		} else if(a < 0) {
			System.out.println(a + "�� �����Դϴ�");
		} else if(a == 0){
			System.out.println(a + "�� zero�Դϴ�");
		}
		
		// �ڵ尡 ������ ��쿡�� { } �Ƚᵵ�ȴ� �Ʒ�ó�� ��� ����
		if(a % 2 == 0)
			System.out.println(a + "�� ¦���Դϴ�");
		else
			System.out.println(a + "�� Ȧ���Դϴ�");
	}
}