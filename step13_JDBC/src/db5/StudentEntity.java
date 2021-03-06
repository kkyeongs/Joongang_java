package db5;

public class StudentEntity {
	private int num;
	private String name;
	private int kor;
	private int eng;
	private int mat;
	private int tot;
	private double avg;
	
	public StudentEntity() {
	}
	
	public StudentEntity(String name, int kor, int eng, int mat) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}

	public StudentEntity(int num, String name, int kor, int eng, int mat) {
		super();
		this.num = num;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}

	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
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

	public int getTot() {
		return tot;
	}
	public void setTot(int kor, int eng, int mat) {
		this.tot = kor+eng+mat;
	}

	public double getAvg() {
		return avg;
	}
	public void setAvg(int tot) {
		this.avg = tot/3.0;
	}
}