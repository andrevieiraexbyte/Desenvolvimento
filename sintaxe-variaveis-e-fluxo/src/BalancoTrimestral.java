
public class BalancoTrimestral {

	public static void main(String[] args) {

		int gastosJaneiro = 15000;
		int gastosFevereiro = 23000;
		int gastosMarco = 17000;

		int gastroTrimestral = gastosJaneiro + gastosFevereiro + gastosMarco;

		int mediaTrimestral = gastroTrimestral / 3;

		System.out.println("o total do gasto trimestral é: " + gastroTrimestral);
		System.out.println("o total do gasto trimestral é: " + mediaTrimestral);

		// criando um laço com while

		int num1 = 150;
		while (num1 < 300) {
			System.out.println(num1);
			num1++;
		}//fazendo somatoria de todos os numeros
		int soma = 0;
		int num2 = 1;
		while (num2 <= 1000) {
			soma = soma + num2;
			num2++;
			System.out.println(soma);
		}

		for (int i = 1; i <= 1000; i++) {
			soma = soma + i;
		}
		System.out.println("O valor da soma e = " + soma);
		// multiplos de 3
		int multiplo = 3;
		for ( int i = 1 ; i <= 10; i++) {
			System.out.println(multiplo*i);
			
		}// multiplos de 3
		 for (int i = 3; i < 100; i += 3 ){
	            System.out.println(i);
	        }
		// verificando numero impar
		 int x = 11;
		 if(x % 2 == 0  ) {
			 System.out.println("numero passado é par!");
		 }else {
			 System.out.println("numero passdo e ímpar!");
		 }
	}
}
