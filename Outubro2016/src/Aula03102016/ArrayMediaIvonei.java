package Aula03102016;

import java.util.Random;
import java.util.Scanner;

public class ArrayMediaIvonei {

	static int vet[] = new int[15];

	public static void main(String[] args) {
		populaArray();
		mostraValoresAcima(media());
	}// ----------------------------

	private static void mostraValoresAcima(double media) {
		System.out.println("\n....Média Calculada: " + media);
		for (int i = 0; i < vet.length; i++) {
			if (vet[i] > media)
				System.out.println(i + "[" + vet[i] + "]");
		}
	}// --------------------------

	private static double media() {
		double soma = 0;
		for (int i = 0; i < vet.length; i++) {
			soma += vet[i];
		}
		return soma / vet.length;
	}// ----------------------------

	private static void populaArray() {
		Scanner e = new Scanner(System.in);
		Random r = new Random();

		for (int i = 0; i < vet.length; i++) {
			// System.out.print("Digite a posisão "+i+" do array: ");
			// vet[i] = e.nextInt();
			vet[i] = r.nextInt(100) - 50;
		}
	}// -------------------------

}// -------------------------------
