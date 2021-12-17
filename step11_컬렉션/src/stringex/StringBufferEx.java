package stringex;

public class StringBufferEx {

	public static void main(String[] args) {
		
		String buf = "aaa";
		buf += "123";
		buf += "������";
		buf += "\n";
		buf += "������";
		
		System.out.println(buf);
		System.out.println("-------------------------");
		
		StringBuffer st = new StringBuffer();
		st.append("bbb");
		st.append("456");
		st.append("�󸶹�");
		st.append("�󸶹�");
		System.out.println(st);
		System.out.println(st.capacity());	// 16���, �뷮
		System.out.println(st.length());	// 12���, ��
		
		st.delete(3, 6);	// 3���� 5���� �������� �ƿ� ����
		System.out.println(st); 
		System.out.println(st.capacity());
		
		st.reverse();		// �Ųٷ�?..
		System.out.println(st.capacity());
		
		st.trimToSize();	// ������ ������ ����ִ�? .delete�ϰ� �����ִ� ������ ������
		System.out.println(st.capacity());
	}
}