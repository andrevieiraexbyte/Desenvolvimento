
public class Divida {

	private double valorTotalDivida;
	private double valorJaPago;
	private String nomeCredor;
	private String cnpj;

	public double getValorTotalDivida() {
		return valorTotalDivida;
	}

	public void setValorTotalDivida(double valorTotalDivida) {
		this.valorTotalDivida = valorTotalDivida;
	}

	public String getNomeCredor() {
		return nomeCredor;
	}

	public void setNomeCredor(String nomeCredor) {
		this.nomeCredor = nomeCredor;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public double getValorJaPago() {
		return valorJaPago;
	}

	public void paga(double valor) {
		this.valorJaPago += valor;
	}
}
