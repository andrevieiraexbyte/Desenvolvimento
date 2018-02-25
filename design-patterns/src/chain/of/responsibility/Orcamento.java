package chain.of.responsibility;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Orcamento {// está classe cria um orçamento atraves do construtor

	private double valor;
	private List<Item> itens;

	public Orcamento(double valor) {
		this.valor = valor;
		itens = new ArrayList<Item>();
	}

	public double getValor() {

		return valor;
	}

	public void adicionaItem(Item item) {
		itens.add(item);
	}

	public List<Item> getItens() {
		return Collections.unmodifiableList(itens);
	}

}
