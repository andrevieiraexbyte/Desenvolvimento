package bytebank;

public class Cliente implements Autenticavel {

	private String nome;
	private String cpf;
	private String profissao;
	private Autenticacao autenticador;

	public Cliente() {// criando composicao no constsrutor
		this.autenticador = new Autenticacao();
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return this.nome;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getCpf() {
		return this.cpf;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

	public String getProfissao() {
		return this.profissao;
	}

	@Override
	public boolean autentica(int senha) { // fazendo composicao
		return this.autenticador.autentica(senha);
	}

	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
	}
}
