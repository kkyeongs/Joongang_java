package test2;

public class Producer extends Thread {

	private VendingMachine vm;
	
	public Producer(VendingMachine vm) {
		this.vm=vm;
	}

	public void run() {
		for (int i = 1; i <= 10; i++) {
//			System.out.println(Thread.currentThread().getName()+" : ����� No."+i+" ���Ǳ⿡ �ֱ�");
			try {Thread.sleep(500);} catch (InterruptedException e) {e.printStackTrace();}
			vm.putDrink("����� No."+i);
		}
	}
}












