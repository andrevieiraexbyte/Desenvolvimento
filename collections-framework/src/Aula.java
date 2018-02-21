
public class Aula implements Comparable<Aula> {// implementando comparable

	String titulo;
	int tempo;

	public Aula(String titulo, int tempo) {
		super();
		this.titulo = titulo;
		this.tempo = tempo;
	}

	public String getTitulo() {
		return titulo;
	}

	public int getTempo() {
		return tempo;
	}

	@Override
	public String toString() {// utilizando método toString

		return "Aula: titulo=" + this.titulo + ", tempo=" + this.tempo + ":minutos";
	}

	@Override
	public int compareTo(Aula outraAula) {// utilizando compareTo
		return this.titulo.compareTo(outraAula.titulo);

	}
}
