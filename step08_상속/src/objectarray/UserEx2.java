package objectarray;

public class UserEx2 {

	public static void main(String[] args) {
		
		// 오브젝트 배열, 객체 배열, 오브젝트 어레이
		
		int[] num = new int[5];
		num[0] = 10;
		
		User[] ob = new User[3];
		ob[0] = new User("kim", "010-123-4567");
		ob[1] = new User("lee", "010-234-3287");
		ob[2] = new User("park", "010-782-1642");
		
		for (int i = 0; i < ob.length; i++) {
			System.out.println(ob[i].getName() + "\t" + ob[i].getPhone());
		}
	}
}