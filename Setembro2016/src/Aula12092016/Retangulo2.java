package Aula12092016;

import java.util.Scanner;

public class Retangulo2 {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);

		System.out.println("Digite em qual coluna irá começar: ");
		int c2 = a.nextInt();

		for (int l = 0; l < 10; l++) {
			System.out.println();
			for (int e = 0; e < c2; e++) {
				System.out.print(" ");
			}
			for (int c = 0; c < 10; c++) {
				System.out.print("*");
			}
		}
	}
}