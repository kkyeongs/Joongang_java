package test1;

public class EnglishUpperThread extends Thread {

	char[] arr={'A','B','C','D','E','F','G','H','I','J','K','L','M','N',
		          'O','P','Q','R','S','T','U','V','W','X','Y','Z'};
	
	public synchronized void run() {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
			try {Thread.sleep(30);} catch (InterruptedException e) {e.printStackTrace();}
		}
		System.out.println();
	}
}
