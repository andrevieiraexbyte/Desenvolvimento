
public class Funcionario {

	private String nome;
	String departamento;
	private double salario;
	 Data dataDeEntrada;
	String rg;

	public Funcionario(String nome, double salario, Data dataDeEntrada) {
		this.nome = nome;
		this.salario = salario;
		this.dataDeEntrada = dataDeEntrada;

	}
	public Funcionario() {
		
	}

	public void recebAumento(double aumentoSalario) {
		this.salario += aumentoSalario;
	}

	public double calculaGanhoAnual() {
		return this.salario * 12;
	}

	public void mostra() {
		System.out.println(this.nome);
		System.out.println(this.departamento);
		System.out.println(this.salario);
		System.out.println(this.dataDeEntrada.getFormatada());
		System.out.println(this.rg);
	}

	public double getSalario() {
		return this.salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Data getDataDeEntrada() {
		return this.dataDeEntrada;
	}

	public void setDataDeEntrada(Data dataDeEntrada) {
		this.dataDeEntrada = dataDeEntrada;
	}
}
