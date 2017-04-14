package Aula12082016;

import java.util.Scanner;
public class Exercicio06bmétodo {


		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int n1 = 0, n2 = 0;

			n1 = digiteEntrada("digita n1: ");
			n2 = digiteEntrada("digita n2: ");
			mostraDados(n1, n2);

		}
		
		public static int digiteEntrada(String mens) {
			Scanner e = new Scanner(System.in);
			System.out.println(mens);
			return e.nextInt();
		}
		//assinatura do metodo v
		private static void mostraDados(int n1, int n2) {
			if (n1 > n2) {
				System.out.println("n1 = " + n1 + " é maior que n2=" + n2);
			} else if (n2 > n1) {
				System.out.println("n2 = " + n2 + " é maior que n1=" + n1);
			} else {
				System.out.println("n1 e n2 tem o mesmo valor = " + n1);
			}

		}
	}                 
