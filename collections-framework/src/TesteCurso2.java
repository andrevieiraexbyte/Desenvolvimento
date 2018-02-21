import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TesteCurso2 {

	public static void main(String[] args) {

		Curso javaColecoes = new Curso("Dominando as collections java", "André vieira");

		javaColecoes.adiciona(new Aula("trabalhando com arraylist", 21));
		javaColecoes.adiciona(new Aula("criando uma aula", 20));
		javaColecoes.adiciona(new Aula("modelando com colecoes", 24));

		List<Aula> aulasImutaveis = javaColecoes.getAulas();

		System.out.println(aulasImutaveis);

		List<Aula> aulas = new ArrayList<Aula>(aulasImutaveis);

		Collections.sort(aulas);

		System.out.println(aulas);

		System.out.println(javaColecoes.getTempoTotalCursos());

		System.out.println(javaColecoes);

	}

}
