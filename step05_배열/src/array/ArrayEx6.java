package array;

public class ArrayEx6 {

	public static void main(String[] args) {
		
		// 2���� �迭 : ǥ, ���̺�
		// int[][] num = new int[1][1];
		int [][] num = new int[][] {
			// 3�� 4�� = new int[3][4]
			{10, 20, 30, 40},
			{50, 60, 70, 80},
			{90, 100, 110, 120}
		};
		
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++) {
				// j < num[i].length�� {10, 20, 30, 40}�� ��ä�� ��������
				System.out.print(num[i][j]+"\t");
			}
			System.out.println();
		}
	}
}