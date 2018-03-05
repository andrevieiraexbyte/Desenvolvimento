package br.com.casadocodigo.loja.models;

public class Produto {

	// (43) crie os atributos que estão no formulario
	private String titulo;
	private String descricao;
	private int paginas;

	// (44) gere os getters e setters dos atributos. vá para ProdutosController
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

}
