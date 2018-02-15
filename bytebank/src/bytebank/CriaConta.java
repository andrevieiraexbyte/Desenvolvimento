package bytebank;

public class CriaConta {

	public static void main(String[] args) {

		Conta primeiraConta = new Conta();
		Conta segundaConta = new Conta();
		Cliente cliente = new Cliente();

		primeiraConta.deposita(200);
		segundaConta.deposita(1000);

		

		System.out.println(primeiraConta.pegaSaldo());// acessando o saldo encapsulado

		boolean conseguilRetirar = primeiraConta.saca(100);

		System.out.println(primeiraConta.pegaSaldo());
		System.out.println(conseguilRetirar);

		boolean conseguilTranferir = segundaConta.transfere(500, primeiraConta);

		System.out.println(segundaConta.pegaSaldo());
		System.out.println(primeiraConta.pegaSaldo());
		System.out.println(conseguilTranferir);

		//utilizando composição de objetos	
		cliente.nome = "André Vieira";
		cliente.cpf = "222.222.222-22";
		cliente.profissao = "Programador";
		
		primeiraConta.titular = cliente;
		
		System.out.println(primeiraConta.titular.nome);
	}

}
