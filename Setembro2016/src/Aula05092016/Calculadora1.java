package Aula05092016;
import java.util.Scanner;

public class Calculadora1 {
	static int n1, n2;
	static char operacao;
	static double resultado;

	static Scanner e = new Scanner(System.in);

	public static void main(String[] args) {
		int opcao;
		do {
			System.out.println("\n\nMENU");
			System.out.println("1- Digite n1");
			System.out.println("2- Digite n2");
			System.out.println("3- Escolha operação");
			System.out.println("4- Mostre o resultado");
			System.out.println("5- Finaliza");
			System.out.print("Escolha uma opção: ");

			opcao = e.nextInt();

			if (opcao == 1) {
				recebeN1();
			}//..............
			if (opcao == 2) {
				recebeN2();
			}//..............
			if (opcao == 3) {
				recebeOperacao();
			}//..............
			if (opcao == 4) {
				calculaResultado();
				mostraResultado();
			}//..............

		} while (opcao != 5);

	}// final do main

	private static void calculaResultado() {
		if (operacao == '+')
			resultado = n1 + n2;		
		if (operacao == '-')
			resultado = n1 - n2;		
		if (operacao == '*')
			resultado = n1 * n2;		
		if (operacao == '/')
			resultado = n1 / n2;		
	}//-------------------------------------

	private static void recebeN1() {
		System.out.print("Digite n1: ");
		n1 = e.nextInt();
	}//-------------------------------------

	private static void recebeN2() {
		System.out.print("Digite n2: ");
		n2 = e.nextInt();
	}//-------------------------------------

	private static void recebeOperacao() {
		System.out.print("Escolha uma operação (+ - * /): ");
		operacao = e.next().charAt(0);
	}//-------------------------------------

	private static void mostraResultado() {
		System.out.println("....Resultado: " + resultado);
	}//-------------------------------------

}// final da classe
