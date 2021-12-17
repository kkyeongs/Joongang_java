package factory;

public class Factory {
	
	private int product=0;
	
	public synchronized void produce() {
		if(product>4) {
			System.out.println("생상 중단 : "+product);
			try {wait();} catch (InterruptedException e) {e.printStackTrace();}
		} 
		product++;
		System.out.println("생산 : "+product);
		notifyAll();
	}
	
	public synchronized void sell() {
		if(product<1) {
			System.out.println("소비 중단 : "+product);
			try {wait();} catch (InterruptedException e) {e.printStackTrace();}
		}
		product--;
		System.out.println("소비 : "+product);
		notifyAll();
	}
	
	
	
	
	
}













