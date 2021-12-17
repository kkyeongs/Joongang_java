package Test16;

public class Login {

	private String id;
	private String pw;
	
	public void setLogin(String id, String pw) {
		this.id = id;
		this.pw = pw;
	}
	
	public void viewLogin() {
		System.out.println("아이디는 " + id + "이고 비밀번호는 " + pw + "입니다");
	}
}
