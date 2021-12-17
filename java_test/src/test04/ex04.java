package test04;

public class ex04 {

	public static void main(String[] args) {
		
		String name = "민들레";
		int kor = 90;
		int eng = 70;
		int mat = 75;
		int tot = (kor + eng + mat);
		double avg = tot / 3.0;
		
		System.out.println("이름 : " + name);
		System.out.println("합계점수 : " + tot);
		System.out.printf("평균 : %.1f", avg);
	}
}