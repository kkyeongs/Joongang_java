package �ָ�����;

public class Product {
	
	private String item;
	private String company;
	private int price;
	
	Date dt=null;
	
	public Product(String item, String company, int price, int year, int month, int day) {
		super();
		this.item = item;
		this.company = company;
		this.price = price;
		
		dt=new Date(year, month, day);
		printPro();
		dt.printDate();
	}
	
	public void printPro() {
		System.out.println("��ǰ�� : "+item+"\n������ : "+company+"\n������ : "+price);
	}
}