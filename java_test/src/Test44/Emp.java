package Test44;

import java.text.DecimalFormat;

public class Emp {
	String name = "ȫ�浿";
	int salary = 32000000;
	
	public Emp() {
		
	}

	DecimalFormat df = new DecimalFormat("###,###");
	
	public String getDisplay() {
		return "�̸� : " + name + "\n���� : " + df.format(salary) + "��";
	}
}