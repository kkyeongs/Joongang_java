package db2;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class readme {

//		방법1) 객체를 생성하여 접근하는 방식
	public void addressList() {
		JdbcTemplate jt = new JdbcTemplate();
		Connection conn = jt.getConnection();
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
//			코드입력
		} catch (SQLException e) {}
		finally {
			jt.close(rs);
			jt.close(stmt);
			jt.close(conn);
		}
	}
	
//	방법2) 클래스 이름으로 접근하는 싱글톤 패턴 방식
	public void addressList1() {
		Connection conn=JdbcTemplate.getConnection();
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
//			코드입력
		} catch (SQLException e) {}
		finally {
			jt.close(rs);
			jt.close(stmt);
			jt.close(conn);
		}
	}

//	방법3) 싱글톤 패턴 방식.. import
	import static db2.JdbcTemplate.getConnection;
	import static db2.JdbcTemplate.close;
	
		public void addressList2() {
		Connection conn=JdbcTemplate.getConnection();
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
//			코드입력
		} catch (SQLException e) {}
		finally {
			jt.close(rs);
			jt.close(stmt);
			jt.close(conn);
		}
	}
	
싱글톤 패턴 : 클래스에 대한 인스턴스를 하나만 만들어서 어디서든 접근가능하게 나눠 사용하는 방식
(JdbcTemplate.getConnection(); 이렇게 직접적으로 접근하는 방식)