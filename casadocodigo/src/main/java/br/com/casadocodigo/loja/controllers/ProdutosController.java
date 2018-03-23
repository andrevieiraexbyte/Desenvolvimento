package br.com.casadocodigo.loja.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.com.casadocodigo.loja.daos.ProdutoDAO;
import br.com.casadocodigo.loja.models.Produto;
import br.com.casadocodigo.loja.models.TipoPreco;

//(34) notation que esta classe seja um controller
@Controller
public class ProdutosController {

	// (47) crie um tipo produtoDao de ProdutoDAO vamos criar acesso a banco de
	// dados, crie uma Class ProdutoDao salve no
	// packge daos.
	@Autowired // (54)notation autowired faz com que o spring injete o produtoDao
	private ProdutoDAO produtoDao;

	// (35) crie o requesmapping que mapeia a url a cer acessada
	@RequestMapping("/produtos/form")

	// (36) crie o metodo que retorna o formulario criado em produtos/form. rode o
	// servidor e teste.
	public ModelAndView form() {
		// (98) modelAndView esté objeto manda pra tela
		ModelAndView modelAndView = new ModelAndView("produtos/form");// construtor recebe o view name
		// (99)podemos mandar objeto do model para o view
		modelAndView.addObject("tipos", TipoPreco.values());
		// (97) mande o TipoPreco para tela, todo enum tem um values do tipo array

		// (100) mude o tipo de retorno para modelAndView,vá para form.jsp
		return modelAndView;
	}

	// (38) notation requestmapping
	// @RequestMapping("/produtos")
	// (118) altere o requestmapping
	@RequestMapping(value = "/produtos", method = RequestMethod.POST)
	// o metodo grava recebe os dados do formulario imprime os paramentros recebidos
	// e return um ok
	// (37) crie o método grava
	// o srping faz o bding, pega os arquivos digitados no formulario jsp tag
	// name="", olha o nome do parametros passado no controller e validam
	public String grava(Produto produto) {
		// (41) veja o tanto de parametros, vamos refatorar criando uma class Produto
		// onde
		// nela contém todos os nossos atributos, esté método agora recebera um produto
		// do tipo Produto
		// (42) crie a classe Produto em um package models, esta classe representa um
		// modelo. veja que estamos utilizando arquitetura mvc
		// (45) agora so imprimimos produto
		System.out.println(produto);
		// (55) prdodutoDao chama o método grava passando o produto.
		// com isso estamos gravando nosso produto mandando para o banco
		produtoDao.gravar(produto);
		return "produtos/ok";
		// (39) crie um arquivo em views/produtos ok.jps que retorna um mensagem de
		// cadastrado com sucesso
	}

	// (117)mapeando metodo com method GET para diferenciar do request acima
	@RequestMapping(value = "/produtos", method = RequestMethod.GET)
	// (110) crie um metodo lista e cria uma lista de produtos
	public ModelAndView listar() {
		// (111)lista de produtosDao, crie o metodo listar em produtoDao
		List<Produto> produtos = produtoDao.listar();
		// (114) enviando lista para página com modelview instancie ModelAnview e o
		// retorne
		ModelAndView modelAndView = new ModelAndView("produtos/lista");// (115) adicionando a página a ser inserida
		// (116) criando atributo que recebera os dados do jsp
		modelAndView.addObject("produtos", produtos);

		return modelAndView;
	}
}
