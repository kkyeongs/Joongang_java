package test04;

public class ex04 {

	public static void main(String[] args) {
		
		String name = "�ε鷹";
		int kor = 90;
		int eng = 70;
		int mat = 75;
		int tot = (kor + eng + mat);
		double avg = tot / 3.0;
		
		System.out.println("�̸� : " + name);
		System.out.println("�հ����� : " + tot);
		System.out.printf("��� : %.1f", avg);
	}
}