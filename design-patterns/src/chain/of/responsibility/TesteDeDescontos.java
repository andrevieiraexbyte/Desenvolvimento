package chain.of.responsibility;

public class TesteDeDescontos {

	public static void main(String[] args) {

		CalculadorDeDesconto descontos = new CalculadorDeDesconto();
		Orcamento orcamento = new Orcamento(200);

		orcamento.adicionaItem(new Item("caneta", 550));
		orcamento.adicionaItem(new Item("lapis", 250));
		orcamento.adicionaItem(new Item("outros", 550));

		double descontoFinal = descontos.calcula(orcamento);

		System.out.println(descontoFinal);
	}
}
