package db3;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import static db3.JdbcTemplate.getConnection;
import static db3.JdbcTemplate.close;
import static db3.JdbcTemplate.commit;
import static db3.JdbcTemplate.rollback;

public class UserDao {

	public UserEntity selectUser(String id) {
		Connection conn=getConnection();
		Statement stmt=null;
		ResultSet rs=null;
		UserEntity entity=null;
		
		String sql="select * from users where id='"+id+"'";
		try {
			stmt=conn.createStatement();
			rs=stmt.executeQuery(sql);
			while(rs.next()) {
				entity=new UserEntity();
				// 엔티티에 rs에서 가져온 값을 저장
				entity.setNum(rs.getInt("num"));
				entity.setId(rs.getString("id"));
				entity.setPasswd(rs.getString("passwd"));
				entity.setName(rs.getString("name"));
				entity.setScore(rs.getDouble("score"));
			}
		} catch (SQLException e) {e.printStackTrace();} 
		finally {close(conn); close(stmt); close(rs);}
		return entity;
	}
	
	public List<UserEntity> userList() {
		Connection conn=getConnection();
		Statement stmt=null;
		ResultSet rs=null;
		List<UserEntity> list=new ArrayList<UserEntity>();
		UserEntity entity=null;
		String sql="select * from users";
		
		try {
			stmt=conn.createStatement();
			rs=stmt.executeQuery(sql);
			
			while(rs.next()) {
				entity=new UserEntity();
				entity.setNum(rs.getInt("num"));
				entity.setId(rs.getString("id"));
				entity.setPasswd(rs.getString("passwd"));
				entity.setName(rs.getString("name"));
				entity.setScore(rs.getDouble("score"));
				list.add(entity);
			}
		} catch (SQLException e) {e.printStackTrace();}
		return list;
	}

	public int insertUser(UserEntity entity) {
		int n=0;
		String sql="insert into users(num, id, passwd, name, score) "
					+ "	values(stu_seq.nextval, '"+entity.getId()+"', '"+entity.getPasswd()+"', "
							+ "'"+entity.getName()+"', "+entity.getScore()+")";
		// db로 보내기
		Connection conn=getConnection();
		Statement stmt=null;
		try {
			stmt=conn.createStatement();
			n=stmt.executeUpdate(sql);
			if(n>0) 
				commit(conn);
		} catch (SQLException e1) {rollback(conn);}
		finally {close(conn); close(stmt);}
		return n;
	}

	public int updateUser(UserEntity entity) {
		int m=0;
		String sql="update users set id='"+entity.getId()+"', passwd='"+entity.getPasswd()+"', name='"+entity.getName()+"', score="+entity.getScore()+" where num="+entity.getNum();
		Connection conn=getConnection();
		Statement stmt=null;
		try {
			stmt=conn.createStatement();
			m=stmt.executeUpdate(sql);
			if(m>0)
				commit(conn);
		} catch (SQLException e) {rollback(conn);} 
		finally {close(conn); close(stmt);}
		return m;
	}
	
//	public int updateUser(UserEntity entity) {
//		int m=0;
//		String sql="update users set id=?, passwd=?, name=?, score=? where num=?";
//		Connection conn=getConnection();
//		PreparedStatement pstmt=null;
//		try {
//			pstmt=conn.prepareStatement(sql);
//			pstmt.setString(1, entity.getId());
//			pstmt.setString(2, entity.getPasswd());
//			pstmt.setString(3, entity.getName());
//			pstmt.setDouble(4, entity.getScore());
//			pstmt.setInt(5, entity.getNum());
//			m=pstmt.executeUpdate();
//			if(m>0)
//				commit(conn);
//		} catch (SQLException e) {rollback(conn);} 
//		finally {close(conn); close(pstmt);}
//		return m;
//	}
	
	public int deleteUser(UserEntity entity) {
		int l=0;
		Connection conn=getConnection();
		Statement stmt=null;
		String sql="delete from users where id='"+entity.getId()+"'";
		try {
			stmt=conn.createStatement();
			l=stmt.executeUpdate(sql);
			if(l>0)
				commit(conn);
		} catch (SQLException e) {rollback(conn);} 
		finally {close(conn); close(stmt);}
		return l;
	}
	
//	public int deleteUser(UserEntity entity) {
//		int l=0;
//		Connection conn=getConnection();
//		PreparedStatement pstmt=null;
//		String sql="delete from users where id=?";
//		try {
//			pstmt=conn.prepareStatement(sql);
//			pstmt.setString(1, entity.getId());
//			l=pstmt.executeUpdate();
//			if(l>0)
//				commit(conn);
//		} catch (SQLException e) {rollback(conn);} 
//		finally {close(conn); close(pstmt);}
//		return l;
//	}
//	
}
























