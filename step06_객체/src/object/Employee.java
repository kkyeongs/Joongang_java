package object;

public class Employee {
	
	// - : private, + : public, # : protected
	// -name : String
	// -dept : String
	// -pay : int
	// -score : double
	// getter & setter
	// setEmployee(name : String, dept : String, pay : int, score : double)
	// toString() : String
	
		private String name;
		private String dept;
		private int pay;
		private double score;
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}

		public String getDept() {
			return dept;
		}
		public void setDept(String dept) {
			this.dept = dept;
		}

		public int getPay() {
			return pay;
		}
		public void setPay(int pay) {
			this.pay = pay;
		}

		public double getScore() {
			return score;
		}
		public void setScore(double score) {
			this.score = score;
		}

		public void setEmployee(String name, String dept, int pay, double score) {
			this.name = name;
			this.dept = dept;
			this.pay = pay;
			this.score = score;
		}
		
		public String toString() { // 문자열을 리턴하는 함수 
			// 이름은 이순신이고 개발부에 근무하며 급여는 1500000원 입사성적은 85.75점
			return "이름은 " + getName() + "이고 " + getDept() + "에 근무하며\n급여는 " + getPay() 
					+ "원 입사성적은 " + getScore() + "점";
		}
		
	
	
	
	
	
	
	
}