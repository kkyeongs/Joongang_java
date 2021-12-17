package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserMain {

	public static void main(String[] args) throws IOException {
		
		// ID를 입력하세요 : pororo
		// pw를 입력하세요 : 1234
		
		// 뽀로로님이 입장하셨습니다
		// 현재 포인트는 89.97점 입니다
		// [[BOOK의 정보 보기]]
		// 책 이름 : java	책 저자 : kim	페이지 : 100
		// 책 이름 : c++	책 저자 : lee	페이지 : 200
		// 책 이름 : oracle	책 저자 : park	페이지 : 300
		// ----------------------------
		// ID를 입력하세요 : pororo
		// pw를 입력하세요 : 1111
		// ID 또는 PW가 틀리거나 존재하지 않는 ID입니다
		
		Scanner sc = new Scanner(System.in);
		System.out.print("ID를 입력하세요 : ");		String id = sc.next();
		System.out.print("PW를 입력하세요 : ");		String pw = sc.next();
		
		UserProc up = new UserProc();
		User entity = up.getLoginUser(id, pw);
		
		if(entity != null) {
			System.out.println(entity.getName() + "님이 입장하셨습니다");
			System.out.println("현재 포인트는 " + entity.getPoint() + "점 입니다");
			
			BookProc book = new BookProc();
			List<Book> list =  book.getList();
			System.out.println("[[BOOK의 정보 보기]]");
			
			for (Book ob : list) {
				System.out.println("책 이름 : " + ob.getTitle());
				System.out.println("책 저자 : " + ob.getAuthor());
				System.out.println("페이지 : "+ob.getPage());
			}
		} else {
			System.out.println("ID 또는 PW가 틀리거나 존재하지 않는 ID입니다");
		}
	}
}