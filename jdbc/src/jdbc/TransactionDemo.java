package jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class TransactionDemo {

	public static void main(String[] args) {
		Connection com = null;
		String sql1 = "Insert into product values(113, 'White Board', 500)";
		String sql2 = "Update product set price=30 where code =123";
		String sql3 = "Delete from product where code=121";
		try {
			com = JdbcUtil.getConnection();
			com.setAutoCommit(true);

			Statement stmt = com.createStatement();
			stmt.addBatch(sql1);

			stmt.addBatch(sql2);
			stmt.addBatch(sql3);

			stmt.executeBatch();
			com.commit();
			System.out.println("Transaction Complete...");
		} catch (SQLException e) {
			System.out.println("TRansaction Failed...");
			try {
				com.rollback();

			} catch (SQLException e1) {
				e.printStackTrace();
			} finally {
				try {
					if (com != null)
						com.close();
				} catch (SQLException e2) {
					e.printStackTrace();

				}
			}

		}
	}

}
