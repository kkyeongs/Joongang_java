package test2;

import java.util.Stack;

// ����� ����ӽſ��� �ϴ°� ������ �Ȼ����
public class VendingMachine {
	Stack store=new Stack();
	
	public VendingMachine() {
	}
	
	public synchronized String getDrink() { // 
		while(store.isEmpty()) {
			try {wait();} catch (InterruptedException e) {e.printStackTrace();}
		}
		notifyAll();
		return store.pop().toString();
	}
	
	public synchronized void putDrink(String drink) { // ����
		notifyAll();
		store.push(drink);
		System.out.println(Thread.currentThread().getName()+" : "+drink+" ���Ǳ⿡ �ֱ�");
		try {wait();} catch (InterruptedException e) {e.printStackTrace();}
	}
}
///* wait()�� notify()�� �̿��Ͽ� �ϼ�