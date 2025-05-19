package BANK;

import java.sql.Connection;
import java.sql.DriverManager;

public class loginDAO {

	private static final String JDBC_URL =
			"jdbc:mysql://localhost:3306/mydb";
	private static final String JDBC_USER = "root";
	private static final String JDBC_PASSWORD = "root";

	static Connection getConnection() {
		Connection conn = null;
		try {
			// Load the MySQL JDBC driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			// Create database connection
			conn = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
		} catch (Exception e) {
			e.printStackTrace();

		}
		return conn;
		// all the remaining functions are going to use this conn
	}
}
