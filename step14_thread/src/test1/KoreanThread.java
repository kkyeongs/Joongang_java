package test1;

public class KoreanThread extends Thread{
	
	char[] arr={'��','��','��','��','��','��','��','��','��','��','��','��','��','��'};
	
	public synchronized void run() {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
			try {Thread.sleep(30);} catch (InterruptedException e) {e.printStackTrace();}
		}
		System.out.println();
	}
}
