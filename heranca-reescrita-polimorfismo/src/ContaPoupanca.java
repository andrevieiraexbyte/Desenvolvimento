
public class ContaPoupanca extends Conta {// herdando atributos e m�todos da classe Conta
	
	public void atualiza(double taxa) {//sobrescrevento m�todo atualiza da classe Conta
		this.saldo += this.saldo * taxa * 3;
	}
	public void deposita(double valor) {
		this.saldo += valor - 0.10;
	}
}
