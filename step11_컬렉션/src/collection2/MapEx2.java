package collection2;

import java.util.HashMap;

public class MapEx2 {

	public static void main(String[] args) {
		
		HashMap<String, Integer> hmap = new HashMap<String, Integer>();
		hmap.put("�ظ�����", 95);
		hmap.put("������", 75);
		hmap.put("�츣�̿´�", 85);
		hmap.put("�츣�̿´�", 95); // Ű�� �ߺ����� ����, ������ Ű��� ���� �����ϰԵ�
		hmap.put("�׺��չ���", 88);
		hmap.put("�巹���ڸ�����", 55);
		hmap.put(null , 45);	// Ű�� ���翡 null ����
		hmap.put("�踮��" , null);
		
		System.out.println(hmap);
		
		Integer num = hmap.get("�׺��չ���");
		System.out.println("�׺��չ����� ���� : " + num);
	}
}