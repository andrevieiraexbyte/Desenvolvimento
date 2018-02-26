package java8;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class TestaCursos {

	public static void main(String[] args) {

		List<Curso> cursos = new ArrayList<>();

		cursos.add(new Curso("Python", 45));
		cursos.add(new Curso("JavaScript", 150));
		cursos.add(new Curso("Java 8", 113));
		cursos.add(new Curso("C", 55));

		cursos.sort(Comparator.comparing(c -> c.getAlunos()));// com lambda
		cursos.sort(Comparator.comparing(Curso::getAlunos));// com metodo reference

		cursos.stream().filter(c -> c.getAlunos() > 50).forEach(c -> System.out.println(c.getNome()));// retornando
																										// lista com
																										// condição
																										// usando lambda
		cursos.stream().filter(c -> c.getAlunos() > 50).forEach(c -> System.out.println(c.getNome()));

		Stream<String> nomes = cursos.stream().map(Curso::getNome);// utilzando map
		cursos.stream().filter(c -> c.getAlunos() > 50).map(Curso::getAlunos).forEach(System.out::println);// utilizando
																											// stream
																											// com
																											// filter
		LocalDate agora = LocalDate.now();

		System.out.println(agora);

	}

}
