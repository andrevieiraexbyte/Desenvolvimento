package br.com.casadocodigo.loja.models;

import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//(49) adicione  natation para utilizar JPA
//(50) adicione no pom.xml a dependencia no mavem para utilizar JPA-Hibernete vá para ProdutoDAO
// veja a arquitetura que estamos utilizando, spring mvc, jpa-hibernete, mysql
@Entity // estou declarando que esta classe e um entidade e pode ser usada para gravar
		// seus dados em um banco de dados

public class Produto {

	// (78)deixando o id gerenciado pelo banco de dados crie int id. vá para
	// ServletSpringMVC
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	// (43) crie os atributos que estão no formulario
	private String titulo;
	private String descricao;
	private int paginas;

	// (93) notation cria uma tabela extra preco relacionada ao produto, vá para
	// Preco
	@ElementCollection
	// (86) crie uma lista para os preços, importe List
	private List<Preco> precos;
	// (87) crie a classe Preco

	// (44) gere os getters e setters dos atributos. vá para ProdutosController
	// (46) gere o toString rode o servidor, vá para produtos controller

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

	// (92) gere os getters and setters de id e lista precos.
	public int getId() {
		return id;
	}

	public List<Preco> getPrecos() {
		return precos;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setPrecos(List<Preco> precos) {
		this.precos = precos;
	}

}
