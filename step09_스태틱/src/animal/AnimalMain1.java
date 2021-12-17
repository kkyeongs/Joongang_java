package animal;

import java.util.Scanner;

public class AnimalMain1 {
	
	public static void main(String[] args) {
		
		// 정적 바인딩(static binding) : 컴파일을 하는 시점에 호출할 함수를 결정 .speak .walk
		
		Scanner sc = new Scanner(System.in);
		Dog dg = null; Cat ct = null; Duck dk = null; Fish fs = null;
		int n;
		
		while(true) {
			System.out.print("1. Dog 2. Cat 3. Duck 4. Fish 5. Exit\n선택 : ");
			n = sc.nextInt();
			switch(n) {
			case 1: dg = new Dog(); dg.speak(); dg.walk(); break;
			case 2: ct = new Cat(); ct.speak(); ct.walk(); break;
			case 3: dk = new Duck(); dk.speak(); dk.walk(); break;
			case 4: fs = new Fish(); fs.speak(); fs.walk(); break;
			default: System.out.println("*** 종료 ***");
			sc.close();
			System.exit(0);
			}
		}
	}
}