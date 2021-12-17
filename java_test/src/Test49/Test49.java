package Test49;

public class Test49 extends Profile implements Score, Display{

	private int score;
	
	public Test49(String name, String phone, int sol) {
		super(name, phone);
		score = sol;
	}
	
	public void display() {
		System.out.println("이름 : "+name+"\n"+"번호 : "+phone+"");
		scoreResult(score);
	}
	
	public void scoreResult(int sol) {
		System.out.println("점수 : "+score * num);
	}
	
	
	public static void main(String[] args) {
		
		Test49 ob = new Test49("홍길동","123-4567",5);
        ob.display();
	}
}