import java.util.ArrayList;
import java.util.Comparator;

public class TesteListaAulas {

	public static void main(String[] args) {

		Aula a1 = new Aula("java", 21);
		Aula a2 = new Aula("python", 19);
		Aula a3 = new Aula("nodejs", 15);

		ArrayList<Aula> aulas = new ArrayList<Aula>();

		aulas.add(a1);
		aulas.add(a2);
		aulas.add(a3);

		aulas.sort(Comparator.comparing(Aula::getTitulo));// utilizando comparator passando direto oque devemos retornar
															// em ordem

		System.out.println(aulas);

	}

}
