package threadex;

//		프로세스 : 실행중인 프로그램
//		쓰레드 : 실행중인 프로그램에서 자원을 이용하여 실제로 작업을 수행하는 주체

public class MyThreadEx1 {
	
//	싱글 쓰레드
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