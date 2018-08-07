package jdbc;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDemo {

	public static void main(String[] args) {

		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String driver = "oracle.jdbc.OracleDriver";
		Connection com = null;

		try {
			Class.forName(driver);
			com = DriverManager.getConnection(url, "training", "oracle");
			System.out.println("Connection Succesful");
			
			DatabaseMetaData meta = com.getMetaData();
			System.out.println("DB NAME"+meta.getDatabaseProductName());
			System.out.println("DB Version"+meta.getDatabaseProductVersion());
			System.out.println("Driver NAME"+meta.getDriverName());
			System.out.println("dRiver Version"+meta.getDriverVersion());
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();

		}finally {
			try {
				if(com!=null)
					com.close();
			}
			catch (SQLException e) {
				e.printStackTrace();
		}
			}
		}
}

	
