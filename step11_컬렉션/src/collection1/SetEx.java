package collection1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetEx {

	// @SuppressWarnings("unchecked") �ڷ��� �˻縦 �������� �ʰڴ�
	public static void main(String[] args) {
		
		// Set ����, �ߺ����X, ��������X, �ϳ��� ������
		Set set = new HashSet();
		set.add("one");
		set.add(2); // object �ڷ������� ��ȯ�� �ȴ� int --> Integer, �⺻������ ��ü������ ��ȯ(�ڽ�)
		set.add(new Float(3.0f)); // boxing : �⺻�ڷ����� ��ü������ ��ȯ, �ڽ� �����ڴ� ����������Ʈ, �����ϸ� �����ɼ����ִ°�
		set.add(4.00);
		set.add(2);
		set.add(Integer.valueOf(2)); // boxing���� �̷��� valueof���
		set.add(new Double(4.00)); // boxing �����ڴ� ����������Ʈ, �����ϸ� �����ɼ����ִ°�
		System.out.println(set);
		
		Iterator iter = set.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
			// System.out.println(iter[0]); �ε����� �������� �ʱ� ������ ����
		}
	}
}