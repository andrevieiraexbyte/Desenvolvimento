import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Curso {

	private String nome;
	private String instrutor;
	private List<Aula> aulas = new LinkedList<Aula>();
	private Set<Aluno> alunos = new HashSet<Aluno>();

	public Curso(String nome, String instrutor) {
		super();
		this.nome = nome;
		this.instrutor = instrutor;
	}

	public String getNome() {
		return nome;
	}

	public String getInstrutor() {
		return instrutor;
	}

	public List<Aula> getAulas() {// deixando a list imutavel
		return Collections.unmodifiableList(aulas);
	}

	@Override
	public String toString() {// sobrescrevendo a string mãe
		return " Curso : " + this.getNome() + " \n instrutor : " + this.getInstrutor() + " \n tempo do curso : "
				+ this.getTempoTotalCursos();
	}

	public void adiciona(Aula aula) {
		this.aulas.add(aula);
	}

	public int getTempoTotalCursos() {// método que retorna o tempo total do curso
		// int tempoTotalCurso = 0;
		// for (Aula aula : aulas) {
		// tempoTotalCurso += aula.getTempo();
		// }
		return this.aulas.stream().mapToInt(Aula::getTempo).sum();// utilizando stream java 8
	}

	public void matricula(Aluno aluno) {// adiciona matricula de aluno
		this.alunos.add(aluno);

	}

	public Set<Aluno> getAlunos() {// recuperando alunos de maneira não modificavel.
		return Collections.unmodifiableSet(alunos);
	}
}
