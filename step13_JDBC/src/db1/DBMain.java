package db1;

public class DBMain {

	public static void main(String[] args) {
		
		DBConnection db = new DBConnection();
		
		// ������ �߰��ϱ�
//		db.addressInsert("ddd", "010-123-4567", "�︪��");
//		db.addressInsert("eee", "010-456-7890", "�Ź���");
		
		// ������ �����ϱ�
//		db.addressUpdate(2, "000-0000", "�쵵");
//		db.addressUpdate(5, "111-1111", "��ȭ��");
		
		// ������ �����ϱ�
//		db.addressDelete(4);
//		db.addressDelete(3);
		
		
		db.dbClose();
		
		// ��ü ������ ��ȸ
		db.addressList();
	}
}