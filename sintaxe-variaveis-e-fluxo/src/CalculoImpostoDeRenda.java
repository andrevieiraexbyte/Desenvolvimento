
public class CalculoImpostoDeRenda {

	public static void main(String[] args) {

		double salario = 4000.0;

		if (salario >= 1900.0 && salario <= 2800.0) {

			System.out.println("seu salário está na alíquora de 7.5%, pode deduzir R$ 142,00 ");
		} else if (salario >= 2800.01 && salario <= 3751.0) {

			System.out.println("seu salário está na alíquora de 15%, pode deduzir R$ 350,00 ");
		} else if (salario >= 3751.01 && salario <= 4664.00) {

			System.out.println("seu salário está na alíquora de 22.5%, pode deduzir R$ 636,00 ");
		} else {
			System.out.println("você não precisa deduzir valor algum pois ganha abaixo de R$ 1.900,00");
		}

	}
}
