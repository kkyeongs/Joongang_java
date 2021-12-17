package Test53;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;

public class Test53 {

	public static void main(String[] args) {
		
		StringTokenizer b = new StringTokenizer(a, "*");
		
		while(b.hasMoreTokens()) {
			string = b.nextToken();
			sum += Integer.parseInt(string);
			System.out.print(string);
			if(b.hasMoreTokens()) {
				System.out.print("+");
			}
		}
		System.out.println("=" + sum);
	}
}