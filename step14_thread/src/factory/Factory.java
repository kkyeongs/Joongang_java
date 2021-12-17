package factory;

public class Factory {
	
	private int product=0;
	
	public synchronized void produce() {
		if(product>4) {
			System.out.println("���� �ߴ� : "+product);
			try {wait();} catch (InterruptedException e) {e.printStackTrace();}
		} 
		product++;
		System.out.println("���� : "+product);
		notifyAll();
	}
	
	public synchronized void sell() {
		if(product<1) {
			System.out.println("�Һ� �ߴ� : "+product);
			try {wait();} catch (InterruptedException e) {e.printStackTrace();}
		}
		product--;
		System.out.println("�Һ� : "+product);
		notifyAll();
	}
	
	
	
	
	
}













