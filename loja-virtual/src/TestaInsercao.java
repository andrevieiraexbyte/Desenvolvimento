import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestaInsercao {

	// fazendo um teste no commit

	public static void main(String[] args) throws SQLException {
		try (Connection connection = new Database().getConnection()) {// abrindo uma conexao.
			connection.setAutoCommit(false); // desativando autocommit das transaões
			// realizadas

			// criando um statement
			Statement statement = connection.createStatement();
			// executando um instrução sql.
			String sql = "insert into Produto (nome, descricao) values (?,?)";
			try (PreparedStatement stmt = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {

				adiciona("tv lcd 32", "32 Polegadas", stmt);
				adiciona("Blueray", "Full HDMI", stmt);
				connection.commit();// fazendo commit caso esteja tudo ok
			} catch (Exception e) {
				e.printStackTrace();
				connection.rollback();// fazendo rollback caso haja erros
				System.out.println("rollback efetuado");
			}
			connection.close();
		}
	}

	// criando método adiciona nome e descrição
	private static void adiciona(String nome, String descricao, PreparedStatement stmt) throws SQLException {
		stmt.setString(1, nome);
		stmt.setString(2, descricao);
		// lançando uma exception caso o conteudo de nome seja invalido.
		if (nome.equals("Blueray")) {
			throw new IllegalArgumentException("problema ocorrido");

		}

		boolean resultado = stmt.execute();
		System.out.println(resultado);

		ResultSet resultSet = stmt.getGeneratedKeys();

		while (resultSet.next()) {
			int id = resultSet.getInt("id");
			System.out.println(id + " gerado");
		}
	}

}
