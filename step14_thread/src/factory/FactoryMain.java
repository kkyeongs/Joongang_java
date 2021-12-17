package factory;

public class FactoryMain {

	public static void main(String[] args) {
		Factory factory=new Factory();		// 동기화 처리 담당
		Worker worker=new Worker(factory);	// 쓰레드 처리
		Buyer buyer=new Buyer(factory);		// 쓰레드 처리
		
		worker.start();
		buyer.start();
	}
}















