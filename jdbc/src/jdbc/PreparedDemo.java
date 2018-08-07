package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
// for commandline arguments
public class PreparedDemo {

	public static void main(String[] args) {
		String sql = "insert into product values (?,?,?)";
		Connection com = null;

		try {
			com = JdbcUtil.getConnection();
			PreparedStatement stmt = com.prepareStatement(sql);
			stmt.setInt(1, Integer.parseInt(args[0]));
			stmt.setString(2, args[1]);
			stmt.setDouble(3, Double.parseDouble(args[2]));
			stmt.executeUpdate();
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
