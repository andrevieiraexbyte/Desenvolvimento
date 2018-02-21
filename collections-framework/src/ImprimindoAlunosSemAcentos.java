import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ImprimindoAlunosSemAcentos {

	public static void main(String[] args) {

		Set<String> alunos = new HashSet<String>();// adicionando utilizando elementos utilizando HashSet
		alunos.add("Andre");
		alunos.add("Abel");
		alunos.add("Marquim");
		alunos.add("Bisk8");
		alunos.add("Reinoldo");
		alunos.add("Reinoldo");

		List<String> alunosLista = new ArrayList<String>(alunos);// criando uma forma de utilizar Colletions sort em um
																	// objeto HashSet

		for (String aluno : alunos) {
			System.out.println(aluno);// imprimindo utilizando HashSet objetos ficam desordenados por padrão do objeto
		}

		Collections.sort(alunosLista); // organizando a lista que foi crianda com hashSet
		System.out.println(alunosLista);
		System.out.println(alunosLista.get(0));
	}

}
