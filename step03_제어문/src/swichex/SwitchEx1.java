package swichex;

public class SwitchEx1 {

	public static void main(String[] args) {
		// ���� if, switch
		
		char sw = 'g';
		
		// if�� ����
		if(sw == 'E' || sw == 'e') {
			System.out.println("Excellent");
		} else if(sw == 'G' || sw == 'g') {
			System.out.println("Good");
		} else {
			System.out.println("Fail");
		}
		System.out.println("-------------------------");
		
		// switch�� ����
		switch (sw) {
		case 'E' : 
		case 'e' : System.out.println("Excellent");
			break;
		case 'G' : 
		case 'g' : System.out.println("Good");
			break;
		default : System.out.println("Fail");
		}
		System.out.println("-------------------------");
		
		int score = 95;
		char grade;
		
		switch(score / 10) {
		case 10 : 
		case 9 : grade = 'A'; break;
		case 8 : grade = 'B'; break;
		case 7 : grade = 'C'; break;
		case 6 : grade = 'D'; break;
		default : grade = 'F';
		}
		System.out.println("������ " + score + "���̰� ������ " + grade + "�Դϴ�");
	}
}