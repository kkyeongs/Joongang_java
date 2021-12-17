package tv2;

public class SamsungTv implements Tv{
	public void PowerOn() {
		System.out.println("Samsung TV - 전원을 켠다");
	}
	
	public void PowerOff() {
		System.out.println("Samsung TV - 전원을 끈다");
	}
	
	public void SoundUp() {
		System.out.println("Samsung TV - 소리를 높인다");
	}
	
	public void SoundDown() {
		System.out.println("Samsung TV - 소리를 줄인다");
	}
}