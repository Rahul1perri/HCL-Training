package org.util;
import java.sql.*;

public class DBUtil {

	public static Connection getConnection(String driver,String url,String uname,String pwd) {
		Connection con=null;
		try {
		Class.forName(driver);
		con=DriverManager.getConnection(url,uname,pwd);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return con;
	}
}
