package stringex;

import java.util.StringTokenizer;

public class StringTokenizerEx {

	public static void main(String[] args) {
		
		// 토큰 : 더 이상 분해할 수 없는 의미있는 최소 단위
		
		String str = "학교,집,학원,게임방,술집,도서관";
		
		String[] value = str.split(",");	// 구분자 한개만 사용할 수 있다. = ,
											// 분해하기
		
		for (String st : value) {
			System.out.println(st);
		}
		System.out.println("-------------------------");
		
		String str1 = "학교,집,학원,,게임방#술집$도서관";
		
		StringTokenizer tokens = new StringTokenizer(str1, ",#$"); // 구분자 = , # $
		System.out.println("파싱한 문자열의 수 : " + tokens.countTokens() + "개");
		
		while (tokens.hasMoreTokens()) {	
			System.out.println(tokens.nextToken());
		}
	}
}
