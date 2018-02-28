import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class TestaRemocao {

	public static void main(String[] args) throws SQLException {
		Connection connection = new ConnectionPool().getConnection();// abrindo uma conexao.

		Statement stmt = connection.createStatement();// criando um statement
		stmt.execute("delete from Produto where id>3");// execucando sql delete id > que 3
		int count = stmt.getUpdateCount(); // fazendo update em numero de linhas atualizadas
		System.out.println(count + " linhas atualizadas");
		connection.close();
	}
}
