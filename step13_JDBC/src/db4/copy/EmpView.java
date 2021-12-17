package db4.copy;

import java.util.List;

public class EmpView {

	public void addressList(List<EmpEntity> list) {
		if(list!=null) {
			for (EmpEntity entity : list) {
				System.out.print(entity.getNum()+"\t");
				System.out.print(entity.getName()+"\t");
				System.out.print(entity.getPhone()+"\t");
				System.out.println(entity.getAddr());
			}
		} else {
			System.out.println("�����Ͱ� ����");
		}
	}

	public void addressSearch(EmpEntity entity) {
		if(entity!=null) {
			System.out.print(entity.getNum()+"\t");
			System.out.print(entity.getName()+"\t");
			System.out.print(entity.getPhone()+"\t");
			System.out.println(entity.getAddr()+"\t");
		} else {
			System.out.println("�����Ͱ� ����");
		}
	}
	
	public void addressInsert(int n) {
		if(n>0)
			System.out.println(n+"���� ������ �Է� ����");
		else 
			System.out.println("������ �Է� ����");
	}
	
	public void addressUpdate(int n) {
		if(n>0)
			System.out.println(n+"���� ������ ���� ����");
		else
			System.out.println("������ ���� ����");
	}
	
	
	public void adrressDelete(int n) {
		if(n>0)
			System.out.println(n+"���� ������ ���� ����");
		else
			System.out.println("������ ���� ����");
	}
}


















