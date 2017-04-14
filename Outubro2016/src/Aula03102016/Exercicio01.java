package Aula03102016;

import java.util.Random;
import java.util.Scanner;

public class Exercicio01 {

	static Scanner en = new Scanner(System.in);
	static Random ra = new Random();

	static int quant = digita("quantos números serão medidos: ");
	static int numero[] = new int[quant];

	static public void main(String[] args) {

		float media = media();
		mostraAcimaMedia(media);
		
	}

	static public int digita(String mensagem) {
		System.out.println("Digite " + mensagem);
		return en.nextInt();
	}

	static public float media() {
		int media = 0;

		for (int i = 0; i < numero.length; i++) {
			numero[i] = digita("um número: ");
			media = media + numero[i];
		}
		media = ((media)/numero.length);
		
		System.out.println("Média: "+media);
		return media;
	}
	
	static public void mostraAcimaMedia(float media){
		for (int i = 0; i < numero.length; i++) {
			if (numero[i] > media) {
				System.out.println(i + "[" + numero[i] + "]");
			}
		}
	}
}
