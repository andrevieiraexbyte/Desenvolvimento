
public abstract class Conta {

	protected double saldo;

	public double getSaldo() {
		return this.saldo;
	}

	public void deposita(double valor) {
		this.saldo += valor;
	}

	public void saca(double valor) {
		if(saldo >= valor) {
			this.saldo -= valor;
		}else {
			throw new RuntimeException("Saldo insuficiente");
		}
	}

	public abstract void atualiza(double taxa);
		
	
}
