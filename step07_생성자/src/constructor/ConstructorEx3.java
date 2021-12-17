package constructor;

import java.util.Scanner;

class UserInfo {
	public String name;
	public String addr;
	public UserInfo() {
		System.out.println("*** 주소록 ***");
	}
	
	public UserInfo(String name, String addr) {
		this();
		this.name = name;
		this.addr = addr;
	}
	
	public String getName() {
		return "이름 : " + name;
	}

	public String getAddr() {
		return "주소 : " + addr;
	}
}

public class ConstructorEx3 {

	public static void main(String[] args) {
		
		// 클래스명 : User
		// +name : String
		// +addr : String
		// +UserInfo()
		// +UserInfo(name : String, addr : String)
		// +getter
		
		// *** 주소록 ***
		// 이름 : 도라에몽			<-- 디폴트 생성자에서 출력
		// 주소 : 마포구 대흥동		<-- 메인 함수에서 getter를 이용 출력
		
		String name;		name = "도라에몽";
		String addr;		addr = "대흥동";
		char yn;
		
		UserInfo ui = new UserInfo(name, addr);
		System.out.println(ui.getName());
		System.out.println(ui.getAddr());
		System.out.println("---------------------------");
		
		Scanner sc = new Scanner(System.in);
		do {
			System.out.print("이름 : ");
			name = sc.nextLine();
			System.out.print("주소 : ");
			addr = sc.nextLine();
			// UserInfo ui = new UserInfo(name, addr);
			// 이렇게 새로운 객체를 생성하는(초기화 시켜주는게 없다) 것보다
			// 기존에 만들었던 객체 ui를 활용할 수도 있다
			ui = new UserInfo(name, addr);
			System.out.println(ui.getName());
			System.out.println(ui.getAddr());
			System.out.print("계속 진행하시겠습니까?(Y/y or N/n) : ");
			yn = sc.next().charAt(0);
		} while(yn == 'Y' || yn == 'y');
		System.out.println("*** 시스템종료 ***");
	}
}