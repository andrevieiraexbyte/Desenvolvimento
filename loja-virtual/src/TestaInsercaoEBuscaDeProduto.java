
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import dao.ProdutosDAO;
import modelo.Produto;

public class TestaInsercaoEBuscaDeProduto {

	public static void main(String[] args) throws SQLException {

		Produto produto = new Produto("Mesa vermelha", "Mesa com 6 cadeiras");

		try (Connection con = new ConnectionPool().getConnection()) {
			ProdutosDAO dao = new ProdutosDAO(con);
			ProdutosDAO.salva(con, produto);

			List<Produto> produtos = dao.lista();

			for (Produto produto1 : produtos) {
				System.out.println("Existe o produto" + produto1);
			}

		}

	}

}
