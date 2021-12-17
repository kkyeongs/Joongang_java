package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayEx5 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		// 크기가 5개인 정수형 배열 선언
		// 배열에 데이터 입력
		// 출력하고 
		// 최대값 최소값 구하기
		// 결과화면
		// ar[0]의 값을 입력하세요 : 25
		// ar[1]의 값을 입력하세요 : 33
		// ar[2]의 값을 입력하세요 : -23
		// ar[3]의 값을 입력하세요 : 55
		// ar[4]의 값을 입력하세요 : 66
		// 25 33 -23 55 66
		// 최대값 : 66
		// 최소값 : -23
		
		int[] ar = new int[5];
				
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		for (int i = 0; i < ar.length; i++) {
			System.out.print("ar[" + i + "]의 값을 입력하세요 : ");
			ar[i] = Integer.parseInt(br.readLine());
		}
		
		for (int i : ar) {
			System.out.print(i + " ");
		}
		
		int max = 0;
		int min = 0;
		
		for (int i = 0; i < ar.length; i++) {
			if(ar[i] > max)
				max = ar[i];
			if(ar[i] < min)
				min = ar[i];
		}
		System.out.println("\n최대값 : " + max);
		System.out.println("최소값 : " + min);
	}
}