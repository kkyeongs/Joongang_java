package step03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputTest3 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String name;
		char gender;
		int age;
		// 입력전 메시지, 입력하라는 메시지
		System.out.print("이름 : ");
		name = br.readLine();
		
		System.out.print("성별 : ");
		gender = br.readLine().charAt(0); // 입력된 문자열에서 (0)번째 자리
		
		System.out.print("나이 : ");
		age = Integer.parseInt(br.readLine());
		
		System.out.println("이름은 " + name + "입니다");
		System.out.println("성별은 " + gender + "자입니다");
		System.out.println("나이는 " + age + "세입니다");
	}
}
