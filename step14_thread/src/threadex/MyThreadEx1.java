package threadex;

//		���μ��� : �������� ���α׷�
//		������ : �������� ���α׷����� �ڿ��� �̿��Ͽ� ������ �۾��� �����ϴ� ��ü

public class MyThreadEx1 {
	
//	�̱� ������
	String str;
	int num;
	
	public MyThreadEx1(String str, int num) {
		super();
		this.str = str;
		this.num = num;
	}

	public void view() {
		for (int i = 0; i < num; i++) {
			System.out.println(str+" : "+i);
			try {Thread.sleep(30);} catch (InterruptedException e) {e.printStackTrace();}
		}
	}
	
	public static void main(String[] args) {
		
		MyThreadEx1 ob1 = new MyThreadEx1("one", 100);
		MyThreadEx1 ob2 = new MyThreadEx1("two", 100);
		MyThreadEx1 ob3 = new MyThreadEx1("three", 100);
		ob1.view();
		ob2.view();
		ob3.view();
	}
}