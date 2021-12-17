package step02_연산자;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputTest1 {

	public static void main(String[] args) throws IOException {
		// 콘솔로 데이터를 입력받는 방법
		// 이름을 입력하세요 : 강호동
		// 이름은 강호동입니다.
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		String name;
		System.out.print("이름을 입력하세요 : ");
		name = br.readLine();	// 키보드로 입력을 받는다
		System.out.println("이름은 " + name + "입니다");
		
		char gender;
		System.out.print("성별을 입력하세요 : ");
		gender = br.readLine().charAt(0);
		System.out.println("성별은 " + gender + "자입니다");
		
		int age;
		System.out.print("나이를 입력하세요 : ");
		age = Integer.parseInt(br.readLine());
		System.out.println("나이는 " + age + "세입니다");
		
		float tall;
		System.out.print("신장을 입력하세요 : ");
		tall = Float.parseFloat(br.readLine());
		System.out.println("신장은 " + tall + "cm입니다");
		
		double weight;
		System.out.print("체중을 입력하세요 : ");
		weight = Double.parseDouble(br.readLine());
		System.out.println("체중은 " + weight + "kg입니다");
		
		// .의 의미
		// system . out . println();
		//       포함    입력
		// 클래스 이름에는 대문자, () 괄호 붙지 않음
		// () 괄호 붙는건 소문자로 시작
	}
}
