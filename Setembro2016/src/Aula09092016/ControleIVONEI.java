package Aula09092016;
import java.util.Scanner;

public class ControleIVONEI {

	public static void main(String[] args) {


		do {
			CachorroIVONEI cao = new CachorroIVONEI(
					digita("Digite o nome: "), 
					digita("Digite a Raça: "), 
					digita("Digite a Dta. Nascimento: "), 
					digita("Escolha o Porte: [P]equeno [M]edio [G]rande: ").charAt(0)
					);

			System.out.println(cao.mostraDadosCachorro());
			
		} while (continuar());
	}// -------------------------------final
		// main

	private static boolean continuar() {
		if (digita("Continuar s/n: ").charAt(0) == 's')
			return true;
		return false;
	}//----------------------------------------

	static String digita(String mens) {
		Scanner e = new Scanner(System.in);
		System.out.println(mens);
		return e.nextLine();
	}// ------------------------------------

}// ---------------------------final classe
