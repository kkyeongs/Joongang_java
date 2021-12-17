package collection3;

import java.util.Vector;

public class VectorEx {

	public static void main(String[] args) {
		
		Vector<Double> v = new Vector<Double>(3, 2); // 기본크기3, 늘릴개수2
		v.add(100.3);
		v.add(new Double(3.14));
		v.add(50.3);
		v.add(95.6);
		
		System.out.println(v);
		System.out.println("사이즈 : " + v.size());		// 백터에 들어있는 값의 개수
		System.out.println("용량 : " + v.capacity());		// 백터의 물리적 크기
		
		double search = 3.14;
		int index = v.indexOf(search);	// search의 위치를 리턴해줌
		if(index != -1) {
			System.out.println(search + "의 위치가 " + (index + 1) + "번째에 있습니다");
		} else {
			System.out.println(search + "가 없다");
		}
	}
}