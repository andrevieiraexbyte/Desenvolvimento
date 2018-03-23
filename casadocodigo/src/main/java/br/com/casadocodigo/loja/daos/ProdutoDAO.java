package br.com.casadocodigo.loja.daos;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.casadocodigo.loja.models.Produto;

// repository mapeia nosso dao
@Repository // (56) spring so injeta produtos que conhece que ele gerencia essa notation faz
// com que o produtoDao seja gerenciado pelo spring
// (81)habilitando spring para dizendo que e uma trasiction do spring
@Transactional
public class ProdutoDAO {

	// (52)notation persistenceContext spring gerenciando entitymanager pra gente
	@PersistenceContext
	private EntityManager manager;// (51) crie o entitymanager que gerencia as entidades

	public void gravar(Produto produto) {// (48)crie um metodo que grava o Produto, faça import , vá para class Produto
		// (53) chamando o manager.persiste passando o produto
		manager.persist(produto);
	}

	// (112) método listar
	public List<Produto> listar() {
		// (113) criando uma query e retornando uma lista de produtos
		return manager.createQuery("select p from Produto p", Produto.class).getResultList();
	}

}
