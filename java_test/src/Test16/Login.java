package Test16;

public class Login {

	private String id;
	private String pw;
	
	public void setLogin(String id, String pw) {
		this.id = id;
		this.pw = pw;
	}
	
	public void viewLogin() {
		System.out.println("���̵�� " + id + "�̰� ��й�ȣ�� " + pw + "�Դϴ�");
	}
}
