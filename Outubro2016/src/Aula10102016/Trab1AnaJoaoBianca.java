//Maurício Ferraz de Lima e Raphael de Souza Pereira
package Aula10102016;

import java.util.Scanner;

public class Trab1AnaJoaoBianca {

	static Scanner en = new Scanner(System.in);

	static int vet1[] = new int[6];
	static int vet2[] = new int[6];
	static int vet3[] = new int[6];

	static boolean fim = true;
	static int cont1 = 0, cont2 = 0, cont3 = 0;

	public static void main(String[] args) {

		vetorZero();

		do {
			mostraDados();

			int numero = digita("Digite um número: ");
			if (numero >= 0) {

				resetaVetor();

				distribuiNumero(numero);

				if (numero == 0) {
					System.out.println("Encerrando...");
					fim = false;
				}
			}
		} while (fim);
	}

	private static void distribuiNumero(int numero) {
		if ((numero % 2 == 0) || numero >= 10 && numero <= 100) {
			vet1[cont1] = numero;
			cont1++;
		}
		if ((numero % 2 == 1) || numero >= 50 && numero <= 150) {
			vet2[cont2] = numero;
			cont2++;
		}
		if (numero > 0 && numero < 10 || numero >= 40 && numero <= 120) {
			vet3[cont3] = numero;
			cont3++;
		}

	}

	private static void resetaVetor() {
		if (cont1 == 6) {
			for (int i = 0; i < vet3.length; i++) {
				vet1[i] = 0;
			}
			cont1 = 0;
		}

		if (cont2 == 6) {
			for (int i = 0; i < vet3.length; i++) {
				vet2[i] = 0;
			}
			cont2 = 0;
		}

		if (cont3 == 6) {
			for (int i = 0; i < vet3.length; i++) {
				vet3[i] = 0;
			}
			cont3 = 0;
		}
	}

	private static void mostraDados() {
		for (int i = 0; i < vet3.length; i++) {
			System.out.print("vet1 : Posição " + (i + 1) + " Valor: " + vet1[i] + " ");
			System.out.print("vet2 : Posição " + (i + 1) + " Valor: " + vet2[i] + " ");
			System.out.println("vet3 : Posição " + (i + 1) + " Valor: " + vet3[i]);
		}
	}

	private static void vetorZero() {
		for (int i = 0; i < vet3.length; i++) {
			vet1[i] = 0;
			vet2[i] = 0;
			vet3[i] = 0;
		}
	}

	private static int digita(String mens) {
		System.out.println(mens);
		return en.nextInt();
	}
}
