package array;

public class ArrayEx1 {

	public static void main(String[] args) {
		
		// �迭 : ������ �ڷ����� ���ӵ� ������
		int[] num1 = {10, 20, 30, 40, 50};
		
		int[] num2 = new int[5]; // int������ 5���� �������� ������ num����
		num2[0] = 10;
		num2[1] = 20;
		
		for (int i = num1.length-1; i >= 0; i--) { // �ʱⰪ�� ���ǽĺ��� Ŭ ��� >
			System.out.println(num1[i]);
		}
		
		for (int i = 0; i < 4; i++) { // �ʱⰪ�� ���ǽĺ��� ���� ��� <
			System.out.println(num1[i]);
		}
		
		// ���� for������ num�� ����ϼ���
		for(int x : num1)
			System.out.println(x);
	}
}