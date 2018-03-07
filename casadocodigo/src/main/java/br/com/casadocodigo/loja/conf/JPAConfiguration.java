package br.com.casadocodigo.loja.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

public class JPAConfiguration {

	// (60)anotação para que o spring reconhca os métodos
	@Bean
	// (59) vamos criar um método que cria o entitymanger factory
	public void entityManagerFactory() {
		// (61)chamar o objeto do spring
		LocalContainerEntityManagerFactoryBean factoryBean = new LocalContainerEntityManagerFactoryBean();

		JpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();// (63) crie um vendorAdapter
		// (62) configurar factoryBean com vendoAdapter
		factoryBean.setJpaVendorAdapter(vendorAdapter);// (64) passe como parametro o vendorAdapter

	}
}
