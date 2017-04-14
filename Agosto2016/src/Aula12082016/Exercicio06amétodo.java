package Aula12082016;

import java.util.Scanner;

public class Exercicio06amétodo {
	static int n1 = 0, n2 = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		digiteEntrada();
		mostraDados();

	}

	public static void digiteEntrada() {
		Scanner e = new Scanner(System.in);
		System.out.println("Digite n1: ");
		n1 = e.nextInt();
		System.out.println("Digite n2: ");
		n2 = e.nextInt();

	}

	private static void mostraDados() {
		if (n1 > n2) {
			System.out.println("n1 = " + n1 + " é maior que n2=" + n2);
		} else if (n2 > n1) {
			System.out.println("n2 = " + n2 + " é maior que n1=" + n1);
		} else {
			System.out.println("n1 e n2 tem o mesmo valor = " + n1);
		}

	}
}                 
