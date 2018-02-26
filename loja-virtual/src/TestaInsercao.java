import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestaInsercao {

	public static void main(String[] args) throws SQLException {
		Connection connection = Database.getConnection();// abrindo uma conexao.

		// criando um statement
		Statement statement = connection.createStatement();
		// executando um instrução sql.
		boolean resultado = statement.execute(
				"insert into Produto (nome, descricao) values ('Notebook','Notebook Gamming i7')",
				Statement.RETURN_GENERATED_KEYS);

		ResultSet resultSet = statement.getGeneratedKeys();

		while (resultSet.next()) {
			int id = resultSet.getInt("id");
			System.out.println(id + " gerado");
		}

		statement.close();
		connection.close();

	}

}
