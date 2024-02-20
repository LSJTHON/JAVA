package ch20.mysql.sec08;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BoardDeleteExample {

	public static void main(String[] args) {
		Connection conn = null;
		try {
			//jdbc driver 등록
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			conn = DriverManager.getConnection(
						"jdbc:mysql://192.168.111.200:3306/thisisjava",
						"java",
						"mysql"
					);
			
			String sql = "DELETE FROM boards WHERE bwriter=?";
			
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,"winter");
			
			int rows = pstmt.executeUpdate();
			System.out.println("삭제된 행 수 : "+rows);
			System.out.println("연결 성공");
			pstmt.close();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(conn != null) {
				try {
					conn.close();
					System.out.println("연결 끊기");
				}catch(SQLException e) {}
			}
		}
	}
}
