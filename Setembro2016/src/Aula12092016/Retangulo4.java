package Aula12092016;

import java.util.Scanner;

public class Retangulo4 {

	static Scanner e = new Scanner(System.in);

	public static void main(String[] args) {

		/*
		 * System.out.println("Digite em qual coluna irá começar: "); int c2 =
		 * e.nextInt();
		 */
		/*
		 * System.out.println("Digite quantas linhas o retângulo terá: "); int f
		 * = e.nextInt();
		 */
		/*
		 * System.out.println("Digite quantas colunas o retângulo terá: "); int
		 * d = e.nextInt(); System.out.println("/n");
		 */

		for (int l = 0; l < 10; l++) {
			System.out.print("*");
		}
		System.out.println();
		for (int l2 = 0; l2 < 10; l2++) {
			if (l2 == 0 || l2 == 9)
				System.out.print("*");
			else
				System.out.print(" ");
		}
		System.out.println();
		for (int l3 = 0; l3 < 10; l3++) {
			if (l3 == 1 || l3 == 8)
				System.out.print(" ");
			else
				System.out.print("*");
		}
		System.out.println();
		for (int l4 = 0; l4 < 10; l4++) {
			if (l4 == 0 || l4 == 2 || l4 == 7 || l4 == 9)
				System.out.print("*");
			else
				System.out.print(" ");
		}
		System.out.println();
		for (int l5 = 0; l5 < 10; l5++) {
			if (l5 == 1 || l5 == 3 || l5 == 6 || l5 == 8)
				System.out.print(" ");
			else
				System.out.print("*");
		}

		System.out.println();
		for (int l6 = 0; l6 < 10; l6++) {
			if (l6 == 0 || l6 == 2 || l6 == 7 || l6 == 9)
				System.out.print("*");
			else
				System.out.print(" ");
		}
		System.out.println();
		for (int l7 = 0; l7 < 10; l7++) {
			if (l7 == 1 || l7 == 8)
				System.out.print(" ");
			else
				System.out.print("*");
		}
		System.out.println();
		for (int l8 = 0; l8 < 10; l8++) {
			if (l8 == 0 || l8 == 9)
				System.out.print("*");
			else
				System.out.print(" ");
		}
		System.out.println();
		for (int l9 = 0; l9 < 10; l9++) {
			System.out.print("*");
		}

	}
}