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
import javax.servlet.http.HttpServletResponse;

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
		HttpServletResponse resp = (HttpServletResponse) response;
		String uri = req.getRequestURI();// guarda em uri o resqueste acessado

		Cookie cookie = new Cookies(req.getCookies()).buscaUsuarioLogado();// buscando usuário logado
		// validando cookie para usuario logado
		String usuario = getUsuario(req);
		if (cookie != null) {
			usuario = cookie.getValue();
			cookie.setMaxAge(10 * 60);// 10 minutos
			resp.addCookie(cookie);

		}

		System.out.println("Usuario " + usuario + " acessando a URI: " + uri);// mostra qual usuario logada acessa uri
		chain.doFilter(request, response);// continua executando resques e response depois de fazer a captura das uri's
											// acessadas

	}

	private String getUsuario(HttpServletRequest req) {

		Cookie cookie = new Cookies(req.getCookies()).buscaUsuarioLogado();
		if (cookie == null)
			return "<deslogado>"; // retorna usuario <deslogado>

		return cookie.getValue();

	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub

	}

}
