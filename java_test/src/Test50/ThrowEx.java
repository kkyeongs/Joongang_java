package Test50;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ThrowEx {
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public int dan=0;
	
	public void inputData() throws NumberFormatException, IOException {
		System.out.print("단을 입력하시오 : ");
		try {
			dan = Integer.parseInt(br.readLine());
		} catch (Exception e) {
			System.out.println("정수값만 입력해주세요");
		} finally {
			System.out.println("단 입력 : " + dan);
			br.close();
			guguPrint();
		}
	}
	
	public void guguPrint() {
		for (int i = 1; i < 10; i++) {
			System.out.println(dan+" * "+i+" = "+(dan*i));
		}
	}
}