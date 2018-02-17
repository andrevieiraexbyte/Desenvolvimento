package bytebank;

public class TesteFuncionario {

	public static void main(String[] args) {
		
		Funcionario f1 = new Funcionario();
		 
		 f1.setNome("André");
		 f1.setCpf("222.555.777-33");
		 f1.setSalario(4500);
		 
		 System.out.println(f1.getNome());
		 System.out.println(f1.getBonificacao());
	}

}
