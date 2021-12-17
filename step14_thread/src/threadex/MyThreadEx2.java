package threadex;

//		���μ��� : �������� ���α׷�
//		������ : �������� ���α׷����� �ڿ��� �̿��Ͽ� ������ �۾��� �����ϴ� ��ü

public class MyThreadEx2 extends Thread{
	
//	��Ƽ(����) ������
	String str;
	int num;
	
	public MyThreadEx2(String str, int num) {
		super();
		this.str = str;
		this.num = num;
	}

	@Override
	public void run() {
		long start=System.nanoTime();
		for (int i = 0; i < num; i++) {
			System.out.println(str+" : "+i);
			try {Thread.sleep(30);} catch (InterruptedException e) {e.printStackTrace();}
		}
		long end=System.nanoTime();
		System.out.println("�ҿ�ð� : " +(end-start));
	}
	
	public static void main(String[] args) {
		long start=System.nanoTime();
		
		MyThreadEx2 ob1 = new MyThreadEx2("one", 100);
		MyThreadEx2 ob2 = new MyThreadEx2("two", 100);
		MyThreadEx2 ob3 = new MyThreadEx2("three", 100);
		ob1.start();
		ob2.start();
		ob3.start();
		
//		start()�� ������(������ ���� �غ�)�� �����ϰ� run()�� ȣ��
	}
}




















