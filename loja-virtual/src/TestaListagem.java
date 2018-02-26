import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestaListagem {

	public static void main(String[] args) throws SQLException {// adicinando sqlexception
		// configuranro o driver para jdb hsqldb
		Connection connection = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/loja-virtual", "SA", "");
		// criando um statement
		Statement statement = connection.createStatement();
		// execute retorna um boolean do comando sql passado
		boolean resultado = statement.execute("select * from Produto");
		// System.out.println(resultado);
		//
		// // ResultSet adiciona em uma list
		ResultSet resultSet = statement.getResultSet();
		// resultSet.next();
		// // recuperando pelo resultSet o campo nome da tabela no banco de dados.
		// int id = resultSet.getInt("id");// recuperando id no banco
		// System.out.println(id);
		// String nome = resultSet.getString("nome");// pelo ResultSet eu consigo
		// acessar minhas tabela e colunas no banco
		// // de dados
		// System.out.println(nome);
		// String descricao = resultSet.getString("descricao");
		// System.out.println(descricao);

		// while para cada uma das linhas pega o proximo
		while (resultSet.next()) {
			int id = resultSet.getInt("id");
			String nome = resultSet.getString("nome");
			String descricao = resultSet.getString("descricao");
			System.out.println(id);
			System.out.println(nome);
			System.out.println(descricao);
		}
		resultSet.close();// fechando oque foi aberto
		statement.close();
		// fechando conexao.
		connection.close();

	}
}
