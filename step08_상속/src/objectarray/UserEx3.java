package objectarray;

public class UserEx3 {

	public static void main(String[] args) {
		
		// 크기 지정을 안하고 바로 값을 넣은 상태
		// int[] num = {10, 20, 30}; 
		// 이거랑 같은 개념
		
		User[] ob = {
				new User("kim", "010-123-4567"), 
				new User("lee", "010-234-3287"), 
				new User("park", "010-782-1642"),
		};
		
		for (User x : ob) {
			System.out.println(x.getName() + "\t" + x.getPhone());
		}
	}
}
