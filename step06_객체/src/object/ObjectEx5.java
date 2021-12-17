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
		return "ǰ�� : " + item + "\n���� : " + qty + "\n�ܰ� : " + 
							cost + "��\n�ݾ� : " + getPrice() + "��";
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
		// +toString : String ==> ��� ���
		// +getPrcie : int ==> ����*�ܰ�
		
		Sales sl = new Sales();
		sl.setItem("apple");
		sl.setQty(5);
		sl.setCost(1200);
		System.out.println(sl.toString());
		System.out.println(sl.getItem() + " " + sl.getCost() + "�� ¥�� " + sl.getQty() 
							+ "�� �����Ϸ��� " + sl.getPrice() + "���� �ʿ���");
	}
}