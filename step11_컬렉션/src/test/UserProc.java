package test;

public class UserProc {

	// getLoginUser()�� ���弼��
	
	// �Ű������� ���� id�� pw�� "pororo"�� "1234"�� ���Ͽ�
	// ������ entity ��ü�� ����� ==> User entity = new User();
	// setter�� ���� id, pw, "�Ƿη�", 89.97�� �����ϼ���
	// entity�� �����ϼ���
	
	public User getLoginUser(String id, String pw) {
		User entity = new User(); // ���� ����, ��ü ����, 
		
		if(id.equals("pororo") && pw.equals("1234")) {
			entity.setId(id);
			entity.setPw(pw);
			entity.setName("�Ƿη�");
			entity.setPoint(89.97);
		}
		return entity;
	}
}