package whileex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WhileEx2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// ������ ����ϱ�
		// ���� �Է��ϼ��� : 7
		// 7 X 1 = 7
		// 7 X 9 = 63 ����
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("���� �Է��ϼ��� : ");
		int num = Integer.parseInt(br.readLine());
		
		int n = 0;
		while(n < 10) {
			System.out.println(num + " X " + n + " = " + (num * n));
			n++;
		}
	}
}