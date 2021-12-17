package tv2;

public class LgTv implements Tv{
	
	public void PowerOn() {
		System.out.println("LG TV - 전원을 켠다");
	}
	
	public void PowerOff() {
		System.out.println("LG TV - 전원을 끈다");
	}
	
	public void SoundUp() {
		System.out.println("LG TV - 소리를 높인다");
	};
	
	public void SoundDown() {
		System.out.println("LG TV - 소리를 줄인다");
	};
}