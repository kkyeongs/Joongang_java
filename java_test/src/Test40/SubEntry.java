package Test40;

public class SubEntry extends Entry {
	private String definition;
	private int year;
	
	public SubEntry() {
		
	}
	
	public SubEntry(String word) {
		super(word);
	}

	public SubEntry(String word, String definition, int year) {
		this(word);
		this.definition = definition;
		this.year = year;
	}
	
	public void printView() {
		System.out.println("원어 : " + definition + "\n시기 : " + year);
	}
}
