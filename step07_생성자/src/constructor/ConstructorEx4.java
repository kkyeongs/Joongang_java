package constructor;

import java.util.Scanner;

public class ConstructorEx4 {

	int x;
	int y;
	public ConstructorEx4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���θ� �Է� : ");
		x = sc.nextInt();
		System.out.print("���θ� �Է� : ");
		y = sc.nextInt();
	}
	
	public int calc() {
		return x * y;
	}
	
	public void display() {
		System.out.println("���� : " + calc());
	}
	
	public static void main(String[] args) {
		
		new ConstructorEx4().display();
		// ���θ� �Է� : 
		// ���θ� �Է� : 
	}
}