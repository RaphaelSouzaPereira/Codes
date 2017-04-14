package Aula19092016;
import java.util.Scanner;

public class Array_e_Vetor {

	public static void main(String[] args) {
		Scanner e = new Scanner(System.in);
		int x;
		int soma=0;
		String st = "Boa Noite. Pessoal amanhã terá Feriado.";
		int vet[] = new int[10];
		
		for (int k = 0; k < 10; k++) {
			System.out.println("digite um numero: ");
			vet[k] = e.nextInt();
		}
		
		for (int k = 0; k < 10; k++) {
			soma += vet[k];
		}
		
		System.out.println("soma="+soma);

	}// --------------------final main

}// ------------------------final classe
