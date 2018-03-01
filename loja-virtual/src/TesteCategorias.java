import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import modelo.Categoria;
import modelo.Produto;

public class TesteCategorias {

	public static void main(String[] args) throws SQLException {

		try (Connection con = new ConnectionPool().getConnection()) {

			List<Categoria> categorias = new CategoriasDao(con).listaComProdutos();

			for (Categoria categoria : categorias) {
				System.out.println(categoria.getNome());

				for (Produto produto : categoria.getProdutos()) {
					System.out.println(categoria.getNome() + " - " + produto.getNome());
				}

			}

		}
	}
}
