package Aula24102016;

import java.util.Scanner;

public class Principal {

	static int vA[] = new int[5];
	static int vB[] = new int[5];
	static boolean teste = true;

	public static void main(String[] args) {

		do {
			int numero = Integer.parseInt(digita("Digita um número: "));
			vetor(vB, vA[vA.length-1]);
			vetor(vA, numero);
			mostra();
		} while (teste);

	}

	private static void mostra() {
		for (int i = 0; i < 5; i++) {
			System.out.print(vA[i] + " > ");
		}
		System.out.println();

		for (int i = 0; i < 5; i++) {
			System.out.print(vB[i] + " > ");
		}
		System.out.println("");
	}

	/*
	private static void vetor() {
		for (int i = 4; i > 0; i--) {
			vB[i] = vB[i - 1];
		}
		vB[0] = vA[4];
		
		for (int i = 4; i > 0; i--) {
			vA[i] = vA[i - 1];
		}
		vA[0] = Integer.parseInt(digita("Digita um número: "));
	}
	*/
	
	private static void vetor(int[] vet, int n) {
		for (int i = 4; i > 0; i--) {
			vet[i] = vet[i - 1];
		}
		vet[0] = n;
	}

	private static String digita(String mens) {
		Scanner e = new Scanner(System.in);
		System.out.println(mens);
		return e.nextLine();
	}
}
