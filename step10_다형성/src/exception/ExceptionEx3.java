package exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExceptionEx3 {
	
	String str;
	
	public ExceptionEx3() {
		input();
	}
	
	public void input() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("���ڿ��� �Է��ϼ��� : ");
		try {
			str = br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void output() {
		System.out.println("��� : " + str);
	}

	public static void main(String[] args) {
		
		// cheked exception
		new ExceptionEx3().output();
	}
}