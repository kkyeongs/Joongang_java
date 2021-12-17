package stringex;

public class StringEx {

	public static void main(String[] args) {
		
		String s1 = "hello";
		String s2 = "hello";
		String s3 = s2;
		String s4 = new String("hello");
		String s5 = new String("hello");
		
		System.out.println(s1 == s2);
		System.out.println(s2 == s3);
		System.out.println(s1 == s3);
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println("--------------------------");
		
		System.out.println(s4 == s5);		// false 
		System.out.println(s4.equals(s5));	// true
		System.out.println("--------------------------");
		
		String str1 = "hello";
		String str2 = " java";
		String str3 = str1.concat(str2);
		System.out.println(str3);
		
		String str4 = str3.substring(6, 9);	// 6번부터 9째 앞에 까지
		System.out.println(str4);
		String str5 = str3.substring(6);
		System.out.println(str5);
		String str6 = str3.toUpperCase();
		System.out.println(str6);
	}
}