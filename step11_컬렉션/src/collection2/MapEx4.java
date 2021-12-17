package collection2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MapEx4 {

	public static void main(String[] args) {
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(3, "피카츄");
		map.put(1, "파이리");
		map.put(2, "잠만보");
		map.put(4, "꼬부기");
		
		Set<Integer> keys = map.keySet();
		for (Integer n : keys) {
			System.out.println(map.get(n));
		}
		
		List<Integer> list = new ArrayList<Integer>(keys);
		System.out.println(list);
	}
}