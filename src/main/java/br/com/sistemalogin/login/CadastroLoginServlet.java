package br.com.sistemalogin.login;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.jdbc.Connection;

import br.com.sistemalogin.conexao.CriarConexao;

@WebServlet("/CadastroLogin")
public class CadastroLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public CadastroLoginServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String usuario = request.getParameter("txtUsuario");
		String senha = request.getParameter("txtSenha");

		Connection con;
		try {
			con = CriarConexao.getConexao();
			Login login = new Login();
			login.setUsuario(usuario);
			login.setSenha(senha);

			LoginDAO dao = new LoginDAO(con);
			dao.adicionar(login);
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
