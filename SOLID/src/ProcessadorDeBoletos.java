import java.util.List;

public class ProcessadorDeBoletos {

	public void processa(List<Boleto> boletos, NovaFatura novaFatura) {

		for (Boleto boleto : boletos) {
			Pagamento pagamento = new Pagamento(boleto.getValor(), MeioDePagamento.BOLETO);
			novaFatura.adicionaPagamento(pagamento);

		}

	}
}