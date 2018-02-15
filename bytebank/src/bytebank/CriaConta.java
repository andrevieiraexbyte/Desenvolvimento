package bytebank;

public class CriaConta {

	public static void main(String[] args) {

		Conta primeiraConta = new Conta(545, 197245);// utilizando construtor para passar valores 

		Cliente cliente = new Cliente("Andr� vieira","041.555.555-55","Programador");// inicializando construtores

		primeiraConta.deposita(500);

		System.out.println(primeiraConta.getSaldo() + " Primeira Conta");// acessando o saldo encapsulado

		// boolean conseguilRetirar = primeiraConta.saca(100);

		// System.out.println(primeiraConta.getSaldo());
		// System.out.println(conseguilRetirar);

		// boolean conseguilTranferir = segundaConta.transfere(500, primeiraConta);

		// System.out.println(segundaConta.getSaldo());
		// System.out.println(primeiraConta.getSaldo());
		// System.out.println(conseguilTranferir);

		// utilizando composi��o de objetos
		

		

		// System.out.println(primeiraConta.titular.nome);

		
		System.out.println(primeiraConta.getAgencia() + " Numero da Agencia");
		System.out.println(primeiraConta.getNumero() + " Numero da Conta");

		primeiraConta.setTitular(cliente);
		System.out.println(primeiraConta.getTitular().getNome() + " Nome do Titular");
		System.out.println(primeiraConta.getTitular().getCpf() + " Numero do CPF");
		System.out.println(primeiraConta.getTitular().getProfissao() + " Profiss�o");

	}

}
