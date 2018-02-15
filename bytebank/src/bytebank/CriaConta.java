package bytebank;

public class CriaConta {

	public static void main(String[] args) {
		
		Conta primeiraConta = new Conta();
		
		primeiraConta.saldo = 200;
		
		primeiraConta.deposita(50);
		

		System.out.println(primeiraConta.saldo);
		
		boolean conseguilRetirar = primeiraConta.saca(500);
		
		System.out.println(primeiraConta.saldo);
		System.out.println(conseguilRetirar);
		
	}

}
