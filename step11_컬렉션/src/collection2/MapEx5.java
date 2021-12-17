package collection2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapEx5 {

	public static void main(String[] args) {
		
		Book bk1 = new Book("java", "kim", 100);
		Book bk2 = new Book("c++", "lee", 200);
		Book bk3 = new Book("oracle", "park", 300);
		
		Map<String, Book> map = new HashMap();
		map.put(bk1.getTitle(), bk1);
		map.put(bk2.getTitle(), bk2);
		map.put(bk3.getTitle(), bk3);
		
		Scanner sc = new Scanner(System.in);
		System.out.print("찾는 도서명을 입력 : ");
		String title = sc.next();
		
		if (map.get(title) == null) {
			System.out.println("찾는 도서가 없어요!");
		} else {
			Book bk = map.get(title);
			
			System.out.println("책 이름 : " + bk.getTitle());
			System.out.println("책 저자 : " + bk.getAuthor());
			System.out.println("페이지  : " + bk.getPage());
		}
	}
}