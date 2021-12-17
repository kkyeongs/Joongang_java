package threadex;

//		���μ��� : �������� ���α׷�
//		������ : �������� ���α׷����� �ڿ��� �̿��Ͽ� ������ �۾��� �����ϴ� ��ü

public class MyThreadEx3 extends Thread{
	
//	��Ƽ(����) ������
	String str;
	int num;
	
	public MyThreadEx3(String str, int num) {
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
		System.out.println(Thread.currentThread());
	}
	
	public static void main(String[] args) {
		long start=System.nanoTime();
		
		MyThreadEx3 ob1 = new MyThreadEx3("one", 100);
		MyThreadEx3 ob2 = new MyThreadEx3("two", 100);
		MyThreadEx3 ob3 = new MyThreadEx3("three", 100);
		
		Thread th1=new Thread(ob1);
		Thread th2=new Thread(ob2);
		Thread th3=new Thread(ob3);
		
		th1.start();
		th2.start();
		th3.start();
		
//		start()�� ������(������ ���� �غ�)�� �����ϰ� run()�� ȣ��
	}
}




















