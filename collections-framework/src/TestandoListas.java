import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas {

	public static void main(String[] args) {

		ArrayList<String> cursos = new ArrayList<String>();

		cursos.add("Java");
		cursos.add("Python");
		cursos.add("NodeJS");

		for (int i = 0; i < cursos.size(); i++) {

			Collections.sort(cursos);

			System.out.println(cursos.get(i));

		}

	}

}
