package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserMain {

	public static void main(String[] args) throws IOException {
		
		// ID�� �Է��ϼ��� : pororo
		// pw�� �Է��ϼ��� : 1234
		
		// �Ƿηδ��� �����ϼ̽��ϴ�
		// ���� ����Ʈ�� 89.97�� �Դϴ�
		// [[BOOK�� ���� ����]]
		// å �̸� : java	å ���� : kim	������ : 100
		// å �̸� : c++	å ���� : lee	������ : 200
		// å �̸� : oracle	å ���� : park	������ : 300
		// ----------------------------
		// ID�� �Է��ϼ��� : pororo
		// pw�� �Է��ϼ��� : 1111
		// ID �Ǵ� PW�� Ʋ���ų� �������� �ʴ� ID�Դϴ�
		
		Scanner sc = new Scanner(System.in);
		System.out.print("ID�� �Է��ϼ��� : ");		String id = sc.next();
		System.out.print("PW�� �Է��ϼ��� : ");		String pw = sc.next();
		
		UserProc up = new UserProc();
		User entity = up.getLoginUser(id, pw);
		
		if(entity != null) {
			System.out.println(entity.getName() + "���� �����ϼ̽��ϴ�");
			System.out.println("���� ����Ʈ�� " + entity.getPoint() + "�� �Դϴ�");
			
			BookProc book = new BookProc();
			List<Book> list =  book.getList();
			System.out.println("[[BOOK�� ���� ����]]");
			
			for (Book ob : list) {
				System.out.println("å �̸� : " + ob.getTitle());
				System.out.println("å ���� : " + ob.getAuthor());
				System.out.println("������ : "+ob.getPage());
			}
		} else {
			System.out.println("ID �Ǵ� PW�� Ʋ���ų� �������� �ʴ� ID�Դϴ�");
		}
	}
}