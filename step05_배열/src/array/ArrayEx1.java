package array;

public class ArrayEx1 {

	public static void main(String[] args) {
		
		// 배열 : 동일한 자료형의 연속된 기억공간
		int[] num1 = {10, 20, 30, 40, 50};
		
		int[] num2 = new int[5]; // int형으로 5개의 기억공간을 가지는 num생성
		num2[0] = 10;
		num2[1] = 20;
		
		for (int i = num1.length-1; i >= 0; i--) { // 초기값이 조건식보다 클 경우 >
			System.out.println(num1[i]);
		}
		
		for (int i = 0; i < 4; i++) { // 초기값이 조건식보다 작을 경우 <
			System.out.println(num1[i]);
		}
		
		// 향상된 for문으로 num을 출력하세요
		for(int x : num1)
			System.out.println(x);
	}
}