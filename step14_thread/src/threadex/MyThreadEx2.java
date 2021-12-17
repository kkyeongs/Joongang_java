package threadex;

//		프로세스 : 실행중인 프로그램
//		쓰레드 : 실행중인 프로그램에서 자원을 이용하여 실제로 작업을 수행하는 주체

public class MyThreadEx2 extends Thread{
	
//	멀티(다중) 쓰레드
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
		System.out.println("소요시간 : " +(end-start));
	}
	
	public static void main(String[] args) {
		long start=System.nanoTime();
		
		MyThreadEx2 ob1 = new MyThreadEx2("one", 100);
		MyThreadEx2 ob2 = new MyThreadEx2("two", 100);
		MyThreadEx2 ob3 = new MyThreadEx2("three", 100);
		ob1.start();
		ob2.start();
		ob3.start();
		
//		start()는 쓰레드(쓰레드 실행 준비)를 생성하고 run()을 호출
	}
}




















