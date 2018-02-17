package bytebank;

public class Cliente implements Autenticavel {

	private String nome;
	private String cpf;
	private String profissao;
	private int senha;

	public Cliente(String nome, String cpf, String profissao) {// incializando construtores com valores padrões
		this.nome = nome;
		this.cpf = cpf;
		this.profissao = profissao;
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
	public boolean autentica(int senha) {
		if (this.senha == senha) {
			return true;
		}
		return false;

	}

	@Override
	public void setSenha(int senha) {
		this.senha = senha;
	}
}
