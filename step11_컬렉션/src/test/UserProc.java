package test;

public class UserProc {

	// getLoginUser()를 만드세요
	
	// 매개변수로 들어온 id와 pw를 "pororo"와 "1234"와 비교하여
	// 맞으면 entity 객체를 만들어 ==> User entity = new User();
	// setter를 통해 id, pw, "뽀로로", 89.97을 대입하세요
	// entity를 리턴하세요
	
	public User getLoginUser(String id, String pw) {
		User entity = new User(); // 변수 선언, 객체 생성, 
		
		if(id.equals("pororo") && pw.equals("1234")) {
			entity.setId(id);
			entity.setPw(pw);
			entity.setName("뽀로로");
			entity.setPoint(89.97);
		}
		return entity;
	}
}