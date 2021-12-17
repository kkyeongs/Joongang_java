package singleton;

public class Speaker2 {
	private static Speaker2 speaker;
	private int vol;
	
	private Speaker2() {
		vol=5;
	}
	
	public static Speaker2 getInstance() {
		if(speaker==null) 
			speaker=new Speaker2();
		return speaker;
	}
	
	public int getVol() {
		return vol;
	}
	
	public void setVol(int vol) {
		this.vol=vol;
	}
	
}