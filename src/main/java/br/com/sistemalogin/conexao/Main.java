package br.com.sistemalogin.conexao;

import java.sql.SQLException;

import com.mysql.jdbc.Connection;

import br.com.sistemalogin.login.Login;
import br.com.sistemalogin.login.LoginDAO;

public class Main {
	
	public static void main(String[] args) throws SQLException {
		Connection con = CriarConexao.getConexao();
		Login login = new Login();
		login.setUsuario("Ana Clara");
		login.setSenha("123");
		
		LoginDAO dao = new LoginDAO(con);
		dao.adicionar(login);
	}
}
