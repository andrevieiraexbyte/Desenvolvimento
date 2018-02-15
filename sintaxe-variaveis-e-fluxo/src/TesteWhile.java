
public class TesteWhile {

	public static void main(String[] args) {

		int contador = 0;
		while (contador <= 10) {
			System.out.println(contador);
			contador++;
		}

		int total = 0;
		int contador2 = 0;
		
		while (contador2 <= 10) {
			total += contador2;
			System.out.println(total);
			contador2++;
		}
	}
}
