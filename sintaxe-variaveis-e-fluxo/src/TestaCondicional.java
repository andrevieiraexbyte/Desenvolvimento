
public class TestaCondicional {

	public static void main(String[] args) {
		System.out.println("testando condicionais");

		int idade = 20;
		boolean acompanhado = true;

		if (idade >= 18 && acompanhado) {// condicinal or || ou � && e boolean = true
			System.out.println("voc� tem mais de 18 anos");
			System.out.println("seja bem vindo");
		} else {

			System.out.println("infelizmente voc� n�o pode entrar");
		}
	}

}
