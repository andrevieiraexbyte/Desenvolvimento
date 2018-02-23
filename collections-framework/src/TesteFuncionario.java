import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TesteFuncionario {

	public static void main(String[] args) {

		Funcionario f1 = new Funcionario("André Vieira", 30);
		Funcionario f2 = new Funcionario("Rubeni", 25);
		Funcionario f3 = new Funcionario("Wandersson", 32);

		Set<Funcionario> funcionarios = new TreeSet<>(new OrdenaPorIdade()); // criando funcionarios em uma TreeSet

		funcionarios.add(f1);
		funcionarios.add(f2);
		funcionarios.add(f3);

		Iterator<Funcionario> iterador = funcionarios.iterator();

		while (iterador.hasNext()) {// utilizando iterator para iterar sobre uma TreeSet

			System.out.println(iterador.next().getNome());

		}

	}

}
