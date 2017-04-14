package Aula05092016;
import java.util.Scanner;

public class Calculadora3 {
	static int n1, n2;
	static char operacao;

	static boolean n1Ok = false;
	static boolean n2Ok = false;
	static boolean opOk = false;

	static Scanner e = new Scanner(System.in);

	public static void main(String[] args) {
		do {
			switch (menu()) {
			case '1':
				n1 = numeroOk("n1: ");
				n1Ok = true;
				break;
			case '2':
				n2 = numeroOk("n2: ");
				n2Ok = true;
				break;
			case '3':
				recebeOperacao();
				opOk = true;
				break;
			case '4':
				mostraResultado();
				break;
			case '5':
				System.out.println("Encerrou o código.");
				System.exit(0);
				break;
			default:
				System.out.println("Erro. Opção inválida.");
			}

		} while (true);

	}// final do main

	private static int numeroOk(String d) {
		int n;
		do{
			try{
				n = Integer.parseInt(digita(d));
				break;
			}catch (Exception e) {
				System.out.println("...Erro. ");
			}
		}while(true);
		return n;
	}

	private static char menu() {
		System.out.println("\n\nMENU");
		System.out.println("1- Digite n1");
		System.out.println("2- Digite n2");
		System.out.println("3- Escolha operação");
		System.out.println("4- Mostre o resultado");
		System.out.println("5- Finaliza");
		return digita("Escolha uma opção: ").charAt(0);
	}

	private static String digita(String st) {
		System.out.print("Digite " + st);
		return e.nextLine();
	}

	private static void recebeOperacao() {
		do {
			operacao = digita("um dos operadores (+ - * /):").charAt(0);

			if (operacao != '+' && operacao != '-' && operacao != '*' && operacao != '/')
				System.out.println("...ERRO. Digite o sinal correto.");
			else
				break;

		} while (true);
	}

	private static void mostraResultado() {
		if (n1Ok && n2Ok && opOk) {
			System.out.println("....Resultado: " + realizaOperacao());
		} else
			System.out.println("...Erro. É necessário escolher os números e a operação.");
	}

	private static String realizaOperacao() {
		if (operacao == '+')
			return "" + (n1 + n2);
		if (operacao == '-')
			return "" + (n1 - n2);
		if (operacao == '*')
			return "" + (n1 * n2);

		if (n2 != 0)
			return "" + ((double)n1 / n2);
		return "...Erro. Impossível divisao por zero.";
	}

}// final da classe
