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
		System.out.print("����(M/F)�� �Է��Ͻÿ� : ");
		gender = sc.next().charAt(0);
		
		System.out.print("����(cm)�� �Է��Ͻÿ� : ");
		tall = sc.nextDouble();
		
		System.out.print("ü��(kg)�� �Է��Ͻÿ� : ");
		weight = sc.nextDouble();
	}
	
	public String output() {
		return "���� : " + gender + "\n���� : " + tall + "cm" +"\nü�� : " + weight + "kg";
	}
}