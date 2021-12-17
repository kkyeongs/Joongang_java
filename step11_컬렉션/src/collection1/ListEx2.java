package collection1;

import java.util.ArrayList;
import java.util.List;

public class ListEx2 {

	public static void main(String[] args) {
		
		// 제네릭스 generics
		List<Object> list = new ArrayList<Object>(); // <String>이면 String만 올 수 있으
													 // 밑에 자료형 에러가 생김
		
		// Object는 최상위 클래스이기에 어떤 자료형이 와도 에러가 안생김
		list.add("봄");
		list.add("여름");
		list.add("가을");
		list.add(new Integer(10));
		list.add("겨울");
		list.add(4.0);
		list.add(10.0f);
		
		list.remove("여름");
		list.remove(3);
		// list.clear();
		
		for (Object x : list) {
			System.out.println(x);
		}
		
	}
}