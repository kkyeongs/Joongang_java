package threadex;

public class RoseTest extends Thread{
	
	private String str;
	
	public RoseTest(String str) {
		this.str=str;
	}
	
	@Override
	public void run() {
		for (int i = 1; i <= 500; i++) {
			try {Thread.sleep(5);} catch (InterruptedException e) {e.printStackTrace();}
			System.out.println(str+"\t"+Thread.currentThread()); // �̸�, �켱����, �׷�
		}
	}

	public static void main(String[] args) {
		
		RoseTest ob1=new RoseTest("�������");
		RoseTest ob2=new RoseTest("�Ķ����");
		RoseTest ob3=new RoseTest("��ȫ���");
		
		// �������� �켱����(1~10)
		// setPriority()����ؼ� �켱���� ���� ����
		// �켱������ ���� ������� ���� �����忡 ���� ����ð��� ���� �Ҵ� �޴´�
		// �ٸ������庸�� ����ð��� ���� �ʿ��ϸ� �켱������ ���� �θ� �ȴ�
		// MAX_PRIORITY	 : 10(�ְ� ����)
		// MIN_PRIORITY	 : 1(���� ����)
		// NORM_PRIORITY : 5(���� ������)
		// join() : �� �����尡 ������ ���������� ���
		
		ob1.setPriority(MAX_PRIORITY);
		ob2.setPriority(MIN_PRIORITY);
		ob3.setPriority(NORM_PRIORITY);

		ob1.start();
		// ob1�� ���������� ob2, ob3�� ���
		try {ob1.join();} catch (InterruptedException e) {e.printStackTrace();}
		ob2.start();
		try {ob2.join();} catch (InterruptedException e) {e.printStackTrace();}
		ob3.start();
	}
}
















