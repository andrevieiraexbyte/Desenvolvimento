package br.com.casadocodigo.loja.conf;

import java.util.Properties;

import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.annotation.EnableTransactionManagement;

//(80) habilitando o spring para gerencia transiction, e tambem em ProdutosDAO
@EnableTransactionManagement
public class JPAConfiguration {

	// (60)anotação para que o spring reconhca os métodos
	@Bean
	// (59) vamos criar um método que cria o entitymanger factory
	public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
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
		dataSource.setPassword("root");
		// (68) infromando url de conecxão
		dataSource.setUrl("jdbc:mysql://localhost:3306/casadocodigo");
		// (69) informando a classe do driver mysql para a conecxão
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");

		// (70) passando o dataSource configurado
		factoryBean.setDataSource(dataSource);

		// (71) criando properties para o hibernate conversar com o banco de dados
		Properties props = new Properties();
		// (72) adicionando o dialect do hibernate para converssar com o sql
		props.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQL5Dialect");
		// (73) sql será todo gerenciado pelo jpa. vamos ver esse gerenciamento. nos
		// permite ver todo sql que e gerado pelo proprio hibernate
		props.setProperty("hibernate.show_sql", "true");
		// (74)mapeamento do jpa pelo hibernate, atulizando o modelo automatico pelo
		// hibernate
		props.setProperty("hibernate.hbm2ddl.auto", "update");
		// (75)adicionando as propriedades ao factoryBean
		factoryBean.setJpaProperties(props);

		// (76)gerenciado nosso models
		factoryBean.setPackagesToScan("br.com.casadocodigo.loja.models");
		// (77) mudando o retorno do método
		return factoryBean;
	}
}
