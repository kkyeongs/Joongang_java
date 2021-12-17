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
		System.out.print("ã�� �������� �Է� : ");
		String title = sc.next();
		
		if (map.get(title) == null) {
			System.out.println("ã�� ������ �����!");
		} else {
			Book bk = map.get(title);
			
			System.out.println("å �̸� : " + bk.getTitle());
			System.out.println("å ���� : " + bk.getAuthor());
			System.out.println("������  : " + bk.getPage());
		}
	}
}