package test2;

import java.util.Stack;

// 출력은 밴딩머신에서 하는게 오류가 안생긴다
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
	
	public synchronized void putDrink(String drink) { // 생산
		notifyAll();
		store.push(drink);
		System.out.println(Thread.currentThread().getName()+" : "+drink+" 자판기에 넣기");
		try {wait();} catch (InterruptedException e) {e.printStackTrace();}
	}
}
///* wait()와 notify()를 이용하여 완성