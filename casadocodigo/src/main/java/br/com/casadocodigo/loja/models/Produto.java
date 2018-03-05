package br.com.casadocodigo.loja.models;

public class Produto {

	// (43) crie os atributos que estão no formulario
	private String titulo;
	private String descricao;
	private int paginas;

	// (44) gere os getters e setters dos atributos. vá para ProdutosController
	// (46) gere o toString
	public String getTitulo() {
		return titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public int getPaginas() {
		return paginas;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}

	// sobrescrevendo o metodo toString que herda de object, se não fazemos isso só
	// aparece como resultdado a referencia do objeto em memoria

	@Override
	public String toString() {
		return "Produto [titulo=" + titulo + ", descricao=" + descricao + ", paginas=" + paginas + "]";
	}

}
