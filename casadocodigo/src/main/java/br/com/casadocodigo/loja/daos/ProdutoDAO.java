package br.com.casadocodigo.loja.daos;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.com.casadocodigo.loja.models.Produto;

public class ProdutoDAO {

	// (52)notation persistenceContext spring gerenciando entitymanager pra gente
	@PersistenceContext
	private EntityManager manager;// (51) crie o entitymanager que gerencia as entidades

	public void gravar(Produto produto) {// (48)crie um metodo que grava o Produto, faça import , vá para class Produto
		// (53) chamando o manager.persiste passando o produto
		manager.persist(produto);
	}

}
