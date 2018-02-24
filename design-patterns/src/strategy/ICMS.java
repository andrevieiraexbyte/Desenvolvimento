package strategy;

public class ICMS implements Imposto {// implementando a interface Imposto

	@Override
	public double calcula(Orcamento orcamento) {// regra de negócio do método calcula para imposto específico

		return orcamento.getValor() * 0.1;
	}

}
