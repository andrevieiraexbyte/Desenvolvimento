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
	// (14) altere metodo de void para String e adicione um return "home.jsp"
	// (15) criar dentro de WEB-INF/ uma pasta wiews e dentro dela um arquivo
	// home.jsp
	// (16) deixamos de usar index. html para utilizar arquivos .jsp!
	// (17) vá para appWebConfiguration

	public String index() {
		// mostrando na tela
		System.out.println("Entrando na home da casa do código");
		return "home";
	}// (4) precisamos criar class ServletSpringMVC
}
