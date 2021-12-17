package collection3;

import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class HashTableEx {

	public static void main(String[] args) {
		
		Map<String, Double> ht = new Hashtable<String, Double>();
		
		ht.put("kim", 75.2);
		ht.put("lee", 100.0);
		ht.put("park", 95.3);
//		ht.put("kim", null); 	해시테이블은 key와 value에 null 값이 오면 안됨
//		ht.put(null, 50.5);		런타임에 nullPointException
		
		System.out.println(ht);
		System.out.println("이름\t점수");
		System.out.println("=============");
		Set<String> set = ht.keySet();
		for (String ob : set) {
			System.out.println(ob + "\t" + ht.get(ob));
		}
	}
}