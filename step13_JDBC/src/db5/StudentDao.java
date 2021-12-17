package db5;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import static db5.JdbcTemplate.*;

public class StudentDao {
	PreparedStatement pstmt=null;
	Statement stmt=null;
	ResultSet rs=null;
	StudentEntity entity=null;
	Connection conn=getConnection();
	List<StudentEntity> list=new ArrayList<StudentEntity>(); 
	int n=0;
	String name=null;
	
	public String insertStudent(StudentEntity entity) {
		String sql="insert into student(num, name, kor, eng, mat) values(n_sql.nextval, ?, ?, ?, ?)";
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, entity.getName());
			pstmt.setInt(2, entity.getKor());
			pstmt.setInt(3, entity.getEng());
			pstmt.setInt(4, entity.getMat());
			n=pstmt.executeUpdate();
			if(n>0) {
				name=entity.getName();
				commit(conn);
			}
		} catch (SQLException e) {rollback(conn);}
		finally {close(pstmt);}
		return name;
	}
	
	public StudentEntity getStudent(String name) {
		String sql="Select * from student where name=?";
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, name);
			rs=pstmt.executeQuery();
			if(rs.next()) {
				entity=new StudentEntity();
				entity.setNum(rs.getInt("num"));
				entity.setName(rs.getString("name"));
				entity.setKor(rs.getInt("kor"));
				entity.setEng(rs.getInt("eng"));
				entity.setMat(rs.getInt("mat"));
				entity.setTot(entity.getKor(), entity.getEng(), entity.getMat());
				entity.setAvg(entity.getTot());
			}
		} catch (SQLException e) {e.printStackTrace();} 
		finally {close(rs); close(pstmt);}
		return entity;
	}
	
	public List<StudentEntity> getStudentList() {
		String sql="select * from student";
		
		try {
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			while(rs.next()) {
				entity=new StudentEntity();
				entity.setNum(rs.getInt("num"));
				entity.setName(rs.getString("name"));
				entity.setKor(rs.getInt("kor"));
				entity.setEng(rs.getInt("eng"));
				entity.setMat(rs.getInt("mat"));
				entity.setTot(entity.getKor(), entity.getEng(), entity.getMat());
				entity.setAvg(entity.getTot());
				list.add(entity);
			}
		} catch (SQLException e) {e.printStackTrace();}
		finally {close(rs); close(pstmt);}
		return list;
	}
	
	
	
	
	
}