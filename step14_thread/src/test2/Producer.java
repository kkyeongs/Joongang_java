package test2;

public class Producer extends Thread {

	private VendingMachine vm;
	
	public Producer(VendingMachine vm) {
		this.vm=vm;
	}

	public void run() {
		for (int i = 1; i <= 10; i++) {
//			System.out.println(Thread.currentThread().getName()+" : 음료수 No."+i+" 자판기에 넣기");
			try {Thread.sleep(500);} catch (InterruptedException e) {e.printStackTrace();}
			vm.putDrink("음료수 No."+i);
		}
	}
}












