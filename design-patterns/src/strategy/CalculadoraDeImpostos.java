package strategy;

public class CalculadoraDeImpostos {

	public void realizaCalculo(Orcamento orcamento, Imposto imposto) {// recebe um orçamento e imposto

		double valor = imposto.calcula(orcamento);// atraves da interface calcula qualque imposto passado

		System.out.println(valor);
	}
}
