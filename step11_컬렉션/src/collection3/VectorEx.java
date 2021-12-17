package collection3;

import java.util.Vector;

public class VectorEx {

	public static void main(String[] args) {
		
		Vector<Double> v = new Vector<Double>(3, 2); // �⺻ũ��3, �ø�����2
		v.add(100.3);
		v.add(new Double(3.14));
		v.add(50.3);
		v.add(95.6);
		
		System.out.println(v);
		System.out.println("������ : " + v.size());		// ���Ϳ� ����ִ� ���� ����
		System.out.println("�뷮 : " + v.capacity());		// ������ ������ ũ��
		
		double search = 3.14;
		int index = v.indexOf(search);	// search�� ��ġ�� ��������
		if(index != -1) {
			System.out.println(search + "�� ��ġ�� " + (index + 1) + "��°�� �ֽ��ϴ�");
		} else {
			System.out.println(search + "�� ����");
		}
	}
}