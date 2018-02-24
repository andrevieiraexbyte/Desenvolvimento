package strategy;

public class ISS implements Imposto {// implementando a interface Imposto

	@Override
	public double calcula(Orcamento orcamento) {// regra de neg�cio do m�todo calcula para imposto espec�fico

		return orcamento.getValor() * 0.06;
	}
}
