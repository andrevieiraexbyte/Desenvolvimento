import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class TestandoIterator {

	public static void main(String[] args) {

		List<String> letras = new LinkedList<String>();

		letras.add("A");
		letras.add("B");
		letras.add("C");

		Iterator<String> iterando = letras.iterator();

		while (iterando.hasNext()) {
			System.out.println(iterando.next());

		}
	}

}
