package Aula12092016;

import java.util.Scanner;

public class Retangulo3 {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);

		System.out.println("Digite em qual coluna ir� come�ar: ");
		int c2 = a.nextInt();
		System.out.println("Digite quantas linhas o ret�ngulo ter�: ");
		int f = a.nextInt();
		System.out.println("Digite quantas colunas o ret�ngulo ter�: ");
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