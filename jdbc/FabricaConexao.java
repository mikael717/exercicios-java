package jdbc;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class FabricaConexao {

	public static Connection getConexao() {
		try {
			final String url = "jdbc:mysql://localhost/curso_java?verifyServerCertification=false&useSSL=true";
			final String usuario = "root";
			final String senha = "123456";

			return DriverManager.getConnection(url, usuario, senha);
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

	}
}

