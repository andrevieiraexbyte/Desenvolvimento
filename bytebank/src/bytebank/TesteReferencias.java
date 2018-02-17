package bytebank;

public class TesteReferencias {

	public static void main(String[] args) {

		Gerente gt = new Gerente();
		gt.setNome("André Vieira");
		gt.setSalario(1000);

		EditorVideo ev = new EditorVideo();
		ev.setNome("Abel");
		ev.setSalario(1000);

		Designer ds = new Designer();
		ds.setNome("Marcelo");
		ds.setSalario(1200);

		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(gt);
		controle.registra(ev);
		controle.registra(ds);

		System.out.println(controle.getSoma());

	}

}
