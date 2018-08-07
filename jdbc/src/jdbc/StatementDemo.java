package jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class StatementDemo {

	public static void main(String[] args) {
		String sql = "insert into product values(123,'marker',25)";
		Connection com = null;

		try {
			com = JdbcUtil.getConnection();
			Statement stmt = com.createStatement();
			stmt.executeUpdate(sql);
			System.out.println("RECORD INSERTED");

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (com != null)
					com.close();
			} catch (SQLException e) {
				e.printStackTrace();

			}
		}
	}

}
