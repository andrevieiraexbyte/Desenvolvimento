package br.com.alura.gerenciador.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/logout")
public class Logout extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		Cookie cookie = new Cookies(req.getCookies()).buscaUsuarioLogado();// buscando usuário logado
		PrintWriter writer = resp.getWriter();

		if (cookie == null) {
			writer.println("<html><body>Usuario nao estava logado!</body></html>");
			return;
		}
		cookie.setMaxAge(0);// setando tempo maximo para cookie de usuario logado
		resp.addCookie(cookie);// adicionando o cookie no response.
		writer.println("<html><body>Deslogado com sucesso!</body></html>");

	}

}
