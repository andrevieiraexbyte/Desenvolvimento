import java.util.Comparator;

public class OrdenaPorIdade implements Comparator<Funcionario> {

	@Override
	public int compare(Funcionario f1, Funcionario f2) {

		return f1.getIdade() - f2.getIdade();// usando Comparator para que retornar por ordem de idade
	}

}
