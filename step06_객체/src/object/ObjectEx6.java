package object;

import java.util.Scanner;

class MemberPhone {
	private String name;
	private String phone;
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요 : ");
		name = sc.nextLine(); // 엔터를 칠때가지 , 줄 단위로 인식
		System.out.print("전화를 입력하세요 : ");
		phone = sc.nextLine();
	}
	
	public void output() {
		System.out.println(name + " 고객님의 전화번호는 " + phone + "입니다");
	}
}

public class ObjectEx6 {

	public static void main(String[] args) {
		
		MemberPhone mp = new MemberPhone();
		mp.input();
		mp.output(); // 강호동 고객님의 전화번호는 1234입니다
	}
}