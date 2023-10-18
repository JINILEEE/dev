package com.kh.db.template;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCTemplate {

	// getConnection
	public static Connection getConnection() throws Exception {

		File f = new File("info.txt");

		BufferedReader br = new BufferedReader(new FileReader(f));

		String a = br.readLine();
		String b = br.readLine();
		String c = br.readLine();

		String url = a;
		String username = b;
		String pwd = c;

		Connection conn = DriverManager.getConnection(url, username, pwd);

		conn.setAutoCommit(false);
		return conn;

	}

	// close(conn)
	public static void close(Connection conn) {
		try {
			if (conn != null && !conn.isClosed()) {
				conn.close();
			}
		} catch (Exception e) {

		}
	}
		
		//close(stmt)
		public static void close(Statement stmt) {
			try {
				if (stmt != null && !stmt.isClosed()) {
					stmt.close();
				}
			} catch (Exception e) {

			}
		}
		
		//close(rs)
		public static void close(ResultSet rs) {
			try {
				if (rs != null && !rs.isClosed()) {
					rs.close();
				}
			} catch (Exception e) {

			}
		}
		
		//commit
		public static void commit(Connection conn) {
			try {
				if(conn != null && !conn.isClosed()) {
					conn.commit();
				}
				
			}catch(Exception e) {
				
			}
		}
		
		//rollback
		public static void rollback(Connection conn) {
			try {
				if(conn != null && !conn.isClosed()) {
					conn.rollback();
				}
				
			}catch(Exception e) {
				
			}
		}
	
}
