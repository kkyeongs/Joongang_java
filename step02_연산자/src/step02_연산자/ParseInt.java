package step02_연산자;

public class ParseInt {

	public static void main(String[] args) {
		
		// 문자열을 숫자로 변환하는 과정 --> 파싱의 한 종류
		// 파싱 : 어떤 데이터를 내가 원하는 형태로 변형하는 것
		
		String a = "100";
		String b = "200";
		System.out.println(a + b); // 문자열 형
		
		int a1 = Integer.parseInt(a);
		int b1 = Integer.parseInt(b);
		System.out.println(a1 + b1);
		
		float c1 = Float.parseFloat("1234.5");
		System.out.println(c1 + 100);
		
		double d1 = Double.parseDouble("345.5");
		System.out.println(d1 + 100);
	}
}