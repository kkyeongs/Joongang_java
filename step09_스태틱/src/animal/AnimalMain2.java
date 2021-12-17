package animal;

import java.util.Scanner;

public class AnimalMain2 {
	
	public static void main(String[] args) {
		
		// ���� ���ε�(dynamaic binding) : ��Ÿ��(�����ų��)�� ȣ���� �Լ��� �����ȴ�, �ڵ����� �پ��
		
		Scanner sc = new Scanner(System.in);
		Animal ani = null;
		int n;
		
		while(true) {
			System.out.print("1. Dog 2. Cat 3. Duck 4. Fish 5. Exit\n���� : ");
			n = sc.nextInt();
			switch(n) {
			case 1: ani = new Dog(); break;
			case 2: ani = new Cat(); break;
			case 3: ani = new Duck(); break;
			case 4: ani = new Fish(); break;
			default: System.out.println("*** ���� ***");
			sc.close();
			System.exit(0);	
			}
			ani.speak();
			ani.walk();
		}
	}
}