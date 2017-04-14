package Lang;

public class String {

	public static void main(java.lang.String[] args) {
		java.lang.String strOrigem = "Luiz                Inácio                Lula                      da           Silva";
		strOrigem = strOrigem.replaceAll(" ", "");
		System.out.println(strOrigem);

		java.lang.String A = "ALURA";
		System.out.println(A);
		System.out.println("Saida:");
		for (int i = 0; i < A.length(); i++) {
			System.out.println(A.charAt(i));
		}

		java.lang.String contra = "Socorram-me, subi no ônibus em Marrocos anotaram a data da maratona";
		System.out.println(contra);
		System.out.println(contra.length());
		for (int i = 66; i > 0; i--) {
			System.out.print(contra.charAt(i));
		}
		inverte("Socorram-me, subi no ônibus em Marrocos anotaram a data da maratona");
		invertePalavrasDaFrase("Socorram-me, subi no ônibus em Marrocos");
		inverteComStringBuilder("Socorram-me, subi no ônibus em Marrocos");

		int m = Integer.parseInt("762");
		System.out.println((m + m));

		java.lang.String numero = "762";
		System.out.println("Imprimindo a string: " + numero);

		int resultado = converteParaInt(numero);
		System.out.println("Imprimindo o int: " + resultado);

	}

	private static void invertePalavrasDaFrase(java.lang.String string) {
		// TODO Auto-generated method stub

	}

	public static void inverte(java.lang.String string) {
		for (int i = string.length() - 1; i >= 0; i--) {
			System.out.print(string.charAt(i));
		}
		System.out.println("");
	}

	public void invertePalavrasDaFrase(String texto) {
		String[] palavras = texto.split(" ");
		for (int i = palavras.length - 1; i >= 0; i--) {
			System.out.print(palavras[i] + " ");
		}
		System.out.println("");
	}

	private String[] split(java.lang.String string) {
		// TODO Auto-generated method stub
		return null;
	}

	public static void inverteComStringBuilder(java.lang.String string) {
		System.out.print("\t");
		StringBuilder invertido = new StringBuilder(string).reverse();
		System.out.println(invertido);
	}



		private static int converteParaInt(java.lang.String numero) {
			int resultado = 0;
			while (((CharSequence) numero).length() > 0) {
				char algarismo = ((CharSequence) numero).charAt(0);
				resultado = resultado * 10 + (algarismo - '0');
				numero = ((java.lang.String) numero).substring(1);
			}
			return resultado;
		}
}
