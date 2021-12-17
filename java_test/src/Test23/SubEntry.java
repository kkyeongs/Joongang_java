package Test23;

public class SubEntry extends Entry{
	private String definition;
	private int year;
	
	public SubEntry() {
		super();
	}

	public SubEntry(String definition, int year) {
		this.definition = definition;
		this.year = year;
	}
	
	public SubEntry(String word, String definition, int year) {
		super(word);
		this.definition = definition;
		this.year = year;
	}

	public String toString() {
		return super.toString() + "\n���� : " + definition + "\n�ñ� : " + year;
	}
	
}