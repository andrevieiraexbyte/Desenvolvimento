
public class TestaFuncionario {

	public static void main(String[] args) {

		Funcionario f1 = new Funcionario();
		Funcionario f2 = new Funcionario();

		f1.nome = "teste";
		f1.departamento = "Desenvolvimento";
		f1.salario = 100;
		f1.dataDeEntrada = "16/01/2018";
		f1.rg = "5854585";
		f1.mostra();
		
		
		
		f2.nome = "Abel Vieira";
		f2.departamento = "TI";
		f2.salario = 200;
		f2.dataDeEntrada = "09/05/2018";
		f2.rg = "51554472";
		f2.mostra();
		
		f2=f1;
		
		if(f1 == f2) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
	}

}
