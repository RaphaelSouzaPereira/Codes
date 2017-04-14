package Aula05092016;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner e = new Scanner (System.in);
		String st = "Porto Alegre";
		char   c = 'T';
		
		System.out.println("Escolha a operação + - * /:");
		c = e.next().charAt(0);
		
		System.exit(0);// finaliza a execução do programa
		
		st = e.nextLine();
		
		
		System.out.println("Sua string possui "+st.length()+" caracteres.");
		
		for (int i=0; i< st.length(); i++)
			System.out.println(st.charAt(i));
	}// final main

}// final classe
