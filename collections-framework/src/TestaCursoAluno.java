public class TestaCursoAluno {

	public static void main(String[] args) {

		Curso javaColecoes = new Curso("Dominando as cole��es do Java", "Andr� Vieira");

		javaColecoes.adiciona(new Aula("Trabalhando com arraylist", 21));
		javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com cole��es", 24));

		Aluno a1 = new Aluno("Andr� Vieira", 24672); // passando matricula
		Aluno a2 = new Aluno("Abel Vieira", 125463);
		Aluno a3 = new Aluno("Reinoldo Sommer", 445752);

		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);

		System.out.println("Quem � o aluno com matricula 24672?");
		Aluno aluno = javaColecoes.buscaMatricula(24672);

		System.out.println(aluno);

		// javaColecoes.getAlunos().forEach(aluno -> {// express�es lambdas
		// System.out.println(aluno);
		// });
	}

}
