package ch20.mysql.sec05;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionExample {

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
			System.out.println("연결 성공");
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}catch(SQLException e) {
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
