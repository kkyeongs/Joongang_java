package test55;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class test55 {

	public static void main(String[] args) {
		Harrypotter hp1 = new Harrypotter(101, "�ظ�", "����");
		Harrypotter hp2 = new Harrypotter(102, "��", "����");
		Harrypotter hp3 = new Harrypotter(103, "�츣�̿´�", "�׷�����");
		
		Map<Integer, Harrypotter> hm = new HashMap<Integer, Harrypotter>();
		
		hm.put(hp1.getNum(), hp1);
		hm.put(hp2.getNum(), hp2);
		hm.put(hp3.getNum(), hp3);
		
		Set<Integer> ks = hm.keySet();
		Iterator<Integer> itr = ks.iterator();
		
		System.out.println("��\t\t�̸�\n----------------------");
		while(itr.hasNext()) {
			int key = itr.next();
			Harrypotter hp = hm.get(key);
			System.out.println(hp.getFirstname()+"\t\t"+hp.getLastname());
		}
	}
}