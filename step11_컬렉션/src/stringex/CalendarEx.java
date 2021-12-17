package stringex;

import java.util.Calendar;
import java.util.Date;

class Today {
	public void print() {
		System.out.println("오늘 날짜 : " + new Date());
		
		Calendar cal =Calendar.getInstance();	// 시스템 날짜 시간 출력
		System.out.println(cal);
		System.out.println(cal.get(Calendar.YEAR) + "년");
		System.out.println((cal.get(Calendar.MONTH)+1) + "월");
		System.out.println(cal.get(Calendar.DAY_OF_MONTH) + "일");
	}
}

public class CalendarEx {

	public static void main(String[] args) {
		
		new Today().print();
	}
}