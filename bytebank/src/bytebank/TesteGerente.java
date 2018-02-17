package bytebank;

public class TesteGerente {

	public static void main(String[] args) {
		
		Gerente g1 = new Gerente();
		
		g1.setNome("André");
		g1.setCpf("222.111.333-60");
		g1.setSalario(5000);
		g1.setSenha(10);
		
		System.out.println(g1.getNome());
		
		boolean autenticou = g1.autentica(10);
		
		System.out.println("está logado: "+autenticou);
	}

}
