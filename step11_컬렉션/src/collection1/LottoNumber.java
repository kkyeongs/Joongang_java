package collection1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class LottoNumber {

	public static void main(String[] args) {
		
		// 비복원 추출(중복X) -- Set객체에 값을 저장
		// hash = 빠르다고 생각
		
		Set<Integer> set = new HashSet<Integer>();
		
		while(set.size() < 6) {
			set.add((int)(Math.random() * 45) + 1); // 1 부터 (45+1) 미만의 수
		}
		
		List<Integer> list = new ArrayList<Integer>(set);
		Collections.sort(list);
		for (Integer ob : list) {
			System.out.print(ob + " ");
		}
	}
}