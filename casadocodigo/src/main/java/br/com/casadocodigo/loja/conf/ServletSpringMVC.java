package br.com.casadocodigo.loja.conf;//(5) criando pacote correto para classes de configuração

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

//(6)ServletSpring exntends AACDSI
// configurando o servlet do spring para atender as requisições do servidor
public class ServletSpringMVC extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		// (7) retorna classe de configuração do projeto web class AppWebConfiguration,
		// crie está classe

		return new Class[] { AppWebConfiguration.class, JPAConfiguration.class };// (79) add class a servletConfig
	}

	@Override
	protected String[] getServletMappings() {
		// (8) mapeando "/"
		// o spring atuara em todas requisicões recebidas pelo tomcat apartidir da, "/"
		return new String[] { "/" };
	}

}
