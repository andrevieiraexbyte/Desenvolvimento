
public class ContaPoupanca extends Conta {// herdando atributos e métodos da classe Conta
	
	public void atualiza(double taxa) {//sobrescrevento método atualiza da classe Conta
		this.saldo += this.saldo * taxa * 3;
	}
	public void deposita(double valor) {
		this.saldo += valor - 0.10;
	}
}
