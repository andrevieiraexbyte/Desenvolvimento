
public class TestaFuncionario {

	public static void main(String[] args) {

		Funcionario f1 = new Funcionario();
		Funcionario f2 = new Funcionario();
		Data d1 = new Data(15,01,2000);

		f1.nome = "teste";
		f1.departamento = "Desenvolvimento";
		f1.salario = 100;
		f1.dataDeEntrada = new Data(16, 01, 2018);
		f1.rg = "5854585";
		f1.mostra();

		f2.nome = "Abel Vieira";
		f2.departamento = "TI";
		f2.salario = 200;
		f2.dataDeEntrada = new Data(9, 05, 2011);
		f2.rg = "51554472";
		f2.mostra();

		f2 = f1;

		if (f1 == f2) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}

}
