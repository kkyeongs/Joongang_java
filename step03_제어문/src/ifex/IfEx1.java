package ifex;

public class IfEx1 {

	public static void main(String[] args) {
		// �ܼ� if��
		// if(���ǽ�) {
		// 		~~~~
		// }
		// ������ �������ο� ������� �����ϴ� �����
		String str1 = "Hello";
		if (str1 == "hello") {
			System.out.println("�ȳ��ϼ���");
		}
		System.out.println("�ȳ���������");
		System.out.println("-------------------------");
		
		// if~else ��    ������ �����ϸ� if, �������� ������ else
		String str2 = "Hello";
		if (str2 == "Hello") {
			System.out.println("�ȳ��ϼ���");
		} else {
			System.out.println("�ȳ���������");
		}
		System.out.println("-------------------------");
		
		int score = 45;
		if(score >= 60) {
			System.out.println("�հ�");
			System.out.println("����� ������ " + score + "���Դϴ�");
		} else {
			System.out.println("���հ�");
			System.out.println("����� ������ " + score + "���̰� ���� ��ȸ��...");
		}
		System.out.println("�ȳ���������");
		System.out.println("-------------------------");
		
		// if~else if~ else
		int score2 = 95;
		char grade;
		
		if(score2 >= 90) {
			grade = 'A';
		} else if(score2 >= 80) {
			grade = 'B';
		} else if(score2 >= 70) {
			grade = 'C';
		} else if(score2 >= 60) {
			grade = 'D';
		} else {
			grade = 'F';
		} 
		System.out.println("������ " + score2 + "���̰� ������ " + grade + "�Դϴ�");
		System.out.println("-------------------------");
		
		int score3 = 90;
		char grade3 = '\0'; // �ʱⰪ�� ���� ������ ������ �����
		
		if(score3 >= 90 && score3 <= 100) grade3 = 'A';
		if(score3 >= 80 && score3 < 90) grade3 = 'B';
		if(score3 >= 70 && score3 < 80) grade3 = 'C';
		if(score3 >= 60 && score3 < 70) grade3 = 'D';
		if(score3 >= 0 && score3 < 60) grade3 = 'F';

		System.out.println("������ " + score3 + "���̰� ������ " + grade3 + "�Դϴ�");
	}
}