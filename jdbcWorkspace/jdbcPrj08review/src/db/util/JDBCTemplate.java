package db.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCTemplate {

	
	public static Connection getConnection() throws Exception {
		
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String username = "C##KH_JDBC";
		String pwd = "1234";
		Connection conn = DriverManager.getConnection(url, username, pwd);
		conn.setAutoCommit(false);
		return conn;   //Connection 타입이라서 반드시 리턴해줘야 한다.
		
	}  
	
}
