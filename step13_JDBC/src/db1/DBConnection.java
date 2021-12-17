package db1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnection {
	
	Connection conn = null;
	
	// java���� db����
	// 1. ����̹� �ε� : ojdbc
	// 2. �����ͺ��̽� ���� ��ü ���� : db������ ����
	// 3. ������ ���� : CRUD
	// 4. ����� ��ȯ
	// 5. ���� ��ü�� ����
	
	public DBConnection() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver"); // 1. ����̹� �ε�
			// 2. ���� ��ü ����
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
		ResultSet rs = null; // �Ѿ���� �����ͺ��̽� ������ ResultSet (select��������)
		String sql = "select * from addressbook"; // 3. ������ ����
		try {
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery(); // 4. DB�� ���� �� ��� ���� (select������ ���, �������� executeUpdate) �Ű����� �ʿ� ����
			while(rs.next()) { // iterate�� ����� ���, 1���� ����
//				System.out.println(rs.getInt(1)); // �ε����� �̿��Ͽ� rs�� ���� ����
//				System.out.println(rs.getString(2));
//				System.out.println(rs.getString(3));
				System.out.print(rs.getInt("num")+"\t"); // �÷����� �̿��Ͽ� ����
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
		// PreparedStatement ��ü ���
//		PreparedStatement pstmt = null;
//		// 3. ������ ����
//		String sql="insert into addressbook(num, name, phone, addr) values(num_seq.nextval,?,?,?)";
//		try {
//			pstmt=conn.prepareStatement(sql);
//			// ������ ���̽� �Է��� ��ü�� ���� ����, set�� �̿��ؼ� �ִ°Ͱ� ���������� ���� ���
//			pstmt.setString(1, name);
//			pstmt.setString(2, phone);
//			pstmt.setString(3, addr);
//			int n=pstmt.executeUpdate(); // �Ű����� �ʿ���� 4. ��� ����
//			
//			if(n>0) { // pstmt.executeUpdate() �����ʹ� 1���� 1���� �ԷµǴ� 1�� ����
//				conn.commit(); // ���� ��ü�� ���� Ŀ��, ����Ŀ���� �ƴϱ� ������ Ŀ��ó���� ���ְ�
//				System.out.println(n+"���� �����Ͱ� �߰��Ǿ����ϴ�");
//			}
//		} catch (SQLException e) {
//			try {
//				conn.rollback();
//				System.out.println("������ �߰��� �����Ͽ����ϴ�");
//			} catch (SQLException e1) {
//				e1.printStackTrace();
//			}
//			e.printStackTrace();
//		} finally {
//			// 5. ���� ��ü ����
//				try {
//					if(pstmt!=null) pstmt.close();
//				} catch (SQLException e) {
//					e.printStackTrace();
//				}
//		}
//	}

	public void addressInsert(String name, String phone, String addr) {
		// Statement ��ü ��� (PreparedStatement���� ����)
		Statement stmt=null;
		
		String sql="insert into addressbook(num, name, phone, addr) values(num_seq.nextval, '"+name+"', '"+phone+"', '"+addr+"')";
//		System.out.println("sql ���� Ȯ�� : "+sql);
		try {
			stmt=conn.createStatement();
			int n=stmt.executeUpdate(sql);
			if (n>0) {
				conn.commit();
				System.out.println(n+"���� �����Ͱ� �߰��Ǿ����ϴ�");
			}
		} catch (SQLException e) {
			try {
				conn.rollback();
				System.out.println("������ �߰��� �����Ͽ����ϴ�");
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
//			// pstmt ��ü�� �Ű������� ���� ���� �������ּ���
//			pstmt.setString(1, phone);
//			pstmt.setString(2, addr);
//			pstmt.setInt(3, num);
//			
//			int n=pstmt.executeUpdate();
//			
//			if (n>0) {
//				conn.commit();
//				System.out.println(n+"���� �����Ͱ� �����Ǿ����ϴ�");
//			}
//		} catch (SQLException e) {
//			try {
//				conn.rollback();
//				System.out.println("������ ������ �����Ͽ����ϴ�");
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
	
	// ���� addressUpdate�� statement�� ����Ͽ� �ϼ�
	public void addressUpdate(int num, String phone, String addr) {
		Statement stmt = null;

		String sql = "update addressbook set phone='"+phone+"', addr='"+addr+"' where num="+num;
		try {
			stmt = conn.createStatement();
			int n = stmt.executeUpdate(sql);
			if (n>0) {
				conn.commit();
				System.out.println(n+"���� �����Ͱ� �����Ǿ����ϴ�");
			}
		} catch (SQLException e) {
			try {
				conn.rollback();
				System.out.println("������ ������ �����Ͽ����ϴ�");
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
				System.out.println(n+"���� �����Ͱ� �����Ǿ����ϴ�");
			}
		} catch (SQLException e) {
			try {
				conn.rollback();
				System.out.println("������ ������ �����Ͽ����ϴ�");
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
//			pstmt.setInt(1, num);	// 1��° ����ǥ�� ���ؼ� num �����ϰڴ�
//			
//			int n=pstmt.executeUpdate();
//			if(n>0) {
//				conn.commit();
//				System.out.println(n+"���� �����Ͱ� �����Ǿ����ϴ�");
//			}
//		} catch (SQLException e) {
//			try {
//				conn.rollback();
//				System.out.println("������ ������ �����Ͽ����ϴ�");
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

















