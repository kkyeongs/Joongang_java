package Test19;

public class BookShopEx {

	public static void main(String[] args) {
		BookShop ex19 = new BookShop();
		ex19.setBook("자바완성", "황완성", 25000);
		ex19.viewBook();
		
		ex19.setBname("JSP잡기");
		ex19.setAuthor("송JP");
		ex19.setPrice(35000);
		
		System.out.println("책 이름 : " + ex19.getBname());
		System.out.println("저자 : " + ex19.getAuthor());
		System.out.println("가격 : " + ex19.getPrice() + "원");
	}
}