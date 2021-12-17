package Test32;

public class Test32 {

	public static void main(String[] args) {
		
		int[] num = {1,5,2,7,3,9,10,4,6,8};
		int a = 0;
		int b = 0;
		
		for (int i = 0; i < num.length; i++) {
			if (num [i] % 2 != 0) {
				a += num[i];
			} else if(num [i] % 2 == 0) {
				b += num[i];
			}
		}
		System.out.println("È¦¼ö¹æÀÇ ÇÕ = " + a);
		System.out.println("Â¦¼ö¹æÀÇ ÇÕ = " + b);
	}
}