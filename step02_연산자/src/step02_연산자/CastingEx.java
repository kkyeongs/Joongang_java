package step02_연산자;

public class CastingEx {

	public static void main(String[] args) {
		// 캐스팅, 형변환
		byte a = (byte) 128; // byte 자료형 값의 범위 256개 (-128~+127)
		int b = a;
		
		double c = 73.45;
		int d = (int)c; // 소수점 이하 값은 없어짐
		System.out.println(a + " , " + b);
		System.out.println(c + " , " + d);
		System.out.println("-----------------------------");
		
		int k = 95, e = 85, m = 73;
		int tot = k + e + m;
		double avg = tot / 3;
		System.out.println("합계 : " + tot);
		System.out.println("평균 : " + avg);
		
		System.out.println(Math.round(124.4)); // 반올림 함수 .round 정수부에서 반올림
		System.out.println("-----------------------------");
		
		int pay = 857650;
		double tax = 0.033;
		
		int rPay = pay - (int)(pay * tax);
		System.out.println("실수령액 : " + rPay);
	}
}