package jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class ResultDemo {

	public static void main(String[] args) {
		Connection com = null;
		String sql = "Select * from product";

		try {
			com = JdbcUtil.getConnection();
			ResultSet rs = com.createStatement().executeQuery(sql);
			ResultSetMetaData meta = rs.getMetaData();
			for (int c = 1; c <= meta.getColumnCount(); c++) {
				System.out.print(meta.getColumnName(c) + "\t");

			}
			System.out.println();
			while (rs.next()) {
				System.out.printf("%-5d\t%20s\t%10s\n",rs.getInt(1),rs.getString("name") ,rs.getString(3));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (com != null)
					com.close();
			} catch (SQLException e2) {
				e2.printStackTrace();

			}
		}

	}

}
