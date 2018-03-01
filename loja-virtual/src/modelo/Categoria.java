package modelo;

import java.util.ArrayList;
import java.util.List;

public class Categoria {

	private final Integer id;
	private final String nome;
	private final List<Produto> produtos = new ArrayList<>();

	public Categoria(Integer id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}

	public String getNome() {
		// TODO Auto-generated method stub
		return nome;
	}

	public Integer getId() {
		// TODO Auto-generated method stub
		return id;
	}

	public void adiciona(Produto p) {
		produtos.add(p);

	}

	public List<Produto> getProdutos() {
		return produtos;
	}

}
