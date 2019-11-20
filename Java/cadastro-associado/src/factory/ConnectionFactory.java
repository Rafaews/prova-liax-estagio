package factory;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {

	private static final String USERNAME = "root";
	public  static final String PASSWORD = "root";
	private static final String DATABASE_URL = "jdbc:mysql://127.0.0.1:3306/provaliax?useTimezone=true&serverTimezone=UTC";

	public static Connection createConnection() throws Exception {
		//Class.forName("com.mysql.jdbc.Driver");
		try {
			Connection connection = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);
			return connection;
		} catch (Exception E) {
			System.out.println("Falha ao se conectar ao banco de dados! A seguinte exceção ocorreu -> " + E.getMessage());
			return null;
		}

	}

	public static void main(String[] args) throws Exception {
		Connection con = createConnection();
		if (con != null) {
			System.out.println("Conexão com banco de dados realizada com sucesso!");
			con.close();
		}
	}
}
