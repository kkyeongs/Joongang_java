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
		
		public String toString() { // ���ڿ��� �����ϴ� �Լ� 
			// �̸��� �̼����̰� ���ߺο� �ٹ��ϸ� �޿��� 1500000�� �Ի缺���� 85.75��
			return "�̸��� " + getName() + "�̰� " + getDept() + "�� �ٹ��ϸ�\n�޿��� " + getPay() 
					+ "�� �Ի缺���� " + getScore() + "��";
		}
		
	
	
	
	
	
	
	
}