package bytebank;

public class TesteConta {

	public static void main(String[] args) {

		ContaCorrente cc = new ContaCorrente(1465, 451);
		ContaPoupanca cp = new ContaPoupanca(1466, 451);

		cc.deposita(1000);
		cp.deposita(1500);

		System.out.println("Saldo da CC: " + cc.getSaldo());
		System.out.println("Saldo da CP: " + cp.getSaldo());

		cc.transfere(500, cp);

		System.out.println("Valor da Tranferencia de CC para CP: " + cc.getSaldo());

		System.out.println("Saldo atual CC :" + cc.getSaldo());
		System.out.println("Saldo atual CP :" + cp.getSaldo());

		System.out.println("Executando Saque: " + cc.saca(200));
		System.out.println("Saldo atual CC :" + cc.getSaldo());

	}

}
