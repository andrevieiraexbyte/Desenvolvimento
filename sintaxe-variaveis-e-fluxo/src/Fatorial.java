
public class Fatorial {

	public static void main(String[] args) {

		long fatorial = 1;

		for (long i = 1; i < 11; i++) {
			fatorial *= i;
			System.out.println("fatorial de " + i + "=" + fatorial);
		}

	}

}
