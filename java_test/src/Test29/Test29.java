package Test29;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test29 {

	public static void main(String[] args) throws NumberFormatException, IOException {


		int [] ar = new int[4];
		int 성적;
		char 학점 = 0;
		String 평가;
		
		for (int i = 0; i < args.length; i++) {
			ar [i] = Integer.parseInt(args[i]); 
		}		
		
		double a1 = ((ar[0] + ar[1]) / 2) * 60 / 100;
		double a2 = (ar[2]) * 20 / 100;
		double a3 = (ar[3]) * 20 / 100;
		
		double aa = a1 + a2 + a3;
		
		switch((int)aa / 10) {
		case 10:
		case 9: 학점 = 'A'; break;
		case 8: 학점 = 'B'; break;
		case 7: 학점 = 'C'; break;
		case 6: 학점 = 'D'; break;
		default: 학점 = 'F';
		}
		
		if(학점 == 'A') {
			평가 = "excellent";
		} else if(학점 == 'C') {
			평가 = "good";
		} else {
			평가 = "foor";
		}
		
		System.out.printf("성적 = %.2f", aa);
		System.out.println("\n학점 = " + 학점);
		System.out.println("평가 = " + 평가);
	}
}