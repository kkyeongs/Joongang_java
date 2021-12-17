package db4;

import java.net.CookieManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import static db4.JdbcTemplate.*;

public class EmpDao {
	Statement stmt=null;
	ResultSet rs=null;
	EmpEntity entity=null;
	PreparedStatement pstmt=null;
	int n=0;

	public List<EmpEntity> addressList() {
		Connection conn=getConnection();
		List<EmpEntity> list=new ArrayList<EmpEntity>();
		String sql="select * from addressbook order by num";
		try {
			stmt=conn.createStatement();
			rs=stmt.executeQuery(sql);
			while(rs.next()) {
				entity=new EmpEntity();
				entity.setNum(rs.getInt("num"));
				entity.setName(rs.getString("name"));
				entity.setPhone(rs.getString("phone"));
				entity.setAddr(rs.getString("addr"));
				list.add(entity);
			}
		} catch (SQLException e) {e.printStackTrace();}
		finally {close(conn); close(stmt); close(rs);}
		return list;
	}

	public EmpEntity addressSearch(String name) {
		Connection conn=getConnection();
		String sql="select * from addressbook where name=?";
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, name);
			rs=pstmt.executeQuery();
			if(rs.next()) {
				entity=new EmpEntity();
				entity.setNum(rs.getInt("num"));
				entity.setName(rs.getString("name"));
				entity.setPhone(rs.getString("phone"));
				entity.setAddr(rs.getString("addr"));
			}
		} catch (SQLException e) {e.printStackTrace();} 
		finally {close(conn); close(pstmt);}
		return entity;
	}

	public int addressInsert(EmpEntity entity) {
		Connection conn=getConnection();
		String sql="insert into addressbook(num, name, phone, addr) values(num_seq.nextval, ?, ?, ?)";
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, entity.getName());
			pstmt.setString(2, entity.getPhone());
			pstmt.setString(3, entity.getAddr());
			n=pstmt.executeUpdate();
			if(n>0)
				commit(conn);
		} catch (SQLException e) {rollback(conn);} 
		finally {close(conn); close(pstmt);}
		return n;
	}
	
	public int addressUpdate(String name, String phone, String addr) {
		Connection conn=getConnection();
		String sql="Update addressbook set phone=?, addr=? where name=?";
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, phone);
			pstmt.setString(2, addr);
			pstmt.setString(3, name);
			n=pstmt.executeUpdate();
			if(n>0)
				commit(conn);
		} catch (SQLException e) {rollback(conn);}
		finally {close(conn); close(pstmt);}
		return n;
	}
	
//	public int addressUpdate(EmpEntity entity) {
//		Connection conn=getConnection();
//		String sql="Update addressbook set phone=?, addr=? where name=?";
//		try {
//			pstmt=conn.prepareStatement(sql);
//			pstmt.setString(1, entity.getPhone());
//			pstmt.setString(2, entity.getAddr());
//			pstmt.setString(3, entity.getName());
//			n=pstmt.executeUpdate();
//			if(n>0)
//				commit(conn);
//		} catch (SQLException e) {rollback(conn);}
//		finally {close(conn); close(pstmt);}
//		return n;
//	}

	public int addressDelete(String name) {
		Connection conn=getConnection();
		String sql="Delete from addressbook where name=?";
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, name);
			n=pstmt.executeUpdate();
			if(n>0) 
				commit(conn);
		} catch (SQLException e) {rollback(conn);}
		finally {close(conn); close(pstmt);}
		return n;
	}
		
	
	
	
	
	
	
}



















