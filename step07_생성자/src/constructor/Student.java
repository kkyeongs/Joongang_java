package constructor;

public class Student {

	// -name : String	// -kor : int	// -eng : int	// -mat : int
	
	// +Student()	// +Student(String name, int kor, int eng, int mat)
	// +getter setter
	// +toSting() : String
	// +getTotal() : int		<--kor+eng+mat 리턴
	// +getAvg(): double		<--getTotal 3 나누기 평균 리턴
	// +getGrade() : char		<--getAvg이용 abcdf학점 리턴
	
	private String name;
	private int kor;
	private int eng;
	private int mat;
	
	public Student() {
		
	}
	
	public Student(String name, int kor, int eng, int mat) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	
	public int getMat() {
		return mat;
	}
	public void setMat(int mat) {
		this.mat = mat;
	}
	
	public String toString() {
		return name + "님의 점수는 " + getTotal() + "점이고 \n평균은 " + String.format("%.2f", getAvg()) + 
						"점이고 등급은 " + getGrade() + "입니다";
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
		case 9 :
			return 'A'; 
		case 8 :
			return 'B';
		case 7:
			return 'C';
		case 6: 
			return 'D';
		default:
			return 'F';
		}
	}
}
