package tv1;

public class TvUser {

	public static void main(String[] args) {
		
		// 결합도가 높은 코드,
		
		String com = args[0];
		
		if(com.equals("LG") || com.equals("lg")) {
			LgTv tv = new LgTv();
			tv.PowerOn();
			tv.PowerOff();
			tv.VolumeUp();
			tv.VolumeDown();
		} else if(com.equals("SAMSUNG") || com.equals("samsung")) {
			SamsungTv tv = new SamsungTv();
			tv.TurnOn();
			tv.TurnOff();
			tv.SoundUp();
			tv.SoundDown(); 
		} else {
			System.out.println("어디 회사 텔레비임?");
		}
	}
}