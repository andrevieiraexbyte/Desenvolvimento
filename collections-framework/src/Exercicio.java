import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

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

		Set<String> chaves = nomesParaIdade.keySet();
		for (String nome : chaves) {
			System.out.println(nome);
		}
		Collection<Integer> valores = nomesParaIdade.values();
		for (Integer idade : valores) {
			System.out.println(idade);

		}
		Set<Entry<String, Integer>> associacoes = nomesParaIdade.entrySet();
		for (Entry<String, Integer> associacao : associacoes) {
			System.out.println(associacao.getKey() + "-" + associacao.getValue());

		}

	}
}
