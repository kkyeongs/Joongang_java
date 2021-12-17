package threadex;

public class RoseTest extends Thread{
	
	private String str;
	
	public RoseTest(String str) {
		this.str=str;
	}
	
	@Override
	public void run() {
		for (int i = 1; i <= 500; i++) {
			try {Thread.sleep(5);} catch (InterruptedException e) {e.printStackTrace();}
			System.out.println(str+"\t"+Thread.currentThread()); // 이름, 우선순위, 그룹
		}
	}

	public static void main(String[] args) {
		
		RoseTest ob1=new RoseTest("빨간장미");
		RoseTest ob2=new RoseTest("파란장미");
		RoseTest ob3=new RoseTest("분홍장미");
		
		// 쓰레드위 우선순위(1~10)
		// setPriority()사용해서 우선순위 지정 가능
		// 우선순위가 높은 쓰레드는 낮은 쓰레드에 비해 실행시간을 많이 할당 받는다
		// 다른쓰레드보다 실행시간이 많이 필요하면 우선순위를 높게 두면 된다
		// MAX_PRIORITY	 : 10(최고 순위)
		// MIN_PRIORITY	 : 1(최저 순위)
		// NORM_PRIORITY : 5(순위 미지정)
		// join() : 한 쓰레드가 동작이 끝날때까지 대기
		
		ob1.setPriority(MAX_PRIORITY);
		ob2.setPriority(MIN_PRIORITY);
		ob3.setPriority(NORM_PRIORITY);

		ob1.start();
		// ob1이 끝날때까지 ob2, ob3는 대기
		try {ob1.join();} catch (InterruptedException e) {e.printStackTrace();}
		ob2.start();
		try {ob2.join();} catch (InterruptedException e) {e.printStackTrace();}
		ob3.start();
	}
}
















