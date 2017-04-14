package Aula08082016;
import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner e = new Scanner(System.in);
		
		System.out.print("Digite v1:");
		int v1 = e.nextInt();
		System.out.print("Digite v2:");
		int v2 = e.nextInt();
		System.out.print("Digite v3:");
		int v3 = e.nextInt();
		
		double media = (double)(v1+v2+v3) / 3;
		
		System.out.println("Média= "+media);
		
	}// final do main

}// final da Classe






