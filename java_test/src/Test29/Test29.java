package Test29;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test29 {

	public static void main(String[] args) throws NumberFormatException, IOException {


		int [] ar = new int[4];
		int ����;
		char ���� = 0;
		String ��;
		
		for (int i = 0; i < args.length; i++) {
			ar [i] = Integer.parseInt(args[i]); 
		}		
		
		double a1 = ((ar[0] + ar[1]) / 2) * 60 / 100;
		double a2 = (ar[2]) * 20 / 100;
		double a3 = (ar[3]) * 20 / 100;
		
		double aa = a1 + a2 + a3;
		
		switch((int)aa / 10) {
		case 10:
		case 9: ���� = 'A'; break;
		case 8: ���� = 'B'; break;
		case 7: ���� = 'C'; break;
		case 6: ���� = 'D'; break;
		default: ���� = 'F';
		}
		
		if(���� == 'A') {
			�� = "excellent";
		} else if(���� == 'C') {
			�� = "good";
		} else {
			�� = "foor";
		}
		
		System.out.printf("���� = %.2f", aa);
		System.out.println("\n���� = " + ����);
		System.out.println("�� = " + ��);
	}
}