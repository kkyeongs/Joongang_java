package test11;

public class ex11 {

	public void output(int a, char b) {
		for (int i = 0; i < 10; i++) {
			System.out.print(b + " ");
		}
	}
	
	public static void main(String[] args) {

		int a;
		char b;
		
		new ex11().output(a = 0, b = '#');
	}
}