package stringex;

import java.util.Calendar;
import java.util.Date;

class Today {
	public void print() {
		System.out.println("���� ��¥ : " + new Date());
		
		Calendar cal =Calendar.getInstance();	// �ý��� ��¥ �ð� ���
		System.out.println(cal);
		System.out.println(cal.get(Calendar.YEAR) + "��");
		System.out.println((cal.get(Calendar.MONTH)+1) + "��");
		System.out.println(cal.get(Calendar.DAY_OF_MONTH) + "��");
	}
}

public class CalendarEx {

	public static void main(String[] args) {
		
		new Today().print();
	}
}