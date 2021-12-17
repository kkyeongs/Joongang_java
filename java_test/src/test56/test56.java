package test56;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class test56 {

	public static void main(String[] args) throws IOException {
		PhoneBook pb1 = new PhoneBook("123-4567", "서울");
		PhoneBook pb2 = new PhoneBook("345-3345", "대구");
		PhoneBook pb3 = new PhoneBook("123-7890", "부산");
		
		Map<String, PhoneBook> ht = new Hashtable<String, PhoneBook>();
		
		ht.put("홍길동", pb1);
		ht.put("이몽룡", pb2);
		ht.put("임꺽정", pb3);
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			System.out.print("찾는 사람을 입력하시오 : ");
			String name = br.readLine();
			if (ht.get(name) != null) {
				PhoneBook pb = ht.get(name);	// 객체생성... 필수 꼭 
				System.out.println(pb.toString());
				System.out.print("계속 하시겠습니까? (y/n) : ");
				char a = br.readLine().charAt(0);
				if (a == 'y') {
					continue;
				} else {
					System.out.println("종료하겠습니다");
					System.exit(0);
				}
			} else {
				System.out.println("찾는 사람이 없습니다");
				System.out.print("계속 하시겠습니까? (y/n) : ");
				char a = br.readLine().charAt(0);
				if (a == 'y') {
					continue;
				} else {
					System.out.println("종료하겠습니다");
					System.exit(0);
				}
			}
		}
	}
}