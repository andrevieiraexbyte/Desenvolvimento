import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.hsqldb.jdbc.JDBCPool;

public class ConnectionPool {

	private DataSource dataSource;// interface

	// criando um pool de conexões para se conectar apenza uma vez
	ConnectionPool() {// criando um pool de conexões
		JDBCPool pool = new JDBCPool();
		pool.setUrl("jdbc:hsqldb:hsql://localhost/loja-virtual");
		pool.setUser("SA");
		pool.setPassword("");
		this.dataSource = pool;

	}

	Connection getConnection() throws SQLException {
		Connection connection = dataSource.getConnection();// pegando a conexão do pool.
		return connection;
	}
}
