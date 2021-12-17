package overload;

public class OverloadEx {

	int x = 17;
	int y = 15;
	
	public int max() {
		return x > y ? x : y;
	}
	
	public int max(int x, int y) {
		return x > y ? x : y; // 3�׿����� ( ���ǽ� ) ? (true) : (false);
	}
	
	public float max(float x, float y) {
		return x > y ? x : y;
	}
	
	public static void main(String[] args) {
		
		// �����ε�(�ߺ�) : ���� �̸��� �Լ��� ������ ����
		// 1. �ݵ�� �Լ��� �̸��� ���ƾ� �Ѵ�
		// 2. �Լ��� �Ű������� Ÿ���� �ٸ��ų�, ������ �޶�� ��
		
		OverloadEx ol = new OverloadEx();
		System.out.println("ū �� : " + ol.max());
		System.out.println("ū �� : " + ol.max(75, 100));
		System.out.println("ū �� : " + ol.max(90.5f, 50.4f));
	}
}