package db2;

import java.util.Scanner;
import static java.lang.System.exit;

/* 1.��ü 2.�߰� 3.���� 4.���� 5.�˻� 6.���� 
 * �����ϼ���(1-6) : 1
 * kim 	010-111-1234	����
 * lee	010-222-2345	����
 * 
 * 1.��ü 2.�߰� 3.���� 4.���� 5.�˻� 6.���� 
 * �����ϼ���(1-6) : 2
 * 
 * �̸��Է� : kim
 * ��ȭ�Է� : 010-111-1234
 * �ּ��Է� : ����
 * 1���� �����Ͱ� �߰��Ǿ����ϴ�
 * 
 * 1.��ü 2.�߰� 3.���� 4.���� 5.�˻� 6.���� 
 * �����ϼ���(1-6) : 5
 * 
 * ã�»���̸� : kim
 * kim 	010-111-1234	����
 * 
 * 1.��ü 2.�߰� 3.���� 4.���� 5.�˻� 6.���� 
 * �����ϼ���(1-6) : 3
 * 
 * ������ ��� �̸� : ppp
 * ã�� ����� �����ϴ� 
 * 
 * 1.��ü 2.�߰� 3.���� 4.���� 5.�˻� 6.���� 
 * �����ϼ���(1-6) : 3
 * 
 * ������ ��� �̸� : kim
 * �ٲ� ��ȭ��ȣ : 010-333-3456
 * �ٲ� �ּ� : �븶��
 * �����Ͱ� �����Ǿ����ϴ�
 */

public class EmpMain {
	Scanner sc=null;
	EmpDao dao=null;
	
	public EmpMain() {
		sc=new Scanner(System.in);
		dao=new EmpDao();
	}
	
	public void menu() {
		int n=0;
		String name=null, phone=null, addr=null;
		while (true) {
			System.out.print("1.��ü 2.�߰� 3.���� 4.���� 5.�˻� 6.����\n�����ϼ���(1-6) : ");
			n = sc.nextInt();

			switch (n) {
			case 1:dao.addressList(); break;
			case 2:System.out.print("�̸� �Է� : "); name=sc.next();
					System.out.print("��ȭ �Է� : "); phone=sc.next();
					System.out.print("�ּ� �Է� : "); addr=sc.next();
					dao.addressInsert(name, phone, addr);
					break;
			case 3:System.out.print("������ ��� �̸� : ");
					name=sc.next();
					if(dao.addressSearch(name)) {
						System.out.print("�ٲ� ��ȭ��ȣ : "); phone=sc.next();
						System.out.print("�ٲ� �ּ� : "); addr=sc.next();
						dao.addressUpdate(name, phone, addr);
					} else {
						System.out.println("ã�� ����� �����ϴ�");
					}
					break;
			case 4:System.out.print("������ ��� : "); name=sc.next();
					if(dao.addressSearch(name)) {
						dao.addressDelete(name);
					} else {
						System.out.println("ã�� ����� �����ϴ�");
					}
					break;
			case 5:System.out.print("ã�� ��� �̸� : ");
					name=sc.next();
					if(!dao.addressSearch(name))
						System.out.println("ã�� ����� �����ϴ�");
					break;
			case 6:sc.close(); System.out.println("*** ���α׷� ���� ***"); exit(0);
			default:System.out.println("*** �Է� ���� ***");
			}
		}
	}
	
	public static void main(String[] args) {
		new EmpMain().menu();
	}
}






















