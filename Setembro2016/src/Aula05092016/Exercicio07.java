package Aula05092016;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		/*Aula07
		Faça um algoritmo que utilize o menu abaixo para
		ler 2 números e a operação que será realizada com eles.


		do{
			System.out.println("MENU");
			System.out.println("1- Digite n1");
			System.out.println("2- Digite n2");
			System.out.println("3- Escolha operação");
			System.out.println("4- Mostre o resultado");
			System.out.println("5- Encerrar");
			System.out.print("Escolha uma opção: ");

		}while (true);*/
		char st = 0;
		int n1 = 10, n2 = 5;
		boolean laco = true;
		int op;
		do {
			Scanner e = new Scanner(System.in);
			System.out.println("MENU");
			System.out.println("1- Digite n1");
			System.out.println("2- Digite n2");
			System.out.println("3- Escolha operação");
			System.out.println("4- Mostre o resultado");
			System.out.println("5- Encerrar");
			System.out.print("Escolha uma opção: ");
			op = e.nextInt();
			
			if (op == 1) {
				System.out.println("Digite n1: ");
				n1 = e.nextInt();
			}
			if (op == 2) {
				System.out.println("Digite n2: ");
				n2 = e.nextInt();
			}
			if (op == 3){
				System.out.println("Escolha operação: + , - , * , /: ");
				st = e.next().charAt(0);
			}
			if (op == 4){
				if (st == '+')
					System.out.println("O resultado é "+soma(n1, n2));
				if (st == '-')
				System.out.println("O resultado é "+subtracao(n1, n2));
				if (st == '*')
				System.out.println("O resultado é "+multiplicacao(n1, n2));
				if (st == '/')
				System.out.println("O resultado é "+divisao(n1, n2));
			}
			if (op == 5)
				laco = false;
		} while (laco);

	}

	private static int soma(int n1, int n2) {
		int soma1 = (n1 + n2);
		return soma1;
	}

	private static int subtracao(int n1, int n2) {
		int subatrcao = (n1 - n2);
		return subatrcao;
	}

	private static int multiplicacao(int n1, int n2) {
		int multiplicacao = (n1 * n2);
		return multiplicacao;
	}

	private static int divisao(int n1, int n2) {
		int divisao = (n1 / n2);
		return divisao;
	}

	}


