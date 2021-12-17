package array;

public class ArrayEx7 {

	public static void main(String[] args) {
		
		// 가변 배열
		int[][] num = new int[1][1];
		num[0] = new int[] {10, 20};
		num[1] = new int[] {50, 60, 70, 80};
		num[2] = new int[] {90, 100, 110};
		
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++) {
				// j < num[i].length는 {10, 20, 30, 40}을 통채로 리턴해줌
				System.out.print(num[i][j]+"\t");
			}
			System.out.println();
		}
	}
}