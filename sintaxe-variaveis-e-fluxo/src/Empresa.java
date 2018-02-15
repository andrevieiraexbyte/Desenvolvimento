
public class Empresa {

	private String nome;
	private String cnpj;
	private Funcionario[] empregados;
	private int mudaPosicaoDoArray = 0;
	
	

	public void adicionar(Funcionario f) {
		this.empregados[this.mudaPosicaoDoArray] = f;
		this.mudaPosicaoDoArray++;
	}

	void mostraEmpregados() {
		for (int i = 0; i < this.mudaPosicaoDoArray; i++) {
			System.out.println("Funcionário na posição " + i);
			this.empregados[i].mostra();

		}
	}

	boolean contem(Funcionario f) {
		for (int i = 0; i < this.mudaPosicaoDoArray; i++) {
			if (f == this.empregados[i]) {
				return true;
			}
		}
		return false;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCnpj() {
		return this.cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public Funcionario getFuncionario(int posicao) {
		return this.empregados[posicao];
	}
}
