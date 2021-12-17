package test1;

public class ThreadMain {

	public static void main(String[] args) {

		EnglishLowerThread t1=new EnglishLowerThread();
	    EnglishUpperThread t2=new EnglishUpperThread();
	    KoreanThread t3=new KoreanThread();
		
	    t3.start();
	    try {t3.join();} catch (InterruptedException e) {e.printStackTrace();}
	    t2.start();
	    try {t2.join();} catch (InterruptedException e) {e.printStackTrace();}
		t1.start();
		try {t1.join();} catch (InterruptedException e) {e.printStackTrace();}
	}
}