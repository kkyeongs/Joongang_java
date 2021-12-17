package Test42;

import java.util.Scanner;

public class Health {
	public char gender;
	public double tall;
	public double weight;
	
	public Health() {
		
	}
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("성별(M/F)을 입력하시오 : ");
		gender = sc.next().charAt(0);
		
		System.out.print("신장(cm)을 입력하시오 : ");
		tall = sc.nextDouble();
		
		System.out.print("체중(kg)을 입력하시오 : ");
		weight = sc.nextDouble();
	}
	
	public String output() {
		return "성별 : " + gender + "\n신장 : " + tall + "cm" +"\n체중 : " + weight + "kg";
	}
}