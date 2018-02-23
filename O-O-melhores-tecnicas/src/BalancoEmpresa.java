import java.util.HashMap;

public class BalancoEmpresa {

	private HashMap<String, Divida> dividas = new HashMap<String, Divida>();// criando um hasmap para guardar dividias.

	public void registraDivida(String credor, String cnpjCredor, double valor) {// m�todo que recebe dados do credor e
																				// valor

		Divida divida = new Divida();// instanciando uma divida

		divida.setValorTotalDivida(valor);// passando valores da divida
		divida.setNomeCredor(cnpjCredor);
		divida.setCnpj(cnpjCredor);

		dividas.put(cnpjCredor, divida);// iserndo no map a divida como valor e o cnpjCredor como key

	}

	public void pagaDivida(String cnpjCredor, double valor) {// m�todo atualiza valor pago de uma divida.

		Divida divida = dividas.get(cnpjCredor);

		if (divida != null) {// valida��o para passar valores diferentes de null
			divida.paga(valor);
		}

	}
}
