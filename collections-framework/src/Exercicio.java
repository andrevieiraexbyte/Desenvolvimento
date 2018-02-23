import java.util.LinkedHashMap;
import java.util.Map;

public class Exercicio {

	public static void main(String[] args) {// utilizando map

		Map<Integer, String> pessoas = new LinkedHashMap<>();// garante que o map retorna a uma lista por ordem de
																// inserção

		pessoas.put(30, "André");
		pessoas.put(32, "Wanderson");
		pessoas.put(25, "Rubeni");
		pessoas.put(7, "Abel");

		pessoas.keySet().forEach(idade -> {// percorrendo o map utilizando keySet
			System.out.println(pessoas.get(idade));
		});
	}
}
