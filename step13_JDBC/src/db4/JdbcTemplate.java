package db4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcTemplate {

	public static Connection getConnection() {
	Connection conn=null;
	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		conn=DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe", "edu", "1234");
		return conn;
		} catch (ClassNotFoundException | SQLException e) {
		return conn;
	}
}
	
	public static boolean isConnection(Connection conn) {
		boolean valid=true;
		try {
			if(conn==null||conn.isClosed())
				valid=false;
		} catch (SQLException e) {valid=false;}
		return valid;
	}
	
	public static void close(Connection conn) {
		if(isConnection(conn)) {
			try {conn.close();} catch (SQLException e) {e.printStackTrace();}
		}
	}
	public static void close(Statement stmt) {
		if(stmt!=null) {
			try {stmt.close();} catch (SQLException e) {e.printStackTrace();}
		}
	}
	public static void close(ResultSet rs) {
		if(rs!=null) {
			try {rs.close();} catch (SQLException e) {e.printStackTrace();}
		}
	}
	
	public static void commit(Connection conn) {
		if(isConnection(conn)) {
			try {conn.commit();} catch (SQLException e) {e.printStackTrace();}
		}
	}
	
	public static void rollback(Connection conn) {
		if(isConnection(conn))
			try {conn.rollback();} catch (SQLException e) {e.printStackTrace();}
	}
}

















