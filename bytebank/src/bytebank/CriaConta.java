package bytebank;

public class CriaConta {

	public static void main(String[] args) {

		Conta primeiraConta = new Conta();
		Conta segundaConta = new Conta();
		Cliente cliente = new Cliente();

		primeiraConta.deposita(500);
		segundaConta.deposita(1000);

		System.out.println(primeiraConta.getSaldo()+" Primeira Conta");// acessando o saldo encapsulado
		System.out.println(segundaConta.getSaldo()+" Segunda Conta");

		// boolean conseguilRetirar = primeiraConta.saca(100);

		// System.out.println(primeiraConta.getSaldo());
		// System.out.println(conseguilRetirar);

		// boolean conseguilTranferir = segundaConta.transfere(500, primeiraConta);

		// System.out.println(segundaConta.getSaldo());
		// System.out.println(primeiraConta.getSaldo());
		// System.out.println(conseguilTranferir);

		// utilizando composição de objetos
		 cliente.setNome("André Vieira");
		 cliente.setCpf("222.222.222-22");
		 cliente.setProfissao("Programador");
		 
		 cliente.setProfissao("Analista de Sistemas");
		 
		

		// System.out.println(primeiraConta.titular.nome);

		primeiraConta.setAgencia(431);
		System.out.println(primeiraConta.getAgencia()+" Numero da Agencia");
		
		primeiraConta.setNumero(159450);
		System.out.println(primeiraConta.getNumero()+" Numero da Conta");
		
		primeiraConta.setTitular(cliente);
		System.out.println(primeiraConta.getTitular().getNome()+" Nome do Titular");
		System.out.println(primeiraConta.getTitular().getCpf()+" Numero do CPF");
		System.out.println(primeiraConta.getTitular().getProfissao()+ " Profissão");
		
		
	}

}
