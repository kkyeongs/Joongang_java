package Test44;

public class EmpExt extends Emp {
	
	String department = "È«º¸ºÎ";
	
	public String getDisplay() {
		return super.getDisplay() + "\nºÎ¼­ : " + department;
	}
}