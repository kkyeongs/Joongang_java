package animal;

import java.util.Scanner;

public class AnimalMain1 {
	
	public static void main(String[] args) {
		
		// ���� ���ε�(static binding) : �������� �ϴ� ������ ȣ���� �Լ��� ���� .speak .walk
		
		Scanner sc = new Scanner(System.in);
		Dog dg = null; Cat ct = null; Duck dk = null; Fish fs = null;
		int n;
		
		while(true) {
			System.out.print("1. Dog 2. Cat 3. Duck 4. Fish 5. Exit\n���� : ");
			n = sc.nextInt();
			switch(n) {
			case 1: dg = new Dog(); dg.speak(); dg.walk(); break;
			case 2: ct = new Cat(); ct.speak(); ct.walk(); break;
			case 3: dk = new Duck(); dk.speak(); dk.walk(); break;
			case 4: fs = new Fish(); fs.speak(); fs.walk(); break;
			default: System.out.println("*** ���� ***");
			sc.close();
			System.exit(0);
			}
		}
	}
}