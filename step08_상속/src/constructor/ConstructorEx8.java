package constructor;

public class ConstructorEx8 {

	public static void main(String[] args) {
		
		Book bk1 = new Book();
		bk1.setTitle("자바의 정석");
		bk1.setAuthor("김자바");
		bk1.setPage(500);
		System.out.println(bk1.toString());
		
		Book bk2 = new Book("JSP무조건 따라하기", "송JP", 300);
		System.out.println("책 이름 : " + bk2.getTitle());
		System.out.println("책 저자 : " + bk2.getAuthor());
		System.out.println("책 페이지 : " + bk2.getPage() + "페이지");
	}
}