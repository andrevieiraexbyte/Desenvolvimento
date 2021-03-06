import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

public class Curso {

	private String nome;
	private String instrutor;
	private List<Aula> aulas = new LinkedList<Aula>();
	private Set<Aluno> alunos = new HashSet<Aluno>();
	private Map<Integer, Aluno> matriculaParaAluno = new HashMap<>();

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
	public String toString() {// sobrescrevendo a string m�e
		return " Curso : " + this.getNome() + " \n instrutor : " + this.getInstrutor() + " \n tempo do curso : "
				+ this.getTempoTotalCursos();
	}

	public void adiciona(Aula aula) {
		this.aulas.add(aula);
	}

	public int getTempoTotalCursos() {// m�todo que retorna o tempo total do curso
		// int tempoTotalCurso = 0;
		// for (Aula aula : aulas) {
		// tempoTotalCurso += aula.getTempo();
		// }
		return this.aulas.stream().mapToInt(Aula::getTempo).sum();// utilizando stream java 8
	}

	public void matricula(Aluno aluno) {// adiciona matricula de aluno
		this.alunos.add(aluno);
		this.matriculaParaAluno.put(aluno.getNumeroMatricula(), aluno);// inserindo ao aluno utilizando map

	}

	public Set<Aluno> getAlunos() {// recuperando alunos de maneira n�o modificavel.
		return Collections.unmodifiableSet(alunos);
	}

	public boolean estaMatriculado(Aluno aluno) {
		return this.alunos.contains(aluno);
	}

	public Aluno buscaMatricula(int numero) {// buscando matricula passada no argumento
		if (!matriculaParaAluno.containsKey(numero))
			throw new NoSuchElementException("matricula n�o econtrada!");
		return matriculaParaAluno.get(numero);

	}
}
