import java.util.Date;
import java.util.TreeSet;

public class Recibo<Recibo> implements Comparable<Recibo> {

	private String nome;
	private double valor;
	private Date data;
	private TreeSet<Recibo> recibos = new TreeSet<Recibo>();

	public Recibo(String nome, double valor) {
		super();
		this.nome = nome;
		this.valor = valor;
	}

	public String getNome() {
		return nome;
	}

	public double getValor() {
		return valor;
	}

	public Date getData() {
		return data;
	}

	@Override
	public String toString() {
		return "Recibo [nome=" + nome + ", valor=" + valor + ", recibos=" + recibos + "]";
	}

	@Override
	public int compareTo(Recibo arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

}
