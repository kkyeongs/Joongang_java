package db2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static java.lang.System.out;

import static db2.JdbcTemplate.getConnection;
import static db2.JdbcTemplate.close;
import static db2.JdbcTemplate.commit;
import static db2.JdbcTemplate.rollback;

// dao : data access object : 데이터베이스에서 자료를 가져오는 객체
public class EmpDao {

	public void addressList() {
		
		Connection conn=getConnection();
		Statement stmt=null;
		ResultSet rs=null;
		
		String sql="select * from addressbook";
		try {
			stmt=conn.createStatement();
			rs=stmt.executeQuery(sql);
			while(rs.next()) {
				out.print(rs.getInt("num")+"\t");
				out.print(rs.getString("name")+"\t");
				out.print(rs.getString("phone")+"\t");
				out.println(rs.getString("addr")+"\t");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(conn);
			close(stmt);
			close(rs);
		}
	}

	public boolean addressSearch(String name) {
		boolean ck=false; 
		Connection conn=getConnection();
		Statement stmt=null;
		ResultSet rs=null;
		
		String sql="select * from addressbook where name='"+name+"'";
		try {
			stmt=conn.createStatement();
			rs=stmt.executeQuery(sql);
			while (rs.next()) {
				ck=true;
				out.print(rs.getInt("num")+"\t");
				out.print(rs.getString("name")+"\t");
				out.print(rs.getString("phone")+"\t");
				out.println(rs.getString("addr")+"\t");
			}
		} catch (SQLException e) {e.printStackTrace();}
		finally {
			close(conn); close(stmt); close(rs);
		}
		return ck;
	}

	public void addressInsert(String name, String phone, String addr) {
		Connection conn=getConnection();
		PreparedStatement pstmt=null;
		String sql="insert into addressbook values(num_seq.nextval, ?, ?, ?)";
		
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, name);
			pstmt.setString(2, phone);
			pstmt.setString(3, addr);
			int n=pstmt.executeUpdate();
			if(n>0) {
				commit(conn);
				out.println(n+"건의 데이터가 추가되었습니다");
			}
		} catch (SQLException e) {rollback(conn);} finally {close(conn); close(pstmt);}
	}

	public void addressUpdate(String name, String phone, String addr) {
		Connection conn=getConnection();
		PreparedStatement pstmt=null;
		
		String sql="Update addressbook set phone=?, addr=? where name=?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, phone);
			pstmt.setString(2, addr);
			pstmt.setString(3, name);
			int n = pstmt.executeUpdate();
			if (n > 0) {
				commit(conn);
				System.out.println(n + "건의 데이터가 수정되었습니다");
			}
		} catch (SQLException e) {
			rollback(conn);
			System.out.println("데이터 수정에 실패하였습니다");
		} finally {
			close(conn);
			close(pstmt);
		}
	}

	public void addressDelete(String name) {
		Connection conn=getConnection();
		PreparedStatement pstmt=null;
		String sql="Delete from addressbook where name=?";
		
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, name);
			int n=pstmt.executeUpdate();
			if(n>0) {
				commit(conn);
				System.out.println("1건의 데이터가 삭제되었습니다");
			}
		} catch (SQLException e) {
			rollback(conn);
			System.out.println("데이터 수정에 실패하였습니다");
		} finally {
			close(conn);
			close(pstmt);
		}
	}
}



















