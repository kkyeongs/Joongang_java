package Test23;

public class Entry {
	private String word;
	
	public Entry() {
		System.out.println("** ������ **");
	}

	public Entry(String word) {
		this();
		this.word = word;
	}

	public String toString() {
		return "��� : " + word;
	}	
}
