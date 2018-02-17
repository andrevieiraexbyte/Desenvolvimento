package bytebank;

public class Gerente extends Funcionario implements Autenticavel {

	private Autenticacao autenticador;

	public Gerente() {

		this.autenticador = new Autenticacao();

	}

	@Override
	public double getBonificacao() {
		return super.getSalario();
	}

	@Override
	public boolean autentica(int senha) {
		return autenticador.autentica(senha);
	}

	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
	}

}
