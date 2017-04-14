package Aula22082016;

import java.util.Scanner;

public class ExercicioAula05 {
	static int n1 = 0, n2 = 0;

	public static void main(String[] args) {

		System.out.println("Escolha dez números e digite: ");

		calculaDados();
		mostraDados(n2);

	}

	private static void mostraDados(int n2) {
		System.out.println("o maior número é : " + n2);
	}

	private static void calculaDados() {
		Scanner e = new Scanner(System.in);
		n1 = e.nextInt();
		for (int contador1 = 0; contador1 < 10; contador1++) {
			if (contador1 == 0) {
				n2 = n1;
			}
			if (n1 >= n2)
				n2 = n1;
		}

	}
}
