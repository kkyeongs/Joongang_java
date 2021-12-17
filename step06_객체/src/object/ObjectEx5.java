package object;

class Sales {
	private String item;
	private int qty;
	private int cost;
	
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	
	public String toString() {
		return "품목 : " + item + "\n수량 : " + qty + "\n단가 : " + 
							cost + "원\n금액 : " + getPrice() + "원";
	}
	
	public int getPrice() {
		return (this.qty * this.cost);
	}
}

public class ObjectEx5 {

	public static void main(String[] args) {
		
		// -item : String
		// -qty : int
		// -cost : int
		// +getter&setter
		// +toString : String ==> 출력 담당
		// +getPrcie : int ==> 수량*단가
		
		Sales sl = new Sales();
		sl.setItem("apple");
		sl.setQty(5);
		sl.setCost(1200);
		System.out.println(sl.toString());
		System.out.println(sl.getItem() + " " + sl.getCost() + "원 짜리 " + sl.getQty() 
							+ "개 구입하려면 " + sl.getPrice() + "원이 필요함");
	}
}