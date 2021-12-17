package test05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex05 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("**** ªÔ∞¢«¸¿« ≥–¿Ã ±∏«œ±‚ ****");
		System.out.print("πÿ∫Ø : ");
		int πÿ∫Ø = Integer.parseInt(br.readLine());
		System.out.print("≥Ù¿Ã : ");
		int ≥Ù¿Ã = Integer.parseInt(br.readLine());
		
	    double ≥–¿Ã = (πÿ∫Ø * ≥Ù¿Ã) / 2;
	    System.out.printf("≥–¿Ã : %.2f", ≥–¿Ã);
	}
}