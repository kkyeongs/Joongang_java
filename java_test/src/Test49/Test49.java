package Test49;

public class Test49 extends Profile implements Score, Display{

	private int score;
	
	public Test49(String name, String phone, int sol) {
		super(name, phone);
		score = sol;
	}
	
	public void display() {
		System.out.println("�̸� : "+name+"\n"+"��ȣ : "+phone+"");
		scoreResult(score);
	}
	
	public void scoreResult(int sol) {
		System.out.println("���� : "+score * num);
	}
	
	
	public static void main(String[] args) {
		
		Test49 ob = new Test49("ȫ�浿","123-4567",5);
        ob.display();
	}
}