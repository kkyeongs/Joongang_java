package collection2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class MapEx3 {

	public static void main(String[] args) {
		
		HashMap<String, String> map = new HashMap<String, String>();
		
		map.put("�Ѹ�", "����1");
		map.put("�����", "����5");
		map.put("��ġ", "����3");
		map.put("������", "����4");
		map.put("��浿", "����2");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� ��ȣ�� �Է��ϼ���(����1~5) : ");
		String room = sc.next();
		
//		Set<String> keyset = map.keySet();
//		for (String key : keyset) {
//			
//			String rooom = map.get(key);
//			if (rooom.equals(room)) {
//				System.out.println(room + "�� �ִ� ����ڴ� " + key + "�Դϴ�");
//			} 
//		}
//		System.out.println("------------------------");
		
		Set<String> keyset = map.keySet();
		Iterator<String> iter = keyset.iterator();
		while(iter.hasNext()) {
			String key = iter.next();
			String value = map.get(key);
			if (value.equals(room)) {
				System.out.println(room + "�� �ִ� ����ڴ� " + key + "�Դϴ�");
			}
		}
		sc.close();
	}
}