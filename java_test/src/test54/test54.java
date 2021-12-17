package test54;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class test54 {

	public static void main(String[] args) {

		Map<String, String> ht = new HashMap<String, String>();
		
		ht.put("ÄáÁãÆÏÁã", "15000");
		ht.put("¹é¼³°øÁÖ", "10000");
		ht.put("º¸¹°¼¶", "18000");
		
		Set<String> ks = ht.keySet();
		Iterator<String> itr = ks.iterator();
		
		while(itr.hasNext()) {
			String key = itr.next();
			String value = ht.get(key);
			System.out.println(key+"ÀÇ Ã¥ °¡°İ="+value+"¿ø");
		}
	}
}