package object;

import java.util.Scanner;

class MemberPhone {
	private String name;
	private String phone;
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�̸��� �Է��ϼ��� : ");
		name = sc.nextLine(); // ���͸� ĥ������ , �� ������ �ν�
		System.out.print("��ȭ�� �Է��ϼ��� : ");
		phone = sc.nextLine();
	}
	
	public void output() {
		System.out.println(name + " ������ ��ȭ��ȣ�� " + phone + "�Դϴ�");
	}
}

public class ObjectEx6 {

	public static void main(String[] args) {
		
		MemberPhone mp = new MemberPhone();
		mp.input();
		mp.output(); // ��ȣ�� ������ ��ȭ��ȣ�� 1234�Դϴ�
	}
}