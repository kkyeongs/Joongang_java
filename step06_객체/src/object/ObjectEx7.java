package object;

import java.util.Scanner;

public class ObjectEx7 {

	public static void main(String[] args) {

		// ***** 사다리꼴의 넓이 구하기 *****
		// 밑변을 입력하세요 : 
		// 윗변을 입력하세요 : 
		// 높이를 입력하세요 : 
		
		// 넓이 : ???
		
		// 한번 더 실행할까요?(Y/y)   
		// n나오면 
		// ***** 수고요 *****
		
		Trapezoid tz = new Trapezoid();
		Scanner sc = new Scanner(System.in);
		char an;
		
		do {
			System.out.println("***** 사다리꼴의 넓이 구하기 *****");
			System.out.print("밑변을 입력하세요 : ");		int base = sc.nextInt();
			System.out.print("윗변을 입력하세요 : ");		int top = sc.nextInt();
			System.out.print("윗변을 입력하세요 : ");		int height = sc.nextInt();
			tz.setTrapezoid(base, top, height);
			System.out.println(tz.toString());

			System.out.print("한번더 실행할까요?(Y/y) : ");
			an = sc.next().charAt(0);
		} while (an == 'Y' || an == 'y');
		System.out.println("***** 수고요 *****");
	}
}