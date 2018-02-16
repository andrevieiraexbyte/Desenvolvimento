
public class TestaConta {

	public static void main(String[] args) {
		
		Conta c = new Conta();
		Conta cc = new ContaCorrente();
		Conta cp = new ContaPoupanca();
		
		
		c.deposita(100);
		cc.deposita(200);
		cp.deposita(300);
		
		c.atualiza(0.1);
		cc.atualiza(0.1);
		cp.atualiza(0.1);
		
		System.out.println(c.getSaldo());
		System.out.println(cc.getSaldo());
		System.out.println(cp.getSaldo());
		
		
		AtualizadorDeContas adc = new AtualizadorDeContas(0.5);
		adc.roda(c);
		adc.roda(cc);
		adc.roda(cp);

			System.out.println("saldo total:"+adc.getSaldoTotal());
	}

}
