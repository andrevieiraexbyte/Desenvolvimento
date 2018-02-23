import java.util.HashMap;

public class BalancoEmpresa {

	private HashMap<Cnpj, Divida> dividas = new HashMap<Cnpj, Divida>();// criando um hasmap para guardar dividias.

	public void registraDivida(String credor, Cnpj cnpjCredor, double valor) {// método que recebe dados do credor e
																				// valor
		Divida divida = new Divida();// instanciando uma divida
		divida.setValorTotalDivida(valor);// passando valores da divida
		divida.setNomeCredor(credor);
		divida.setCnpjCredor(cnpjCredor);
		dividas.put(cnpjCredor, divida);// iserndo no map a divida como valor e o cnpjCredor como key

	}

	public void pagaDivida(Cnpj cnpjCredor, double valor, String nomePagador, String cnpjPagador) {// método atualiza
																									// valor pago de
																									// uma divida.
		Divida divida = dividas.get(cnpjCredor);
		if (divida != null) {// validação para passar valores diferentes de null
			Pagamento pagamento = new Pagamento();
			pagamento.setCnpjPagador(cnpjPagador);
			pagamento.setPagador(nomePagador);
			pagamento.setValor(valor);
			divida.registra(pagamento);
		}

	}
}
