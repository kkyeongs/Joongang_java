package whileex;

public class WhileEx1 {

	public static void main(String[] args) {
		
		int n = 0;
		
		while(true) {  // <--- ���ѷ��� ���ο� Ż�������� �������� ��
			++n;
			if(n <= 5 ) {
				System.out.println("Hello Java");
			} else {
				break;
			}
		}
		System.out.println("-----------------------");
		
		int a = 10;
		while(a >= 1) {
			System.out.print(a + " ");
			--a;
		}
	}
}