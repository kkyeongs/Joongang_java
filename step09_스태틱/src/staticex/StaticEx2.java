package staticex;

public class StaticEx2 {

	public static void main(String[] args) {
		
		System.out.println("*** �Ա� �ݸ� ***");
		BankAccount ba1 = new BankAccount(1994, "kim", 1000, 0.07);		ba1.view();
		BankAccount ba2 = new BankAccount(1998, "lee", 1000, 0.12);		ba2.view();
		BankAccount ba3 = new BankAccount(2005, "park", 1000, 0.05);	ba3.view();
		
		System.out.println("*** �ݸ� �����ϱ� ***");
		BankAccount.setRate(0.04);
	}
}