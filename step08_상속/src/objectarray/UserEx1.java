package objectarray;

public class UserEx1 {

	public static void main(String[] args) {
		
		User a = new User("kim", "010-123-4567");
		User b = new User("lee", "010-234-3287");
		User c = new User("park", "010-782-1642");
		
		System.out.println(a.getName() + "\t" + a.getPhone());
		System.out.println(b.getName() + "\t" + b.getPhone());
		System.out.println(c.getName() + "\t" + c.getPhone());
	}
}