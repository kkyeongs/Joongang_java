package threadex;

class FamilyThread extends Thread {
	private WashRoom wr;
	private String who;
	
	public FamilyThread(WashRoom wr, String who) {
		this.wr=wr;
		this.who=who;
	}
	
	@Override
	public void run() {
		wr.openDoor(who);
	}
}

class WashRoom {
	public synchronized void openDoor(String who) {
		System.out.println(who+"¥‘¿Ã ¿‘¿Â");
		for (int i = 0; i < 50000; i++) {
			if(i%10000==0) {
				try {Thread.sleep(50);} catch (InterruptedException e) {e.printStackTrace();}
				System.out.println(who+"¥‘¿Ã ∫º¿œ¿ª ∫∏¥¬ ¡ﬂ.....");
			}
		}
		System.out.println(who+"¥‘¿Ã ≈¿Â");
	}
}

public class SyncThreadTest {

	public static void main(String[] args) {
		
		WashRoom wr=new WashRoom();
		FamilyThread father=new FamilyThread(wr, "father");
		FamilyThread mother=new FamilyThread(wr, "mother");
		FamilyThread sister=new FamilyThread(wr, "sister");
		FamilyThread brother=new FamilyThread(wr, "brother");
		FamilyThread me=new FamilyThread(wr, "me");
		father.start();
		mother.start();
		sister.start();
		brother.start();
		me.start();
	}
}















