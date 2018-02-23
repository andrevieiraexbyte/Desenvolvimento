import java.util.TreeSet;

public class TesteRecibo {

	public static void main(String[] args) {

		Recibo recibo1 = new Recibo("André Vieira", 200);
		Recibo recibo2 = new Recibo("Abel", 300);
		Recibo recibo3 = new Recibo("Pedro", 400);

		TreeSet<Recibo> recibos = new TreeSet<Recibo>();

		recibos.add(recibo1);
		recibos.add(recibo2);
		recibos.add(recibo3);

		System.out.println(recibos);
	}

}
