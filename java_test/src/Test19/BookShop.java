package Test19;

public class BookShop {
	private String bname;
	private String author;
	private int price;
	
	public void setBook(String bname, String author, int price) {
		this.bname = bname;
		this.author = author;
		this.price = price;
	}
	
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}

	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

	public void viewBook() {
		System.out.println("책 이름 : " + bname);
		System.out.println("저자 : " + author);
		System.out.println("가격 : " + price + "원");
		System.out.println();
	}
}
