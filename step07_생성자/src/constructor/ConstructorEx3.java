package constructor;

import java.util.Scanner;

class UserInfo {
	public String name;
	public String addr;
	public UserInfo() {
		System.out.println("*** �ּҷ� ***");
	}
	
	public UserInfo(String name, String addr) {
		this();
		this.name = name;
		this.addr = addr;
	}
	
	public String getName() {
		return "�̸� : " + name;
	}

	public String getAddr() {
		return "�ּ� : " + addr;
	}
}

public class ConstructorEx3 {

	public static void main(String[] args) {
		
		// Ŭ������ : User
		// +name : String
		// +addr : String
		// +UserInfo()
		// +UserInfo(name : String, addr : String)
		// +getter
		
		// *** �ּҷ� ***
		// �̸� : ���󿡸�			<-- ����Ʈ �����ڿ��� ���
		// �ּ� : ������ ���ﵿ		<-- ���� �Լ����� getter�� �̿� ���
		
		String name;		name = "���󿡸�";
		String addr;		addr = "���ﵿ";
		char yn;
		
		UserInfo ui = new UserInfo(name, addr);
		System.out.println(ui.getName());
		System.out.println(ui.getAddr());
		System.out.println("---------------------------");
		
		Scanner sc = new Scanner(System.in);
		do {
			System.out.print("�̸� : ");
			name = sc.nextLine();
			System.out.print("�ּ� : ");
			addr = sc.nextLine();
			// UserInfo ui = new UserInfo(name, addr);
			// �̷��� ���ο� ��ü�� �����ϴ�(�ʱ�ȭ �����ִ°� ����) �ͺ���
			// ������ ������� ��ü ui�� Ȱ���� ���� �ִ�
			ui = new UserInfo(name, addr);
			System.out.println(ui.getName());
			System.out.println(ui.getAddr());
			System.out.print("��� �����Ͻðڽ��ϱ�?(Y/y or N/n) : ");
			yn = sc.next().charAt(0);
		} while(yn == 'Y' || yn == 'y');
		System.out.println("*** �ý������� ***");
	}
}