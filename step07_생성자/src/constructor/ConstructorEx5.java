package constructor;

import java.util.Scanner;

class Max {
	private int a;
	private int b;
	Max() {
		Scanner sc = new Scanner(System.in);
		System.out.print("a 입력 : ");		a = sc.nextInt();
		System.out.print("b 입력 : ");		b = sc.nextInt();
	}
	
	public int maxValue() {
		return a > b ? a : b;
	}
	
	public int minValue() {
		return a < b ? a : b;
	}
	
	public void show() {
		System.out.println("큰 수 : " + maxValue());
		System.out.println("작은 수 : " + minValue());
	}
}

public class ConstructorEx5 {

	public static void main(String[] args) {
		
		// 생성자에서 두 수를 입력받아 큰수와 작은수를 출력
		// show()에서 maxValue(), minValue()를 호출
		
		// 클래스명 Max
		// -a : int
		// -b : int 
		// +Max()		+maxValue() int		+minValue() int
		// +show() void
		// 출력화면
		// a 입력 : 
		// b 입력 : 
		// 큰수 : 
		// 작은수 : 
		new Max().show();
	}
}