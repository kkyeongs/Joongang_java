package step03;

public class ArgsEx {

	public static void main(String[] args) {
		// �ƱԸ�Ʈ argument : �Լ��� �Է°�
		// ���α׷� : ���� + ���� 
		// ���� : ����, ���� : �Լ�
		// �ƱԸ�Ʈ, �Ķ����, �Ű�����(���ĸŰ�����, �ǸŰ�����) --> �Ű�����
		// �Լ�, �ۼ�, ���ν���, �޼ҵ�, �޼��� --> �Լ�
		
		// $ java ArgsEx 10 20 30
		// �� ���� �� : 60
		
		// run as -> run config~ -> �ƱԸ�Ʈ �޴� -> ���α׷� �ƱԸ�Ʈ -> 
		// ������� -> string prompt -> ������ �� ���� ���� ���� ���� �� ����

		// string Ÿ���̱� ������ int Ÿ������ �ٲ��ش�
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);
		
		System.out.println("�� ���� �� : " + (a + b + c));
	}
}