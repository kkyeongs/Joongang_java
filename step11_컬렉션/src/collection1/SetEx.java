package collection1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetEx {

	// @SuppressWarnings("unchecked") 자료형 검사를 진행하지 않겠다
	public static void main(String[] args) {
		
		// Set 집합, 중복허용X, 순서유지X, 하나의 기억공간
		Set set = new HashSet();
		set.add("one");
		set.add(2); // object 자료형으로 변환이 된다 int --> Integer, 기본형에서 객체형으로 변환(박싱)
		set.add(new Float(3.0f)); // boxing : 기본자료형을 객체형으로 변환, 박싱 생성자는 디프리케이트, 업뎃하면 삭제될수도있는거
		set.add(4.00);
		set.add(2);
		set.add(Integer.valueOf(2)); // boxing보다 이렇게 valueof사용
		set.add(new Double(4.00)); // boxing 생성자는 디프리케이트, 업뎃하면 삭제될수도있는거
		System.out.println(set);
		
		Iterator iter = set.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
			// System.out.println(iter[0]); 인덱스로 관리하지 않기 때문에 오류
		}
	}
}