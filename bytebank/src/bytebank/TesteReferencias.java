package bytebank;

public class TesteReferencias {

	public static void main(String[] args) {

		Gerente gt = new Gerente();
		gt.setNome("André Vieira");
		gt.setSalario(1000);
		gt.setSenha(2222);

		Administrador adm = new Administrador();
		adm.setNome("romário");
		adm.setSenha(2222);

		Cliente c = new Cliente();
		c.setSenha(1);

		SistemaInterno si = new SistemaInterno();
		si.autentica(gt);
		si.autentica(adm);
		si.autentica(c);

		// EditorVideo ev = new EditorVideo();
		// ev.setNome("Abel");
		// ev.setSalario(1000);

		// ControleBonificacao controle = new ControleBonificacao();
		// controle.registra(gt);
		// controle.registra(ev);
		// controle.registra(ds);

		System.out.println(gt.getNome());

	}

}
