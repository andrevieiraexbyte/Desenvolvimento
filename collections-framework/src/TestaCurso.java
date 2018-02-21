public class TestaCurso {

	public static void main(String[] args) {

		Curso javaColecoes = new Curso("Java", "André Vieira");

		javaColecoes.adiciona(new Aula("NodeJs", 15));
		javaColecoes.adiciona(new Aula("JavaScript", 20));
		javaColecoes.adiciona(new Aula("Hibernete", 25));

		System.out.println(javaColecoes.getAulas());
	}

}
