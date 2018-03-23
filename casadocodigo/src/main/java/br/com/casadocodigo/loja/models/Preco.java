package br.com.casadocodigo.loja.models;

import java.math.BigDecimal;

public class Preco {

	// (88) crie o bigDecimal valor importe BigDecimal
	private BigDecimal valor;
	// (89) crie TipoPreco tipo enum.
	private TipoPreco tipo;

	// (91) gere os getters and setters, vá para Produto
	public BigDecimal getValor() {
		return valor;
	}

	public TipoPreco getTipo() {
		return tipo;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public void setTipo(TipoPreco tipo) {
		this.tipo = tipo;
	}

}
