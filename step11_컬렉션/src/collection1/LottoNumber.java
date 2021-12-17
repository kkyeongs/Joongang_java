package collection1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class LottoNumber {

	public static void main(String[] args) {
		
		// �񺹿� ����(�ߺ�X) -- Set��ü�� ���� ����
		// hash = �����ٰ� ����
		
		Set<Integer> set = new HashSet<Integer>();
		
		while(set.size() < 6) {
			set.add((int)(Math.random() * 45) + 1); // 1 ���� (45+1) �̸��� ��
		}
		
		List<Integer> list = new ArrayList<Integer>(set);
		Collections.sort(list);
		for (Integer ob : list) {
			System.out.print(ob + " ");
		}
	}
}