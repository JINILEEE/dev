package main;

import java.sql.Connection;
import java.sql.DriverManager;

public class Test {

	public Connection getConnection() {

        Connection con = null;

        try {

            Class.forName("oracle.jdbc.driver.OracleDriver");

//            String url = "jdbc:oracle:thin:@SEMI_medium?TNS_ADMIN=D:"+File.separator+"java"+File.separator+"dev"+File.separator+"setup"+File.separator+"Wallet_SEMI"; 
            String url = "jdbc:oracle:thin:@(description= (retry_count=20)(retry_delay=3)(address=(protocol=tcps)(port=1522)(host=adb.ap-chuncheon-1.oraclecloud.com))(connect_data=(service_name=gd4d34268684703_semi_high.adb.oraclecloud.com))(security=(ssl_server_dn_match=yes)))";

            String user = "ADMIN";

            String password = "1234567890Aa";

            con = DriverManager.getConnection(url, user, password);



        } catch(Exception e){

            e.printStackTrace();

        }

        return con;
    }
	
}
