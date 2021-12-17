package factory;

public class FactoryMain {

	public static void main(String[] args) {
		Factory factory=new Factory();		// ����ȭ ó�� ���
		Worker worker=new Worker(factory);	// ������ ó��
		Buyer buyer=new Buyer(factory);		// ������ ó��
		
		worker.start();
		buyer.start();
	}
}















