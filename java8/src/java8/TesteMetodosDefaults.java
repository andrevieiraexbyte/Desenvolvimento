package java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

public class TesteMetodosDefaults {

	public static void main(String[] args) {

		List<String> palavras = new ArrayList<>();

		palavras.add("Wanderson");
		palavras.add("André Vieira");
		palavras.add("Rubeni");

		Consumer<String> consumidor = new ConsumidorDeString();

		Collections.sort(palavras);// ordenando a lista de A a Z

		ComparandoPorTamanho ordenandoTamanhoString = new ComparandoPorTamanho();// ordenando por tamanho da string

		Collections.sort(palavras, ordenandoTamanhoString);

		System.out.println(palavras);

	}

}
