package br.com.sistemalogin.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.sistemalogin.exception.InvalidUserException;

@WebServlet("/Login")
public class LoginControllers extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		processRequest(request, response);
	}

	private void processRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ValidaDadosRecebidos(request);
		RequestDispatcher rd = request.getRequestDispatcher("logado.jsp");
		rd.forward(request, response);
	}

	private void ValidaDadosRecebidos(HttpServletRequest request) throws ServletException {
		String nomeUsuario = request.getParameter("txtUsuario");
		String senhaUsuario = request.getParameter("txtSenha");

		if (!nomeUsuario.trim().equals("clessio") || !senhaUsuario.trim().equals("123")) {
			throw new InvalidUserException("Login ou Senha inválidos");
		}
		HttpSession session = request.getSession();
		session.setAttribute("usuarioautenticado", nomeUsuario);

	}

}
