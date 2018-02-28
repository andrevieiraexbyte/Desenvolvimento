package modelo;

public class Produto {

	Integer id;
	String nome;
	String descricao;

	public Produto(String nome, String descricao) {
		super();
		this.nome = nome;
		this.descricao = descricao;
	}

	public String getNome() {
		return nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setId(int id) {
		// TODO Auto-generated method stub

	}

	@Override
	public String toString() {
		return "Produto [Produto=" + nome + ", Descrição=" + descricao + "]";
	}

}
