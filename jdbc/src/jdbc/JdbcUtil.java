package jdbc;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class JdbcUtil {
	public static Connection getConnection()throws SQLException
	{
		
		Properties p=new Properties();
		try
		{
			p.load(new FileReader("src/database.info"));
		}
		catch(IOException e)
		{
			e.printStackTrace();

		}
//		String url = "jdbc:oracle:thin:@localhost:1521:xe";
//		String driver = "oracle.jdbc.OracleDriver";
//		Connection com = null;

		try {
			Class.forName(p.getProperty("driver"));
		}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		} 
			
			String url;
			Connection com = DriverManager.getConnection(p.getProperty("url"),p.getProperty("user"),p.getProperty("password"));
			return com;
			
		
	}

	private static String getProperties(String string) {
		// TODO Auto-generated method stub
		return null;
	}

}
