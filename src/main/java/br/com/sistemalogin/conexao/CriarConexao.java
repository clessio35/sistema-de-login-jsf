package br.com.sistemalogin.conexao;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;

public class CriarConexao {
	
	public static Connection getConexao() throws SQLException {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Conectado");
			return (Connection) DriverManager.getConnection("jdbc:mysql://localhost/sistemalogin", "root", "1234567");
		} catch (SQLException e) {
			throw new SQLException(e);
		} catch(ClassNotFoundException e1) {
			throw new SQLException(e1);
		}
	}
}
