package br.com.casadocodigo.loja.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
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

		// (65) gerencia senha e usuario para o banco de dados
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		// (66) informando o usuario do banco de dados.
		dataSource.setUsername("root");
		// (67) informando senha
		dataSource.setPassword("");
		// (68) infromando url de conecxão
		dataSource.setUrl("jdbc:mysql://localhost:3306/casadocodigo");
		// (69) informando a classe do driver mysql para a conecxão
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");

	}
}
