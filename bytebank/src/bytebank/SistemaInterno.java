package bytebank;

public class SistemaInterno {

	private int senha = 2222;

	public void autentica(Autenticavel fa) {
		boolean autenticou = fa.autentica(senha);
		if (autenticou) {
			System.out.println("autenticado!");
		} else {
			System.out.println("nao autenticado.");
		}
	}
}
