package br.com.alura.gerenciador.web;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

// filtrando as uri's que o usuario acessa

@WebFilter(urlPatterns = "/*") // filtrando todas as uri
public class FiltroDeAuditoria implements Filter {

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

	@Override // recebe o resquest
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {

		HttpServletRequest req = (HttpServletRequest) request;
		String uri = req.getRequestURI();// guarda em uri o resqueste acessado

		// validando cookie para usuario logado
		String usuario = getUsuario(req);

		System.out.println("Usuario " + usuario + " acessando a URI: " + uri);// mostra qual usuario logada acessa uri
		chain.doFilter(request, response);// continua executando resques e response depois de fazer a captura das uri's
											// acessadas

	}

	private String getUsuario(HttpServletRequest req) {

		String usuario = "<deslogado>";// mostra usuario deslogado acessando uri
		Cookie[] cookies = req.getCookies();
		if (cookies == null)// retorna usuario <deslogado>
			return usuario;
		for (Cookie cookie : cookies) {// retorna usuario logado
			if (cookie.getName().equals("usuario.logado")) {
				usuario = cookie.getValue();

			}
		}
		return usuario;

	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub

	}

}
