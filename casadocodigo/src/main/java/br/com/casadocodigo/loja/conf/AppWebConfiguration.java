package br.com.casadocodigo.loja.conf;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import br.com.casadocodigo.loja.controllers.HomeController;

//(9) adicionando notation WnableWebMvc
@EnableWebMvc
// (10)adicionando notation ComponenteScan que classes e também pode receber
// array de string e o caminho do pacotes
@ComponentScan(basePackageClasses = { HomeController.class })
public class AppWebConfiguration {

}
