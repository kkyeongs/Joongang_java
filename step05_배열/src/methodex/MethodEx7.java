package methodex;

public class MethodEx7 {

	public static void view1(String str) {
		str = "view1 내부";
		System.out.println(str);
	}
	
	public static void view2(int[] num) {
		System.out.print("view2의 수정전 num : ");
		for(int n : num)
			System.out.print(n + " ");
		num[2] = 300;
		System.out.println();
		
		System.out.print("view2의 수정후 num : ");
		for(int n : num)
			System.out.print(n + " ");
	}
	
	public static void main(String[] args) {
		
		// call by reference
		String str = "happy";
		view1(str);
		System.out.println("main : " + str);
		System.out.println("------------------------");
		
		int[] num = {10, 20, 30, 40, 50};
		System.out.println("main의 num : " + num[2]);
		view2(num);
	}
}