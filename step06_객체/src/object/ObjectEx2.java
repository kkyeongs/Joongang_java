package object;

public class ObjectEx2 {

	public static void main(String[] args) {
		
		User us = new User();
		us.setUser("��ȣ��", 95, 85, 73);
		us.getTotal();
		System.out.println(us.getUser());
	}
}