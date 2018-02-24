package strategy;

public class TesteDeImpostos {// classe de teste do sistema

	public static void main(String[] args) {

		Imposto iss = new ISS();
		Imposto icms = new ICMS();
		Imposto iccc = new ICCC();

		Orcamento orcamento = new Orcamento(3050);

		CalculadoraDeImpostos calculador = new CalculadoraDeImpostos();

		calculador.realizaCalculo(orcamento, iss);
		calculador.realizaCalculo(orcamento, icms);
		calculador.realizaCalculo(orcamento, iccc);
	}

}
