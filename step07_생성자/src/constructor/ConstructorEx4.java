package constructor;

import java.util.Scanner;

public class ConstructorEx4 {

	int x;
	int y;
	public ConstructorEx4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("가로를 입력 : ");
		x = sc.nextInt();
		System.out.print("세로를 입력 : ");
		y = sc.nextInt();
	}
	
	public int calc() {
		return x * y;
	}
	
	public void display() {
		System.out.println("넓이 : " + calc());
	}
	
	public static void main(String[] args) {
		
		new ConstructorEx4().display();
		// 가로를 입력 : 
		// 세로를 입력 : 
	}
}