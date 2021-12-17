package Test17;

public class Student {
	private String name;
	private int kor;
	private int eng;
	private int mat;

	public void setStudent(String name, int kor, int eng, int mat) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
	
	public int getTotal() {
		return kor + eng + mat;
	}
	
	public double getAvg() {
		return getTotal() / 3.0;
	}
	
	public char getGrade() {
		switch ((int)getAvg() / 10) {
		case 10:
		case 9: return 'A';
		case 8 : return 'B';
		case 7 : return 'C';
		case 6 : return 'D';
		default: return 'F';
		}
	}
	
	public String getResult() {
		if(getGrade() != 'F')
			return "�հ�";
		else
			return "���հ�";
	}
	
	public String getView() {
		return "���� �̸��� " + name + "�̰� \n������ " 
						+ getTotal() + "���̰� \n����� " + 
							getAvg() + "�̰� \n������ " + getGrade() 
							+ "�̸� \n����� " + getResult() + "�Դϴ�";
	}
}