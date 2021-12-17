package db4;

import java.util.Scanner;

public class EmpMain {
	Scanner sc=null;
	EmpBiz biz=null;
	EmpEntity entity=null;
	
	public EmpMain() {
		sc=new Scanner(System.in);
		biz=new EmpBiz();
		entity=new EmpEntity();
	}
	
	public void menu() {
		int n=0;
		String name=null, phone=null, addr=null;
		while (true) {
			System.out.print("1.��ü 2.�߰� 3.���� 4.���� 5.�˻� 6.����\n�����ϼ���(1-6) : ");
			n = sc.nextInt();

			switch (n) {
			case 1:
				biz.addressList(); 
				break;
			case 2:
				System.out.print("�̸� �Է� : "); entity.setName(sc.next());
				System.out.print("��ȣ �Է� : "); entity.setPhone(sc.next());
				System.out.print("�ּ� �Է� : "); entity.setAddr(sc.next());
				biz.addressInsert(entity); 
				break;
			case 3:
				System.out.print("������ ��� �Է� : "); name=sc.next();
				if(biz.addressSearch(name)) {
					System.out.print("�ٲ� ��ȭ �Է� : "); phone=sc.next();
					System.out.print("�ٲ� �ּ� �Է� : "); addr=sc.next();
					biz.addressUpdate(name, phone, addr);
					
//					System.out.print("�̸� �Է� : "); entity.setName(sc.next());
//					System.out.print("��ȣ �Է� : "); entity.setPhone(sc.next());
//					System.out.print("�ּ� �Է� : "); entity.setAddr(sc.next());
//					biz.addressInsert(entity); 
				} else {
					System.out.println("ã�� ����� ����");
				}
				break;
			case 4:
				System.out.print("������ ��� �Է� : "); name=sc.next();
//				if(biz.addressSearch(name))
					biz.addressDelete(name);
				break;
			case 5:
				System.out.print("ã�� ��� : "); 
				name=sc.next(); 
				biz.addressSearch(name); 
				break;
			case 6:
				sc.close(); 
				System.out.println("*****���α׷� ����*****"); 
				System.exit(0);
			}
		}
	}

	public static void main(String[] args) {
		
		new EmpMain().menu();
		
		
		
		
		
	}
}