package test;

import java.util.ArrayList;
import java.util.List;

public class BookProc {
	
	public List<Book> getList() {
		List<Book> list = new ArrayList<Book>();
		
		list.add(new Book("java", "kim", 100));
		list.add(new Book("c++", "lee", 200));
		list.add(new Book("oracle", "park", 300));
		return list;
	}
}