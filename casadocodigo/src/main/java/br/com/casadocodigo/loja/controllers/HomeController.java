package br.com.casadocodigo.loja.controllers;// configurando o Controller em um projeto correto

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

// (1) adicionando notation Controller
@Controller
public class HomeController {
	// (2) adicionando natation RequestMapping
	// mapeando a url acessada
	@RequestMapping("/")

	// (3)método index que exibira algo na tela
	public void index() {

		// System.out.println("Entrando na home da casa do código");

	}// (4) precisamos criar class ServletSpringMVC
}
