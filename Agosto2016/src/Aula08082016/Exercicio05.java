package Aula08082016;
import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		Scanner e = new Scanner(System.in);
		int numero;
		double soma=0;
		int tamanho = 5;

		for (int i = 0; i < tamanho; i++) {
			System.out.print("Digite n�mero:");
			numero = e.nextInt();
			soma = soma + numero;
		}

		double media = soma / tamanho;
		System.out.print("Soma= "+soma+ " M�dia= "+media);
		
	}// final do main

}// final da Classe
