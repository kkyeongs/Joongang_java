package db4.copy;

import java.util.List;

// 계산, 유효성 검사
public class EmpBiz {
	EmpDao dao=new EmpDao();
	EmpView view=new EmpView();
	EmpEntity entity=new EmpEntity();
	int n=0;

	public void addressList() {
		List<EmpEntity> list=dao.addressList();
		view.addressList(list);
	}
	
	public boolean addressSearch(String name) {
		entity=dao.addressSearch(name);
		view.addressSearch(entity);

//		return (entity!=null)?true:false;	이렇게해도 괜찮
		if(name.equals(entity.getName()))
			return true;
		else
			return false;
	}
	
	public void addressInsert(EmpEntity entity) {
		n=dao.addressInsert(entity);
		view.addressInsert(n);
	}
	
	public void addressUpdate(String name, String phone, String addr) {
		n=dao.addressUpdate(name, phone, addr);
		view.addressUpdate(n);
	}
	
//	public void addressUpdate(EmpEntity entity) {
//		n=dao.addressUpdate(entity);
//		view.addressUpdate(n);
//	}
	
	public void addressDelete(String name) {
		n=dao.addressDelete(name);
		view.adrressDelete(n);
	}
}

















