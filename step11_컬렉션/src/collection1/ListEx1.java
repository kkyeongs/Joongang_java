package collection1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListEx1 {

	public static void main(String[] args) {
		
		// List : 중복허용O, 순서유지O
		List list = new ArrayList();		
		list.add("one");
		list.add("second");
		list.add("3rd");
		list.add(4);
		list.add(new Integer(4));
		list.add(new Float(5.0f));
		list.add("second");
		list.add(Float.valueOf(5));
		
		System.out.println(list); 
		for (Object x : list) {
			System.out.println(x);
		}
		System.out.println("-------------------------");
		
		Iterator iter = list.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
}