package Test30;

import java.util.Iterator;

public class Test30 {

	public static void main(String[] args) {
		
		int sum = 0;
		int count = 0;
		
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 6; j++) {
				System.out.print((int)(Math.random() * 100) + "\t");
				sum += (int)(Math.random() * 100);
				
				count += 1;
				if (count == 50)
					break;
			}
		System.out.println(" ");
		}
		System.out.println("гу = " + sum);
	}
}