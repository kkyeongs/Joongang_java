package collection2;

import java.util.HashMap;

public class MapEx2 {

	public static void main(String[] args) {
		
		HashMap<String, Integer> hmap = new HashMap<String, Integer>();
		hmap.put("해리포터", 95);
		hmap.put("론위즐리", 75);
		hmap.put("헤르미온느", 85);
		hmap.put("헤르미온느", 95); // 키는 중복되지 않음, 동일한 키라면 값을 변경하게됨
		hmap.put("네빌롱바텀", 88);
		hmap.put("드레이코말포이", 55);
		hmap.put(null , 45);	// 키와 벨루에 null 허용됨
		hmap.put("톰리들" , null);
		
		System.out.println(hmap);
		
		Integer num = hmap.get("네빌롱바텀");
		System.out.println("네빌롱바텀의 성적 : " + num);
	}
}