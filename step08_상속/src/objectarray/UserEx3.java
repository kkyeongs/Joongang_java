package objectarray;

public class UserEx3 {

	public static void main(String[] args) {
		
		// ũ�� ������ ���ϰ� �ٷ� ���� ���� ����
		// int[] num = {10, 20, 30}; 
		// �̰Ŷ� ���� ����
		
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
