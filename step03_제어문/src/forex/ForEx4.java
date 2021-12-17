package forex;

import java.util.Iterator;

public class ForEx4 {

	public static void main(String[] args) {
		
		for (int i = 1; i < 3; i++) { // 행(가로)
			for (int j = 1; j < 5; j++) { // 열(세로)
				System.out.println(i + ", " + j);
			}
		}
		System.out.println("-----------------------");
		
		for (int i = 1; i < 3; i++) { // 행(가로)
			for (int j = 1; j < 5; j++) { // 열(세로)
				System.out.print(i + ", " + j + " ");
			}
			System.out.println();
		}
		System.out.println("-----------------------");
		
		for (int i = 5; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}