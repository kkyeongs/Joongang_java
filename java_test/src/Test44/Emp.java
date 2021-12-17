package Test44;

import java.text.DecimalFormat;

public class Emp {
	String name = "È«±æµ¿";
	int salary = 32000000;
	
	public Emp() {
		
	}

	DecimalFormat df = new DecimalFormat("###,###");
	
	public String getDisplay() {
		return "ÀÌ¸§ : " + name + "\n¿¬ºÀ : " + df.format(salary) + "¿ø";
	}
}