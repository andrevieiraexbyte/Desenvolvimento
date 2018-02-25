package java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

public class TesteMetodosDefaults {

	public static void main(String[] args) {

		List<String> palavras = new ArrayList<>();

		palavras.add("Wanderson");
		palavras.add("Andr� Vieira");
		palavras.add("Rubeni");

		Consumer<String> consumidor = new ConsumidorDeString();

		Collections.sort(palavras);// ordenando a lista de A a Z

		ComparandoPorTamanho ordenandoTamanhoString = new ComparandoPorTamanho();// ordenando por tamanho da string

		Collections.sort(palavras, ordenandoTamanhoString);

		palavras.forEach(palavra -> System.out.println(palavras));// utilizando fun��es lambdas

		palavras.sort((s1, s2) -> {// utilizando lambda com classe anonima
			if (s1.length() < s2.length())
				return -1;
			if (s1.length() > s2.length())
				return 1;
			return 0;
		});

		palavras.sort((s1, s2) -> // utilzando lambda com api do java
		Integer.compare(s1.length(), s2.length()));

		palavras.sort((s1, s2) -> s1.length() - s2.length());// utilzando a mesma api diminuindo os c�digos atrves da
																// lambda

	}

}
