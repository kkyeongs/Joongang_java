package exception;

class MyExreption extends Exception {
	public MyExreption() {
		System.out.println("�̼����� ���Ա���\n������");
	}
}

public class ExceptionEx4 {
										// �ڹٰ� �����ϴ°� throws s�� �ٴ´�
	public static void main(String[] args) throws MyExreption {
		// ����� ���� ���� ó��
		
		int age = Integer.parseInt(args[0]);
		
		if (age < 19)
			throw new MyExreption();	// ����ڰ� �����ϴ°� throw s�� �Ⱥٴ´�
		else
			System.out.println("������� ����...");

	}
}
