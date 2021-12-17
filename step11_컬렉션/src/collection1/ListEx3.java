package collection1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListEx3 {

	public static void main(String[] args) {
		
		Book bk1 = new Book("java", "kim", 100);
		Book bk2 = new Book("c++", "lee", 200);
		Book bk3 = new Book("oracle", "park", 300);
		
		List<Book> list = new ArrayList<Book>();
		list.add(bk1);
		list.add(bk2);
		list.add(bk3);
				
		System.out.println(list.size());
		
		for (Book book : list) {
			System.out.println("책 이름 : " + book.getTitle() + 
								"\t책 저자 : " + book.getAuthor() + 
								"\t페이지 : " + book.getPage());
		}
		System.out.println("---------------------------");
		
		Iterator<Book> iter = list.iterator();
		while(iter.hasNext()) {
			Book book = iter.next(); // iter.next 한번만 사용해야한다. 
			System.out.println("책 이름 : " + book.getTitle() +
					"\t책 저자 : " + book.getAuthor() +
					"\t페이지 : " + book.getPage());
		}
	}
}