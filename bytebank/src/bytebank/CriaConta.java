package bytebank;

public class CriaConta {

	public static void main(String[] args) {
		
		Conta primeiraConta = new Conta();
		Conta segundaConta = new Conta();
		
		primeiraConta.saldo = 200;
		segundaConta.saldo = 1000;
		
		primeiraConta.deposita(50);
		

		System.out.println(primeiraConta.saldo);
		
		boolean conseguilRetirar = primeiraConta.saca(500);
		
		System.out.println(primeiraConta.saldo);
		System.out.println(conseguilRetirar);
		
		boolean conseguilTranferir = segundaConta.transfere(500, primeiraConta);
		
		System.out.println(segundaConta.saldo);
		System.out.println(primeiraConta.saldo);
		System.out.println(conseguilTranferir);
		
		
		
	}

}
