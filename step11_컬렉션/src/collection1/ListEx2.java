package collection1;

import java.util.ArrayList;
import java.util.List;

public class ListEx2 {

	public static void main(String[] args) {
		
		// ���׸��� generics
		List<Object> list = new ArrayList<Object>(); // <String>�̸� String�� �� �� ����
													 // �ؿ� �ڷ��� ������ ����
		
		// Object�� �ֻ��� Ŭ�����̱⿡ � �ڷ����� �͵� ������ �Ȼ���
		list.add("��");
		list.add("����");
		list.add("����");
		list.add(new Integer(10));
		list.add("�ܿ�");
		list.add(4.0);
		list.add(10.0f);
		
		list.remove("����");
		list.remove(3);
		// list.clear();
		
		for (Object x : list) {
			System.out.println(x);
		}
		
	}
}