package whileex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DoWhileEx2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		// do while�� �̿��Ͽ� �ݺ�ó�� �ϼ���
		// �ٽ� ���� �ұ��?(y/Y) y
		// �ٽ� ���� �ұ��?(y/Y) Y
		// �ٽ� ���� �ұ��?(y/Y) n
		// *** ����� ***
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char ck;
		
		do {
			System.out.print("�ٽ� ���� �ұ��? (y/Y) : ");
			ck = br.readLine().charAt(0);
		} while(ck == 'Y' || ck == 'y');
		System.out.println("\n*** ����� ***");
	}
}