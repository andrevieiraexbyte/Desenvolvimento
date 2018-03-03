package br.com.alura.gerenciador.web;

import java.io.IOException;
import java.util.Collection;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.Empresa;
import br.com.alura.gerenciador.dao.EmpresaDAO;

// criando servlet /busca

public class BuscaEmpresa implements Tarefa {

	public BuscaEmpresa() {
		System.out.println("Intanciando uma Servelet do tipo Buscaempresa" + this);
	}

	@Override
	public String executa(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String filtro = req.getParameter("filtro");// enviando uma resposta e uma requisição
		Collection<Empresa> empresas = new EmpresaDAO().buscaPorSimilaridade(filtro);
		req.setAttribute("empresas", empresas);
		return "/WEB-INF/paginas/buscaEmpresa.jsp";

	}

}
