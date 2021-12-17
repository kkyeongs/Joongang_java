package factory;

public class Buyer extends Thread{
	
	private Factory factory;
	
	public Buyer(Factory factory) {
		this.factory=factory;
	}
	
	public void run() {
		for (int i = 0; i <= 500; i++) {
			factory.sell();
		}
	}
	
	
	
	
	
	
	
	
}












