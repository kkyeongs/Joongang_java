package Test42;

public class Test42 extends Health{
	
	private double fat;
	private String result;
	
	public Test42() {
		super.input();
		calculate();
	}
	
	public void calculate() {
		if (gender == 'M'|| gender == 'm') {
			double a = (tall - 100) * 0.9;
			fat = weight / a * 100;
		} else if (gender == 'W' || gender == 'w'){
			double a = (tall - 100) * 0.85;
			fat = weight / a * 100;
		} else {
			System.out.println("�߸� �Է��Ͽ����ϴ�");
		}
		
		if (fat < 91) {
			result = "��ü��";
		} else if (fat > 90 || fat < 111) {
			result = "����(ǥ��ü��)";
		} else if (fat > 110 || fat < 121) {
			result = "��ü��";
		} else if (fat > 120 || fat < 131) {
			result = "�浵��";
		} else if (fat > 130 || fat < 151) {
			result = "�ߵ���";
		} else {
			result = "����";
		}
	}
	
	public String output() {
		return super.output() + "\n��� : ����� �񸸵� " + 
					String.format("%.2f", fat) + "�̰� " + result + "�Դϴ�" ;
	}
	
	public static void main(String[] args) {
		Test42 ob = new Test42();
		System.out.println(ob.output());
	}
}