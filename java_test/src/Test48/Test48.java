package Test48;

import java.util.Scanner;
import java.util.Set;

public class Test48 {
	
	public static void main(String[] args) { 
		Salary sl = new Salary();
		
		PayTable[] pt = new PayTable[3];
		pt[0] = new PayTable("�Ҽ���", 750000, 2, 3);
		pt[1] = new PayTable("���ָ�", 800000, 1, 4);
		pt[2] = new PayTable("���ȸ�", 650000, 6, 2);
		
		while(true) {
			Scanner sc = new Scanner(System.in);
			System.out.print("�μ�Ƽ��(%)�� �Է��ϼ��� : ");
			sl.setIncentive(sc.nextFloat());
			
			PayTable[] pt1 = new PayTable[3];
			pt[0] = new PayTable("�Ҽ���", 750000, 2, 3);
			pt[1] = new PayTable("���ָ�", 800000, 1, 4);
			pt[2] = new PayTable("���ȸ�", 650000, 6, 2);
		}
	}
}