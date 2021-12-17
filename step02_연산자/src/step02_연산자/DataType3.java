package step02_연산자;

public class DataType3 {

	public static void main(String[] args) {
		// 각각 변수에 대입해서 출력
		// 이름 : 이순신 <-- println() 사용
		// 나이 : 25세 <-- print() 사용
		// 부서 : 개발부 <-- printf() 사용
		// 성적 : 87.5점
		
		String name = "이순신";
		int age = 25;
		String where = "개발부";
		float grade = 87.5f;
				
		System.out.println("이름 : " + name);
		System.out.print("나이 : " + age + "세\n");
		System.out.printf("부서 : %s\n성적 : %.1f\n", where, grade);
	}
}