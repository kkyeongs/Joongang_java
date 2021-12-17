package threadex;

// ��󾲷���, ���󾲷��� (daemon Thread)
// - �Ϲݾ������� �������� �����ϴ� ������ ������
// - �Ϲݾ����尡 �����ϸ� ���󾲷��嵵 ������ ����
// - �Ϲݾ����尡 �����ϸ� �������� ������ ����
// ex) �ڵ�����, ȭ�鰻��

class DemonTest extends Thread{
	public void run() {
		while(true) {
			try {Thread.sleep(300);} catch (InterruptedException e) {e.printStackTrace();}
			System.out.println("hello");
		}
	}
}

public class MyThreadEx4 {

	public static void main(String[] args) {
		
		DemonTest th=new DemonTest();
		th.setDaemon(true);
		th.start();
		
		int n=0;
		while(n<10) {
			n++;
			try {Thread.sleep(300);} catch (InterruptedException e) {e.printStackTrace();}
		}
	}
}



















