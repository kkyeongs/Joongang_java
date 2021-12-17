package tv2;

public class TvUser {

	public static void main(String[] args) {
		
		// 결합도가 낮은 코드,
		
		String com = args[0];
		
		Tv tv = null;
		
		if(com.equals("LG") || com.equals("lg")) {
			tv = new LgTv();
		} else if(com.equals("SAMSUNG") || com.equals("samsung")) {
			tv = new SamsungTv();
		} else {
			System.out.println("어디 회사 텔레비임?");
		}
		tv.PowerOn();
		tv.PowerOff();
		tv.SoundUp();
		tv.SoundDown();
	}
}