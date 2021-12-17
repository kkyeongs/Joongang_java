package swichex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.Month;
import java.util.Calendar;

public class SwitchEx3 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// 문제
		// args로 입력된 month로 일 수를 구하세요
		// 
		// $ java SwitchEx3 3
		// 3월은 31일까지 있습니다
		
		// 나는 run config를 일수로 입력했는데 정답은 월을 입력받음
		int 이십팔 = Integer.parseInt(args[0]);
		int 삼십 = Integer.parseInt(args[1]);
		int 삼십일 = Integer.parseInt(args[2]);
		
		int month = 1;
		switch(month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			System.out.println(month + "월은 " + 삼십일 + "일까지 있습니다");
			break;
			
		case 4: case 6: case 9: case 11:
			System.out.println(month + "월은 " + 삼십 + "일까지 있습니다");
			break;
			
		case 2: 
			System.out.println(month + "월은 " + 이십팔 + "일까지 있습니다");
		}
		System.out.println("-----------------------------------");
		
		// 선생님 입력
		int monet = Integer.parseInt(args[0]);
		int day = 0;
		// run config~ 로 3을 입력
		
		switch(month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			day = 31;
			break;
		case 2: 
			day = 28;
			break;
		case 4: case 6: case 9: case 11:
			day = 30;
		}
		System.out.println(month + "월은" + day + "일까지 있습니다");
	}
}