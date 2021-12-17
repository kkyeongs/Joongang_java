package threadex;

// 대몬쓰레드, 데몬쓰레드 (daemon Thread)
// - 일반쓰레드의 하위에서 동작하는 구조의 쓰레드
// - 일반쓰레드가 종료하면 데몬쓰레드도 강제로 종료
// - 일반쓰레드가 종료하면 남아있을 이유가 없음
// ex) 자동저장, 화면갱신

class DemonTest extends Thread{
	public void run() {
		while(true) {
			try {Thread.sleep(300);} catch (InterruptedException e) {e.printStackTrace();}
			System.out.println("hello");
		}
	}
}

public class MyThreadEx4 {

	public static void main(String[] args) {
		
		DemonTest th=new DemonTest();
		th.setDaemon(true);
		th.start();
		
		int n=0;
		while(n<10) {
			n++;
			try {Thread.sleep(300);} catch (InterruptedException e) {e.printStackTrace();}
		}
	}
}



















