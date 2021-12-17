package db1;

public class DBMain {

	public static void main(String[] args) {
		
		DBConnection db = new DBConnection();
		
		// 데이터 추가하기
//		db.addressInsert("ddd", "010-123-4567", "울릉도");
//		db.addressInsert("eee", "010-456-7890", "매물도");
		
		// 데이터 수정하기
//		db.addressUpdate(2, "000-0000", "우도");
//		db.addressUpdate(5, "111-1111", "강화도");
		
		// 데이터 삭제하기
//		db.addressDelete(4);
//		db.addressDelete(3);
		
		
		db.dbClose();
		
		// 전체 데이터 조회
		db.addressList();
	}
}