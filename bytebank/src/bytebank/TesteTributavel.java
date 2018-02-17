package bytebank;

public class TesteTributavel {

	public static void main(String[] args) {

		ContaCorrente cc = new ContaCorrente(222, 561);
		cc.deposita(500);

		SeguroDeVida seguro = new SeguroDeVida();

		CalculadorDeImposto calc = new CalculadorDeImposto();

		calc.registro(cc);
		calc.registro(seguro);

		System.out.println(calc.getTotalImposto());

	}
}
