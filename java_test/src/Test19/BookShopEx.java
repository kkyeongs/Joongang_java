package Test19;

public class BookShopEx {

	public static void main(String[] args) {
		BookShop ex19 = new BookShop();
		ex19.setBook("�ڹٿϼ�", "Ȳ�ϼ�", 25000);
		ex19.viewBook();
		
		ex19.setBname("JSP���");
		ex19.setAuthor("��JP");
		ex19.setPrice(35000);
		
		System.out.println("å �̸� : " + ex19.getBname());
		System.out.println("���� : " + ex19.getAuthor());
		System.out.println("���� : " + ex19.getPrice() + "��");
	}
}