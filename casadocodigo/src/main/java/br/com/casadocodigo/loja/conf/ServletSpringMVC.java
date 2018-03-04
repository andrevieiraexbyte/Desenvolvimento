package br.com.casadocodigo.loja.conf;//(5) criando pacote correto para classes de configuração

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

//(6)ServletSpring herda AACDSI
public class ServletSpringMVC extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		// (7) retorna classe de configuração do projeto web class AppWebConfiguration
		return new Class[] { AppWebConfiguration.class };
	}

	@Override
	protected String[] getServletMappings() {
		// (8) mapeando "/"
		return new String[] { "/" };
	}

}
