package step01_기초;

public class Test2 {

	public static void main(String[] args) {
		
		String 이름 = "강호동";
		int 국어 = 95;
		int 영어 = 85;
		int 수학 = 73;
		
		System.out.printf("이름 : %s\n", 이름);
		System.out.printf("국어 : %d\n", 국어);
		System.out.printf("영어 : %d\n", 영어);
		System.out.printf("수학 : %d\n", 수학);
		System.out.println("총점 : " + (국어 + 영어 + 수학));
	}
}