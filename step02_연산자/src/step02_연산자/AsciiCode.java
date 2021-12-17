package step02_연산자;

public class AsciiCode {

	public static void main(String[] args) {
		// ASCII 코드 : 7비트 코드 체계, 미국정보교환용표준코드(0~127)
		// A : 65, 100 0001
		// a : 97, 110 0001
		// 1 : 49
		
		System.out.println('A' + " : " + (int)'A'); // A를 int로 형변환
		System.out.println('a' + " : " + (int)'a'); // A를 int로 형변환
		System.out.println(65 + " : " + (char)65); // A를 int로 형변환
		
		// 기본 자료형 primitive
		// 정수 자료형 : byte, char ,int(2^32:43억개), long
		// 실수 자료형 : float, double
		System.out.println("---------------------------");
		
		System.out.println('A' + 1);
		System.out.println((char)('A' + 1));
		System.out.println('a' - 32);
		System.out.println((char)('A' - 32));
		
		System.out.println('A' + 'B');
	}
}