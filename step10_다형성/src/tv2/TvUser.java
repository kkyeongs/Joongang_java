package tv2;

public class TvUser {

	public static void main(String[] args) {
		
		// ���յ��� ���� �ڵ�,
		
		String com = args[0];
		
		Tv tv = null;
		
		if(com.equals("LG") || com.equals("lg")) {
			tv = new LgTv();
		} else if(com.equals("SAMSUNG") || com.equals("samsung")) {
			tv = new SamsungTv();
		} else {
			System.out.println("��� ȸ�� �ڷ�����?");
		}
		tv.PowerOn();
		tv.PowerOff();
		tv.SoundUp();
		tv.SoundDown();
	}
}