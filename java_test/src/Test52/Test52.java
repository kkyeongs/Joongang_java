package Test52;

public class Test52 {

	public static void main(String[] args) {
		char a;
		String b = "";
		
		String str="IT ELITE";
		System.out.println(str.charAt(4)+""+str.charAt(6));
		System.out.println(str.toLowerCase());
		System.out.println(str.substring(0,3));
		System.out.println(str.substring(3));
		
		for (int i = 0; i < str.length(); i++) {
			a = str.charAt(i);
			if ((65<=a) && (a<=90)) {
				b += str.valueOf(a).toLowerCase();
			} else if ((97<=a) && (a<=122)) {
				b += str.valueOf(a).toUpperCase();
			} else {
				b += (char)a;
			}
		}
		System.out.println(b);
	}
}