
public class TestaFuncionario {

	public static void main(String[] args) {

		
		
		Empresa emp1 = new Empresa();
		
		
		Funcionario f1 = new Funcionario();
		f1.setNome("André Vieira");
		f1.setSalario(1000);
		
		
		emp1.adicionar(f1);
		
		Funcionario f2 = new Funcionario();
		f2.setNome("Abel Vieira");
		f2.setSalario(2000);
		
		emp1.adicionar(f2);
		
		emp1.getFuncionario(0).mostra();
		emp1.getFuncionario(1).mostra();
		emp1.mostraEmpregados();
	}

}
