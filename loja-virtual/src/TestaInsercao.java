import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestaInsercao {

	

	public static void main(String[] args) throws SQLException {
		Connection connection = Database.getConnection();// abrindo uma conexao.

		String nome = "Notebook";
		String descricao = "Notebook Gamming i7";
		// criando um statement
		Statement statement = connection.createStatement();
		// executando um instrução sql.
		String sql = "insert into Produto (nome, descricao) values (?,?)";
		PreparedStatement stmt = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

		stmt.setString(1, nome);
		stmt.setString(2, descricao);

		boolean resultado = stmt.execute();

		ResultSet resultSet = stmt.getGeneratedKeys();

		while (resultSet.next()) {
			int id = resultSet.getInt("id");
			System.out.println(id + " gerado");
		}

		stmt.close();
		connection.close();

	}

}
