package step03;

import java.util.Random;

public class RandomEx {

	public static void main(String[] args) {
		// 난수 함수 : 컴퓨터가 임의의 수를 발생
		//			의사 난수(pseudo random) : 동일한 조건이 갖춰지면 같은 값을 발생
		
		// Math 클래스를 이용
		System.out.println(Math.random()); // 0이상 1미만의 난수 발생
		System.out.println(Math.random()*10+1);
		System.out.println((int)(Math.random()*10+1)); // 1이상 11미만의 수, n이상 ~ n미만
		System.out.println("-----------------------------");
		
		// 범위 구하기!!!!
		// 20 ~ 40 사이를 나타내려면
		// 20 이상! 41 미만!
		// Math.random()*	21			 +	 20
		//          41(미만값)-20(이상값)    시작값(이상값)
		
		// 51에서 80까지의 정수 난수 생성        51이상 81미만
		System.out.println((int)(Math.random()*30+51));
		
		// 50에서 80까지의 정수 난수 생성        50이상 81미만
		System.out.println((int)(Math.random()*31+50));
		System.out.println("--------------------------------");
		
		// Random 클래스 이용
		Random rd = new Random();
		System.out.println(rd.nextInt(101)); // 0부터 ~ 101미만!의 수
		
		//                (미만값) (이상값)
		int n1 = rd.nextInt(101) + 0; // 0이상 101미만의 정수 난수
		int n2 = rd.nextInt(31) + 50; // 50이상 81미만의 정수 난수
		int n3 = rd.nextInt(41) + 30; // 30이상 71미만의 정수 난수
		System.out.println(n1 + " " + n2 + " " + n3);
	}
}