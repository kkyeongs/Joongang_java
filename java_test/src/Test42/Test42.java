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
			System.out.println("잘못 입력하였습니다");
		}
		
		if (fat < 91) {
			result = "저체중";
		} else if (fat > 90 || fat < 111) {
			result = "정상(표준체중)";
		} else if (fat > 110 || fat < 121) {
			result = "과체중";
		} else if (fat > 120 || fat < 131) {
			result = "경도비만";
		} else if (fat > 130 || fat < 151) {
			result = "중도비만";
		} else {
			result = "고도비만";
		}
	}
	
	public String output() {
		return super.output() + "\n결과 : 당신은 비만도 " + 
					String.format("%.2f", fat) + "이고 " + result + "입니다" ;
	}
	
	public static void main(String[] args) {
		Test42 ob = new Test42();
		System.out.println(ob.output());
	}
}