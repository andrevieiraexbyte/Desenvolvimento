
public class BalancoTrimestral {

	public static void main(String[] args) {
		
		int gastosJaneiro = 15000;
		int gastosFevereiro = 23000;
		int gastosMarco = 17000;
		
		int gastroTrimestral = gastosJaneiro + gastosFevereiro + gastosMarco;
		
		int mediaTrimestral = gastroTrimestral / 3;
		
		System.out.println("o total do gasto trimestral é: "+gastroTrimestral);
		System.out.println("o total do gasto trimestral é: "+mediaTrimestral);
	}

}
