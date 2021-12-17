package stringex;

import java.util.StringTokenizer;

public class StringTokenizerEx {

	public static void main(String[] args) {
		
		// ��ū : �� �̻� ������ �� ���� �ǹ��ִ� �ּ� ����
		
		String str = "�б�,��,�п�,���ӹ�,����,������";
		
		String[] value = str.split(",");	// ������ �Ѱ��� ����� �� �ִ�. = ,
											// �����ϱ�
		
		for (String st : value) {
			System.out.println(st);
		}
		System.out.println("-------------------------");
		
		String str1 = "�б�,��,�п�,,���ӹ�#����$������";
		
		StringTokenizer tokens = new StringTokenizer(str1, ",#$"); // ������ = , # $
		System.out.println("�Ľ��� ���ڿ��� �� : " + tokens.countTokens() + "��");
		
		while (tokens.hasMoreTokens()) {	
			System.out.println(tokens.nextToken());
		}
	}
}
