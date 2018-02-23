import java.util.ArrayList;
import java.util.Collections;

public class TestaColecoes {

	public static void main(String[] args) {

		ArrayList<String> nomes = new ArrayList<String>(); // so aceita string <String>

		nomes.add("André Vieira");// adicionando no array
		nomes.add("Pedro");

		// System.out.println(nomes.get(1));// acessando a posição no array

		System.out.println(nomes.contains("André Vieira"));// passando elemento pra saber se contém na lista

		Collections.sort(nomes);// ordenando por nomes

		for (int i = 0; i < nomes.size(); i++) {// imprimindo todos dentro do arraylist

			System.out.println(nomes.get(i));

		}
		for (String nome : nomes) {// passando por todos elemtnos usando o foreach
			System.out.println(nome);
		}

	}

}
