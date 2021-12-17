package test2;

public class Consumer extends Thread {

	private VendingMachine vm;
	
	public Consumer(VendingMachine vm) {
		this.vm=vm;
	}

	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(Thread.currentThread().getName()+" : "+vm.getDrink()+" ²¨³»¸ÔÀ½");
			System.out.println();
			try {Thread.sleep(500);} catch (InterruptedException e) {e.printStackTrace();}
		}
	}
}