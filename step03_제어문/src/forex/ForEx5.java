package forex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class ForEx5 {
	
	public static void main(String[] args) throws IOException {
		
		// BufferedReader�� �̿��ؼ� ���α׷� �ۼ�
		// 1. ���ڸ� �Է¹ޱ�(��, �빮�ڸ� �Է¹ޱ�)
		// 2. �����ϰ� �빮�ڸ� 30�� �߻��Ͽ� ȭ�鿡 ���
		// 3. �߻��� ���� �߿� �Է��� ���ڰ� ����� ���
		
		// ���ȭ��
		// �����Է� : K
		// D D F K R .....
		// K�� ���� : ?
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("���� �Է�(�빮�ڸ�) : ");
		char a = br.readLine().charAt(0);
		
		char Rn;
		int count = 0;
		for (int i = 0; i < 30; i++) {
			Rn = (char)(Math.random()*26+65);
			System.out.print(Rn + " ");
			if(a == Rn) {
				++count;
			}
		}
		System.out.println();
		System.out.println(a + "�� ���� : " + count);
	}
}