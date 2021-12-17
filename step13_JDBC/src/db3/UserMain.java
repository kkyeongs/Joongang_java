package db3;

import java.util.ArrayList;
import java.util.List;

public class UserMain {

	public static void main(String[] args) {
		List<UserEntity> list=new ArrayList<UserEntity>();
		UserDao dao = new UserDao();
		UserEntity entity = dao.selectUser("bb");
		
//		System.out.print(entity.getNum()+"\t");
//		System.out.print(entity.getId()+"\t");
//		System.out.print(entity.getPasswd()+"\t");
//		System.out.print(entity.getName());
//		System.out.println(entity.getScore()+"\t");
//		System.out.println("----------------------------");
		
		// ������ �߰��ϱ�
//		int n=dao.insertUser(new UserEntity("cc", "1111", "park", 75.3));
//		if(n>0)
//			System.out.println(n+"���� �����Ͱ� �߰�");
//		else
//			System.out.println("������ �߰� ����");
//		System.out.println("----------------------------");
		
//		// ������ �����ϱ�
//		int m=dao.updateUser(new UserEntity(2, "bbb", "2222", "lee", 85.3));
//		if(m>0)
//			System.out.println(m+"���� ������ ����");
//		else
//			System.out.println("������ ���� ����");
//		System.out.println("----------------------------");
		
		// ������ �����ϱ�
		int l=dao.deleteUser(new UserEntity("dd"));
		if(l>0)
			System.out.println(l+"���� ������ ����");
		else
			System.out.println("������ ���� ����");
		
		
		System.out.println("----------------------------");
		
		list=dao.userList();
		for (UserEntity ob : list) {
			System.out.print(ob.getNum()+"\t");
			System.out.print(ob.getId()+"\t");
			System.out.print(ob.getPasswd()+"\t");
			System.out.print(ob.getName()+"\t");
			System.out.println(ob.getScore()+"\t");
		}
	}
}









