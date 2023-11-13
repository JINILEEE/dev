package main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Main {

	public static void main(String[] args) throws Exception {

		Connection conn = new Test().getConnection();

        String query = "select 1 from dual";
        PreparedStatement pstmt = conn.prepareStatement(query);
        ResultSet rs = pstmt.executeQuery();

        if(rs.next()) {
            int result = rs.getInt(1);
            System.out.println(result);
        }
	}

}
