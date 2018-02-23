import java.util.ArrayList;

public class Divida {

	private double total;
	private double valorPago;
	private String credor;
	private Cnpj cnpjCredor;
	private ArrayList<Pagamentos> pagamentos = new ArrayList<Pagamentos>();

	public double getValorTotalDivida() {
		return valorPago;
	}

	public void setValorTotalDivida(double valorTotalDivida) {
		this.valorPago = valorTotalDivida;
	}

	public String getNomeCredor() {
		return credor;
	}

	public void setNomeCredor(String nomeCredor) {
		this.credor = nomeCredor;
	}

	public double getValorJaPago() {
		return valorPago;
	}

	public void paga(double valor) {
		this.valorPago += valor;
	}

	public Cnpj getCnpjCredor() {
		return cnpjCredor;
	}

	public void setCnpjCredor(Cnpj cnpjCredor) {
		this.cnpjCredor = cnpjCredor;
	}

}
