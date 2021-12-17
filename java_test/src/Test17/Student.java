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
			return "합격";
		else
			return "불합격";
	}
	
	public String getView() {
		return "나의 이름은 " + name + "이고 \n총점은 " 
						+ getTotal() + "점이고 \n평균은 " + 
							getAvg() + "이고 \n학점은 " + getGrade() 
							+ "이며 \n결과는 " + getResult() + "입니다";
	}
}