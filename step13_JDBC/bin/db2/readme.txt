package db2;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class readme {

//		���1) ��ü�� �����Ͽ� �����ϴ� ���
	public void addressList() {
		JdbcTemplate jt = new JdbcTemplate();
		Connection conn = jt.getConnection();
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
//			�ڵ��Է�
		} catch (SQLException e) {}
		finally {
			jt.close(rs);
			jt.close(stmt);
			jt.close(conn);
		}
	}
	
//	���2) Ŭ���� �̸����� �����ϴ� �̱��� ���� ���
	public void addressList1() {
		Connection conn=JdbcTemplate.getConnection();
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
//			�ڵ��Է�
		} catch (SQLException e) {}
		finally {
			jt.close(rs);
			jt.close(stmt);
			jt.close(conn);
		}
	}

//	���3) �̱��� ���� ���.. import
	import static db2.JdbcTemplate.getConnection;
	import static db2.JdbcTemplate.close;
	
		public void addressList2() {
		Connection conn=JdbcTemplate.getConnection();
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
//			�ڵ��Է�
		} catch (SQLException e) {}
		finally {
			jt.close(rs);
			jt.close(stmt);
			jt.close(conn);
		}
	}
	
�̱��� ���� : Ŭ������ ���� �ν��Ͻ��� �ϳ��� ���� ��𼭵� ���ٰ����ϰ� ���� ����ϴ� ���
(JdbcTemplate.getConnection(); �̷��� ���������� �����ϴ� ���)