package Test51;

import java.util.Calendar;
import java.util.Random;

public class Test51 {

	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();
		Random rn = new Random();
		int a = rn.nextInt(101);
		
		System.out.println(cal.get(Calendar.YEAR)+"년 "+
							cal.get(Calendar.MONTH)+"월 "+
							cal.get(Calendar.DAY_OF_MONTH)+"일 당신의 금전운은 "+
							a+"% 입니다");
	}
}