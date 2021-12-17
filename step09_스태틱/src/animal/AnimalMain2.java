package animal;

import java.util.Scanner;

public class AnimalMain2 {
	
	public static void main(String[] args) {
		
		// 동적 바인딩(dynamaic binding) : 런타임(실행시킬때)에 호출할 함수가 결정된다, 코딩량이 줄어듬
		
		Scanner sc = new Scanner(System.in);
		Animal ani = null;
		int n;
		
		while(true) {
			System.out.print("1. Dog 2. Cat 3. Duck 4. Fish 5. Exit\n선택 : ");
			n = sc.nextInt();
			switch(n) {
			case 1: ani = new Dog(); break;
			case 2: ani = new Cat(); break;
			case 3: ani = new Duck(); break;
			case 4: ani = new Fish(); break;
			default: System.out.println("*** 종료 ***");
			sc.close();
			System.exit(0);	
			}
			ani.speak();
			ani.walk();
		}
	}
}