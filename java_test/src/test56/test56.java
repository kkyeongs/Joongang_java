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
		PhoneBook pb1 = new PhoneBook("123-4567", "����");
		PhoneBook pb2 = new PhoneBook("345-3345", "�뱸");
		PhoneBook pb3 = new PhoneBook("123-7890", "�λ�");
		
		Map<String, PhoneBook> ht = new Hashtable<String, PhoneBook>();
		
		ht.put("ȫ�浿", pb1);
		ht.put("�̸���", pb2);
		ht.put("�Ӳ���", pb3);
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			System.out.print("ã�� ����� �Է��Ͻÿ� : ");
			String name = br.readLine();
			if (ht.get(name) != null) {
				PhoneBook pb = ht.get(name);	// ��ü����... �ʼ� �� 
				System.out.println(pb.toString());
				System.out.print("��� �Ͻðڽ��ϱ�? (y/n) : ");
				char a = br.readLine().charAt(0);
				if (a == 'y') {
					continue;
				} else {
					System.out.println("�����ϰڽ��ϴ�");
					System.exit(0);
				}
			} else {
				System.out.println("ã�� ����� �����ϴ�");
				System.out.print("��� �Ͻðڽ��ϱ�? (y/n) : ");
				char a = br.readLine().charAt(0);
				if (a == 'y') {
					continue;
				} else {
					System.out.println("�����ϰڽ��ϴ�");
					System.exit(0);
				}
			}
		}
	}
}