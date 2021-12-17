package collection2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class MapEx3 {

	public static void main(String[] args) {
		
		HashMap<String, String> map = new HashMap<String, String>();
		
		map.put("둘리", "객실1");
		map.put("도우너", "객실5");
		map.put("또치", "객실3");
		map.put("마이콜", "객실4");
		map.put("고길동", "객실2");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("객실 번호를 입력하세요(객실1~5) : ");
		String room = sc.next();
		
//		Set<String> keyset = map.keySet();
//		for (String key : keyset) {
//			
//			String rooom = map.get(key);
//			if (rooom.equals(room)) {
//				System.out.println(room + "에 있는 사용자는 " + key + "입니다");
//			} 
//		}
//		System.out.println("------------------------");
		
		Set<String> keyset = map.keySet();
		Iterator<String> iter = keyset.iterator();
		while(iter.hasNext()) {
			String key = iter.next();
			String value = map.get(key);
			if (value.equals(room)) {
				System.out.println(room + "에 있는 사용자는 " + key + "입니다");
			}
		}
		sc.close();
	}
}