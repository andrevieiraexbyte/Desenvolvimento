package br.com.casadocodigo.loja.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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
	public String grava(String titulo, String descricao, int paginas) {
		System.out.println(titulo);
		System.out.println(descricao);
		System.out.println(paginas);
		return "ok";
	}
}
