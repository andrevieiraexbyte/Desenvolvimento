package br.com.casadocodigo.loja.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.casadocodigo.loja.models.Produto;

//(34) notation que esta classe seja um controller
@Controller
public class ProdutosController {

	// (35) crie o requesmapping que mapeia a url a cer acessada
	@RequestMapping("/produtos/form")

	// (36) crie o metodo que retorna o formulario criado em produtos/form. rode o
	// servidor e teste.
	public String form() {
		return "produtos/form";
	}

	// (38) notation requestmapping

	@RequestMapping("/produtos")
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

		return "ok";
		// (39) crie um arquivo em views/produtos ok.jps que retorna um mensagem de
		// cadastrado com sucesso
	}
}
