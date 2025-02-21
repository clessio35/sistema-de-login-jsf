package br.com.sistemalogin.login;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class LoginDAO {

	private Connection con;

	public LoginDAO(Connection con) {
		this.con = con;
	}

	public void adicionar(Login login) throws SQLException {
		try {
			String sql = "insert into login(usuario, senha)values(?,?)";
			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1, login.getUsuario());
			st.setString(2, login.getSenha());
			st.execute();
			st.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			con.close();
		}
	}

}
