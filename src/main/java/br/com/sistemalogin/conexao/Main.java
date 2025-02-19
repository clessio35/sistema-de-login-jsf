package br.com.sistemalogin.conexao;

import java.sql.SQLException;

import com.mysql.jdbc.Connection;

public class Main {
	
	public static void main(String[] args) throws SQLException {
		Connection con = CriarConexao.getConexao();
		
	}
}
