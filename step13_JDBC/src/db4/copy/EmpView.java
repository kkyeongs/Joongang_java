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
			System.out.println("데이터가 없다");
		}
	}

	public void addressSearch(EmpEntity entity) {
		if(entity!=null) {
			System.out.print(entity.getNum()+"\t");
			System.out.print(entity.getName()+"\t");
			System.out.print(entity.getPhone()+"\t");
			System.out.println(entity.getAddr()+"\t");
		} else {
			System.out.println("데이터가 없다");
		}
	}
	
	public void addressInsert(int n) {
		if(n>0)
			System.out.println(n+"건의 데이터 입력 성공");
		else 
			System.out.println("데이터 입력 실패");
	}
	
	public void addressUpdate(int n) {
		if(n>0)
			System.out.println(n+"건의 데이터 수정 성공");
		else
			System.out.println("데이터 수정 실패");
	}
	
	
	public void adrressDelete(int n) {
		if(n>0)
			System.out.println(n+"건의 데이터 삭제 성공");
		else
			System.out.println("데이터 삭제 실패");
	}
}


















