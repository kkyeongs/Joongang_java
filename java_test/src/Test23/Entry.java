package Test23;

public class Entry {
	private String word;
	
	public Entry() {
		System.out.println("** 약어사전 **");
	}

	public Entry(String word) {
		this();
		this.word = word;
	}

	public String toString() {
		return "약어 : " + word;
	}	
}
