package mysql_sistema.cap_15_transacciones.accesodb;

import java.sql.Connection;
import java.sql.DriverManager;

public class AccesoDB {

	private static Connection connection = null;

	public static Connection getConnection() throws Exception {

		String url = "jdbc:mysql://localhost/eurekabank";
		String user = "root";
		String pwd = "yategane";

		if (connection == null) {

			Class.forName("com.mysql.jdbc.Driver").newInstance();
			connection = DriverManager.getConnection(url, user, pwd);

		}

		return connection;

	} // getConection
	
} // AccesoDB