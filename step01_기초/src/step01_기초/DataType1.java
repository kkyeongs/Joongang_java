package step01_기초;

public class DataType1 {

	public static void main(String[] args) {
		// 자료형.
		System.out.println("이름 : 홍길동");
		System.out.println("나이 : 23세");
		System.out.println("성별 : 남자");
		System.out.println("체중 : 63.4kg");
		System.out.println("신장 : 175.5cm");
		System.out.println("------------------------");
		
		String name = "홍길동"; // 문자열 형, 스트링
		int age = 23; // 정수 형, 인트
		char gender = '남'; // 글자 하나
		float weight = 63.4f; // 실수형
		double tall = 175.5; // 실수형
		
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age + "세");
		System.out.println("성별 : " + gender);
		System.out.println("체중 : " + weight + "kg");
		System.out.println("신장 : " + tall + "cm");
	}
}