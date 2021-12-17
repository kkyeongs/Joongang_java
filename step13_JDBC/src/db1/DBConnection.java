package db1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnection {
	
	Connection conn = null;
	
	// java에서 db연결
	// 1. 드라이버 로드 : ojdbc
	// 2. 데이터베이스 연결 객체 생성 : db정보로 접속
	// 3. 쿼리문 실행 : CRUD
	// 4. 결과값 반환
	// 5. 연결 객체의 해제
	
	public DBConnection() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver"); // 1. 드라이버 로드
			// 2. 연결 객체 생성
			conn=DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe", "edu", "1234");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} 
	}
	
	public void dbClose() {
		try {
			if(conn!=null) conn.close();
		} catch (SQLException e) {
		}
	}

	public void addressList() {
		PreparedStatement pstmt = null;
		ResultSet rs = null; // 넘어오는 데이터베이스 무조건 ResultSet (select구문한정)
		String sql = "select * from addressbook"; // 3. 쿼리문 실행
		try {
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery(); // 4. DB에 질의 및 결과 리턴 (select문에만 사용, 나머지는 executeUpdate) 매개변수 필요 없음
			while(rs.next()) { // iterate와 비슷한 방식, 1부터 시작
//				System.out.println(rs.getInt(1)); // 인덱스를 이용하여 rs에 접근 가능
//				System.out.println(rs.getString(2));
//				System.out.println(rs.getString(3));
				System.out.print(rs.getInt("num")+"\t"); // 컬럼명을 이용하여 접근
				System.out.print(rs.getString("name")+"\t");
				System.out.print(rs.getString("phone")+"\t");
				System.out.println(rs.getString("addr"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs!=null) rs.close();
				if(pstmt!=null) pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
//	public void addressInsert(String name, String phone, String addr) {
		// PreparedStatement 객체 사용
//		PreparedStatement pstmt = null;
//		// 3. 쿼리문 실행
//		String sql="insert into addressbook(num, name, phone, addr) values(num_seq.nextval,?,?,?)";
//		try {
//			pstmt=conn.prepareStatement(sql);
//			// 데이터 베이스 입력은 객체로 만들어서 전달, set을 이용해서 넣는것과 마찬가지로 같은 방식
//			pstmt.setString(1, name);
//			pstmt.setString(2, phone);
//			pstmt.setString(3, addr);
//			int n=pstmt.executeUpdate(); // 매개변수 필요없음 4. 결과 리턴
//			
//			if(n>0) { // pstmt.executeUpdate() 데이터는 1번에 1개씩 입력되니 1이 리턴
//				conn.commit(); // 연결 객체에 대해 커밋, 오토커밋이 아니기 때문에 커밋처리를 해주고
//				System.out.println(n+"건의 데이터가 추가되었습니다");
//			}
//		} catch (SQLException e) {
//			try {
//				conn.rollback();
//				System.out.println("데이터 추가에 실패하였습니다");
//			} catch (SQLException e1) {
//				e1.printStackTrace();
//			}
//			e.printStackTrace();
//		} finally {
//			// 5. 연결 객체 해제
//				try {
//					if(pstmt!=null) pstmt.close();
//				} catch (SQLException e) {
//					e.printStackTrace();
//				}
//		}
//	}

	public void addressInsert(String name, String phone, String addr) {
		// Statement 객체 사용 (PreparedStatement보다 상위)
		Statement stmt=null;
		
		String sql="insert into addressbook(num, name, phone, addr) values(num_seq.nextval, '"+name+"', '"+phone+"', '"+addr+"')";
//		System.out.println("sql 구문 확인 : "+sql);
		try {
			stmt=conn.createStatement();
			int n=stmt.executeUpdate(sql);
			if (n>0) {
				conn.commit();
				System.out.println(n+"건의 데이터가 추가되었습니다");
			}
		} catch (SQLException e) {
			try {
				conn.rollback();
				System.out.println("데이터 추가에 실패하였습니다");
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
		} finally {
				try {
					if(stmt!=null)
					stmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
		}
	}

//	public void addressUpdate(int num, String phone, String addr) {
//		PreparedStatement pstmt=null;
//		
//		String sql="update addressbook set phone=?, addr=? where num=?";
//		
//		try {
//			pstmt=conn.prepareStatement(sql);
//			// pstmt 객체에 매개변수로 받은 값을 대입해주세요
//			pstmt.setString(1, phone);
//			pstmt.setString(2, addr);
//			pstmt.setInt(3, num);
//			
//			int n=pstmt.executeUpdate();
//			
//			if (n>0) {
//				conn.commit();
//				System.out.println(n+"건의 데이터가 수정되었습니다");
//			}
//		} catch (SQLException e) {
//			try {
//				conn.rollback();
//				System.out.println("데이터 수정에 실패하였습니다");
//			} catch (SQLException e1) {
//				e1.printStackTrace();
//			}
//		} finally {
//				try {
//					if(pstmt!=null) pstmt.close();
//				} catch (SQLException e) {
//					e.printStackTrace();
//				}
//		}
//	}
	
	// 문제 addressUpdate를 statement를 사용하여 완성
	public void addressUpdate(int num, String phone, String addr) {
		Statement stmt = null;

		String sql = "update addressbook set phone='"+phone+"', addr='"+addr+"' where num="+num;
		try {
			stmt = conn.createStatement();
			int n = stmt.executeUpdate(sql);
			if (n>0) {
				conn.commit();
				System.out.println(n+"건의 데이터가 수정되었습니다");
			}
		} catch (SQLException e) {
			try {
				conn.rollback();
				System.out.println("데이터 수정에 실패하였습니다");
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
		} finally {
				try {
					if(stmt!=null)
					stmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
		}
	}

	public void addressDelete(int num) {
		Statement stmt = null;
		
		String sql="delete from addressbook where num="+num;
		try {
			stmt = conn.createStatement();
			int n=stmt.executeUpdate(sql);
			if (n>0) {
				conn.commit();
				System.out.println(n+"건의 데이터가 삭제되었습니다");
			}
		} catch (SQLException e) {
			try {
				conn.rollback();
				System.out.println("데이터 삭제에 실패하였습니다");
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
		} finally {
				try {
					if(stmt!=null)
					stmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
		}
	}

//	public void addressDelete(int num) {
//		PreparedStatement pstmt = null;
//		
//		String sql = "delete from addressbook where num=?";
//		
//		try {
//			pstmt=conn.prepareStatement(sql);
//			pstmt.setInt(1, num);	// 1번째 물음표에 대해서 num 대입하겠다
//			
//			int n=pstmt.executeUpdate();
//			if(n>0) {
//				conn.commit();
//				System.out.println(n+"건의 데이터가 삭제되었습니다");
//			}
//		} catch (SQLException e) {
//			try {
//				conn.rollback();
//				System.out.println("데이터 삭제에 실패하였습니다");
//			} catch (SQLException e1) {
//				e1.printStackTrace();
//			}
//			e.printStackTrace();
//		} finally {
//				try {
//					if(pstmt!=null)
//					pstmt.close();
//				} catch (SQLException e) {
//					e.printStackTrace();
//				}
//		}
//	}
}

















