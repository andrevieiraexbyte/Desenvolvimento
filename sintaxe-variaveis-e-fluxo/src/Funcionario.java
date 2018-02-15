
public class Funcionario {

	String nome;
	String departamento;
	double salario;
	Data dataDeEntrada;
	String rg;

	void recebAumento(double aumentoSalario) {
		this.salario += aumentoSalario;
	}

	double calculaGanhoAnual() {
		return this.salario * 12;
	}

	void mostra() {
		System.out.println(this.nome);
		System.out.println(this.departamento);
		System.out.println(this.salario);
		System.out.println(this.dataDeEntrada.getFormatada());
		System.out.println(this.rg);
	}
}
