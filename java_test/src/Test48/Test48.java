package Test48;

import java.util.Scanner;
import java.util.Set;

public class Test48 {
	
	public static void main(String[] args) { 
		Salary sl = new Salary();
		
		PayTable[] pt = new PayTable[3];
		pt[0] = new PayTable("소서노", 750000, 2, 3);
		pt[1] = new PayTable("고주몽", 800000, 1, 4);
		pt[2] = new PayTable("모팔모", 650000, 6, 2);
		
		while(true) {
			Scanner sc = new Scanner(System.in);
			System.out.print("인센티브(%)를 입력하세요 : ");
			sl.setIncentive(sc.nextFloat());
			
			PayTable[] pt1 = new PayTable[3];
			pt[0] = new PayTable("소서노", 750000, 2, 3);
			pt[1] = new PayTable("고주몽", 800000, 1, 4);
			pt[2] = new PayTable("모팔모", 650000, 6, 2);
		}
	}
}