package collection2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MapEx4 {

	public static void main(String[] args) {
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(3, "��ī��");
		map.put(1, "���̸�");
		map.put(2, "�Ḹ��");
		map.put(4, "���α�");
		
		Set<Integer> keys = map.keySet();
		for (Integer n : keys) {
			System.out.println(map.get(n));
		}
		
		List<Integer> list = new ArrayList<Integer>(keys);
		System.out.println(list);
	}
}