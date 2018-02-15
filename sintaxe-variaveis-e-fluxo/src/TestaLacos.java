
public class TestaLacos {

	public static void main(String[] args) {

		for (int multiplicador = 1; multiplicador <= 10; multiplicador++) {
			for (int contador = 1; contador <= 10; contador++) {
				System.out.print(contador * multiplicador + " ");
				System.out.print(" ");
			}
			System.out.println();
		}
		for (int linha = 1; linha <= 10; linha++) {
			for (int coluna = 1; coluna <= linha; coluna++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
}
