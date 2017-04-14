package Aula12092016;

import java.util.Scanner;

public class Retangulo3 {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);

		System.out.println("Digite em qual coluna irá começar: ");
		int c2 = a.nextInt();
		System.out.println("Digite quantas linhas o retângulo terá: ");
		int f = a.nextInt();
		System.out.println("Digite quantas colunas o retângulo terá: ");
		int d = a.nextInt();

		for (int l = 0; l < f; l++) {
			System.out.println();
			for (int e = 0; e < c2; e++) {
				System.out.print(" ");
			}
			for (int c = 0; c < d; c++) {
				System.out.print("*");
			}
		}
	}
}