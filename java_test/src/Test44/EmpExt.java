package Test44;

public class EmpExt extends Emp {
	
	String department = "ȫ����";
	
	public String getDisplay() {
		return super.getDisplay() + "\n�μ� : " + department;
	}
}