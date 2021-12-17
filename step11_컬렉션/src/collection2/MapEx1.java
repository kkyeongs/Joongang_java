package collection2;

import java.util.HashMap;
import java.util.Map;

public class MapEx1 {

	public static void main(String[] args) {
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(101, "둘리");
		map.put(201, "도우너");
		map.put(301, "또치");
		map.put(401, "마이콜");
		
		// get은 값을 뽑아내는거임
		System.out.println("key : " + 101 + " value : " + map.get(101));
		System.out.println("key : " + 201 + " value : " + map.get(201));
		System.out.println("key : " + 301 + " value : " + map.get(301));
		System.out.println("key : " + 401 + " value : " + map.get(401));
	}
}