package Aula08082016;
import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int vA, vB, aux;
		
		System.out.print("Digite vA: ");
		vA = entrada.nextInt();
		System.out.print("Digite vB: ");
		vB = entrada.nextInt();
		
		aux = vA;
		vA = vB;
		vB = aux;
		
		System.out.print("Conte�do de vA= "+vA+"\nConte�do de vB= "+vB);

	}// final do main

}// final da classe
