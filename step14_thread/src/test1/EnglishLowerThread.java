package test1;

public class EnglishLowerThread extends Thread {

	char[] arr={'a','b','c','d','e','f','g','h','i','j','k','l','m','n',
              'o','p','q','r','s','t','u','v','w','x','y','z'};
	
	public synchronized void run() {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
			try {Thread.sleep(30);} catch (InterruptedException e) {e.printStackTrace();}
		}
		System.out.println();
	}
}
