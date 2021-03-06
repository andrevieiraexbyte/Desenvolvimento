package br.com.casadocodigo.loja.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import br.com.casadocodigo.loja.controllers.HomeController;
import br.com.casadocodigo.loja.daos.ProdutoDAO;

//(9) adicionando notation WnableWebMvc
@EnableWebMvc
// (10)adicionando notation ComponenteScan que classes e também pode receber
// array de string e o caminho do pacotes
// (11) rode servidor, erro 404, vamos remover o index.html
// (12) rode servidor. erro 500 Could not resolve view with name '' in servlet
// with name 'dispatcher'
// (13)vá para HomeController
@ComponentScan(basePackageClasses = { HomeController.class, ProdutoDAO.class }) // (57) adicionar ProdutoDao.calss pq
																				// está em packges diferentes
// (58)ao rodar o servidor teremos o erro entitymanageer factory, precisamos
// criar o entitymanager factory
// pelo spring vamos fazer isso, crie uma classe JPAcConfiguration
public class AppWebConfiguration {

	// toda classe gerenciada pelo spring e um Bean
	@Bean // (22)Spring não roda todos metodos por default esta notation diz que esté
			// método é gerenciada pelo spring
	// (18) crie método que retorne uma classe do spring IRVR
	// este método o diretório das views
	public InternalResourceViewResolver internalResourceViewResolver() {
		// (19) instancie IRVT em um objeto
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		// (20) setando um prefixo de onde o arquivo jsp está.
		resolver.setPrefix("/WEB-INF/views/"); // setPrefix definimos o local
		// (21) setando um sufixo para que não precisemos colocar toda vez o .jsp nas
		// chmadas
		resolver.setSuffix(".jsp");// setSuffix definimos a extensão
		return resolver;

		// (23) configuramos tudo para que o spring rode nossas págians .jps. rode o
		// servidor!
		// (24) vá para home.jps
	}
}
